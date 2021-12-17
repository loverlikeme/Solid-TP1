package com.directi.training.ocp.example;

public class Circle extends Shape
{
    private final double _radius;

    public Circle(double radius)
    {
        _radius = radius;
    }

    public double getRadius()
    {
        return _radius;
    }
    
    public double calculateArea()
    {
    	return Math.PI * _radius * _radius;
    }
}
