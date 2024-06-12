package com.ot9.fileio;

import java.io.File;
import java.io.IOException;

public class FIleEx {

	public static void main(String[] args) throws IOException {
		File file = new File("info.txt");
			file.createNewFile();
		System.out.println("File created");

	}

}
