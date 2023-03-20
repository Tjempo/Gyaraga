package com.github.hanyaeger.Gyaraga.entities.projectile;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import javafx.scene.Node;

import java.util.Optional;

public abstract class Projectile extends DynamicSpriteEntity implements Collider{
    protected int damage;
    protected Coordinate2D location;

    public Projectile(String spriteDir, Coordinate2D location, int damage) {
        super(spriteDir, location);
        this.damage = damage;
    }

    public void hitMob(Mob mob) {
        mob.health -= damage;
    }

    @Override
    public Optional<? extends Node> getNode() {
        return Optional.empty();
    }
}
