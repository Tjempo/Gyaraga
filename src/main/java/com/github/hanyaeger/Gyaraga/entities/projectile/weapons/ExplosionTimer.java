package com.github.hanyaeger.Gyaraga.entities.projectile.weapons;

import com.github.hanyaeger.api.Timer;

public class ExplosionTimer extends Timer {
    Explosion explosion;

    public ExplosionTimer(Explosion explosion) {
        super(350);
        this.explosion = explosion;
        isActive();
    }

    @Override
    public void onAnimationUpdate(long l) {
        System.out.println("BOOM WEG");
        explosion.remove();
    }
}
