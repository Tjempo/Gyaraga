module waterworld {
    requires hanyaeger;

    exports com.github.hanyaeger.Gyaraga;

    opens audio;
    opens backgrounds;
    opens sprites;
    exports com.github.hanyaeger.Gyaraga.entities.buttons;
    exports com.github.hanyaeger.Gyaraga.scenes;
}
