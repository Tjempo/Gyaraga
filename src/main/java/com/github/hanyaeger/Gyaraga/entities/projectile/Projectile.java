package com.github.hanyaeger.Gyaraga.entities.projectile;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import javafx.scene.Node;

import java.util.Optional;

public class Projectile extends DynamicSpriteEntity implements Collider{
    protected int damage;
    protected int speed;

    public Projectile(String spriteDir, int damage, int speed) {
        super(spriteDir, new Coordinate2D(-50, -50));
        this.damage = damage;
        this.speed = speed;
    }

    public void hitMob(Mob mob) {
        mob.health -= damage;
    }

    @Override
    public Optional<? extends Node> getNode() {
        return Optional.empty();
    }

    public void shoot(Coordinate2D location){
        this.setAnchorLocation(location);
        setMotion(speed, getDirection());
    }

    @Override
    public String toString() {
        return "Projectile{" +
                "damage=" + damage +
                ", speed=" + speed +
                '}';
    }
}
