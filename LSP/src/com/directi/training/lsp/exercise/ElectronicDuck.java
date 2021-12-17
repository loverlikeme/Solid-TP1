package com.directi.training.lsp.exercise;

public class ElectronicDuck implements IDuck
{
    private boolean _on = false;

    @Override
    public void quack() throws DuckIsOffException
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new DuckIsOffException("Can't quack when off");
        }
    }

    @Override
    public void swim() throws DuckIsOffException
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new DuckIsOffException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
    
    public static class DuckIsOffException extends IDuckException
    {
        public DuckIsOffException(String message)
        {
            super(message);
        }
    }

}
