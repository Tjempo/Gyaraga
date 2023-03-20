package com.github.hanyaeger.Gyaraga.entities.mobs;

import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import javafx.scene.Node;

import java.util.Optional;

public abstract class Mob extends DynamicSpriteEntity implements Collided{
    protected Coordinate2D location;
    public int health;
    protected Projectile weapon;

    public Mob(String spriteDir, Coordinate2D location, int health, Projectile weapon) {
        super(spriteDir, location);
        this.health = health;
        this.weapon = weapon;
    }

    public abstract void shootProjectile();

    @Override
    public void onCollision(Collider collider) {
        ((Projectile)collider).hitMob(this);
    }

    @Override
    public Optional<? extends Node> getNode() {
        return Optional.empty();
    }
}
