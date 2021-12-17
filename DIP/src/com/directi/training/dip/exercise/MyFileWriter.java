package com.directi.training.dip.exercise;

public class MyFileWriter implements IWriter {
	
	public MyFileWriter(String chemin)
	{
		
	}
	public void write(String encodeString) {
		MyDatabase database = new MyDatabase();
		database.write(encodeString);
	}
}
