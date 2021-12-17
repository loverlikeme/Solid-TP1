package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader implements IReader {
	
	private String _cheminURL;
	
	public MyFileReader(String chemin)
	{
		_cheminURL = chemin;
	}
	
	@Override
	public String read() throws IOException
	{
		StringBuilder lignes = new StringBuilder();
		BufferedReader reader = new BufferedReader(new FileReader(_cheminURL));
		String ligne;
		while ((ligne = reader.readLine()) != null) {
            lignes.append(ligne);
        }
		reader.close();
		return lignes.toString() ;
	}
}
