package com.directi.training.ocp.example;

public class Square extends Shape
{
    private final double _side;

    public Square(double side)
    {
        _side = side;
    }

    public double getSide()
    {
        return _side;
    }
    
    public double calculateArea()
    {
    	return _side * _side;
    }
}
