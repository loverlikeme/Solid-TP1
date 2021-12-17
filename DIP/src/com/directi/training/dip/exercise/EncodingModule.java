package com.directi.training.dip.exercise;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule
{
	public void encode(IWriter writer, IReader reader) throws IOException
	{
		String aLine = reader.read();
		String encodedString = Base64.getEncoder().encodeToString(aLine.getBytes());
		writer.write(encodedString);
	}
}

