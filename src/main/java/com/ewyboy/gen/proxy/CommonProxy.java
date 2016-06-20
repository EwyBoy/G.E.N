package com.ewyboy.gen.proxy;

import java.io.File;

/** Created by EwyBoy **/
public abstract class CommonProxy implements IProxy {

    @Override
    public void registerWorldGen() {}

    @Override
    public void registerConfiguration(File configFile) {}

    @Override
    public void registerEvents() {}
}
