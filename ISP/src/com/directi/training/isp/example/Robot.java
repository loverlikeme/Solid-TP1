package com.directi.training.isp.example;

public class Robot implements IWorker,IEater
{
    @Override
    public String work()
    {
        return "Robot works";
    }

    @Override
    public String eat()
    {
        throw new RuntimeException("Robot can't eat");
    }
}
