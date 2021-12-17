package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(SensorBack sensorBack)
    {
        while (true) {
            if (isPersonClose()) {
                sensorBack.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
