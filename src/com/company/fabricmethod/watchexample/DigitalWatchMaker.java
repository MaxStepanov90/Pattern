package com.company.fabricmethod.watchexample;

public class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
