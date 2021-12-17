package com.directi.training.lsp.example;

public class SquareTest {
	
    @Test
    public void testSetWidth_Square()
    {
        Rectangle rectangle = new Square();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        assertEquals(5, rectangle.getWidth());
        assertEquals(20, rectangle.getArea());
    }
}
