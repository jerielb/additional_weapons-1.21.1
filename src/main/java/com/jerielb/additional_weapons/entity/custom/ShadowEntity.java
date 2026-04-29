package com.jerielb.additional_weapons.entity.custom;

import com.jerielb.additional_weapons.entity.ModEntityTypes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import org.jetbrains.annotations.NotNull;

public class ShadowEntity extends Monster {
	public final AnimationState idleAnimationState = new AnimationState();
	private int idleAnimationTimeout = 0;
	
	public ShadowEntity(Level world) {
		this(ModEntityTypes.SHADOW, world);
	}
	public ShadowEntity(EntityType<? extends ShadowEntity> entityType, Level world) {
		super(entityType, world);
	}
	
	public static AttributeSupplier.Builder createAttributes() {
		return Monster.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 18)
				.add(Attributes.MOVEMENT_SPEED, 0.35)
				.add(Attributes.FOLLOW_RANGE, 30.0)
				.add(Attributes.ATTACK_DAMAGE, 3.0)
				;
	}
	
	public static void init() {
		BiomeModifications.addSpawn(
				BiomeSelectors.foundInOverworld().and(BiomeSelectors.excludeByKey(Biomes.MUSHROOM_FIELDS, Biomes.DEEP_DARK)),
				MobCategory.MONSTER,
				ModEntityTypes.SHADOW,
				50, 1, 2
		);
		
		SpawnPlacements.register(ModEntityTypes.SHADOW, SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkSurfaceMonstersSpawnRules);
	}
	
	public void tick() {
		super.tick();
		
		if (this.level().isClientSide()) {
			this.setupAnimationStates();
		}
	}
	
	private void setupAnimationStates() {
		if (this.idleAnimationTimeout <= 0) {
			this.idleAnimationTimeout = 60;
			this.idleAnimationState.start(this.tickCount);
		} else {
			--this.idleAnimationTimeout;
		}
	}
	
	public SoundEvent getAmbientSound() {
		return SoundEvents.ENDERMITE_AMBIENT;
	}
	
	public SoundEvent getStepSound(@NotNull BlockPos pos, @NotNull BlockState blockIn) {
		return SoundEvents.ENDERMITE_STEP;
	}
	
	public @NotNull SoundEvent getHurtSound(@NotNull DamageSource damageSource) {
		return SoundEvents.ENDERMITE_HURT;
	}
	
	public @NotNull SoundEvent getDeathSound() {
		return SoundEvents.ENDERMITE_DEATH;
	}
	
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new FloatGoal(this));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.1, false));
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 1.0F));
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 8.0F));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(1, new HurtByTargetGoal(this, new Class[]{ShadowEntity.class}).setAlertOthers(ShadowEntity.class));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true, true));
		registerCustomGoals();
	}
	
	protected void registerCustomGoals() {
	}
}
