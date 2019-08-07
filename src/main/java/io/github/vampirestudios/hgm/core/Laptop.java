package io.github.vampirestudios.hgm.core;

import io.github.vampirestudios.hgm.block.entity.LaptopBlockEntity;
import io.github.vampirestudios.hgm.core.operation_systems.NeonOS;

public class Laptop extends BaseDevice {

    private static Laptop instance = new Laptop();

    public static final TaskBar taskBar = new TaskBar(instance);

    public Laptop() {
        super(new LaptopBlockEntity(), new NeonOS(taskBar));
    }

}
