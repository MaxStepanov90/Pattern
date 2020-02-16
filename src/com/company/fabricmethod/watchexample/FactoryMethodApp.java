package com.company.fabricmethod.watchexample;

public class FactoryMethodApp {
    public static void main(String[] args) {

        WatchMaker maker = getMarkerByName("R" );
        Watch watch = maker.createWatch();
        watch.showTime();
    }
    public static WatchMaker getMarkerByName(String maker){
        if (maker.equals("Digital")){
            return new DigitalWatchMaker();
        }
        else if (maker.equals("Rome")){
            return new RomeWatchMaker();
        }
        throw  new RuntimeException("Не поддерживаемая линия часов: "+maker);
    }
}

