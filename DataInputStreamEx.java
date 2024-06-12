package com.ot9.fileio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fs = new FileOutputStream("hello.txt");
		DataOutputStream dos = new DataOutputStream(fs);

		dos.writeInt(10);
	
		dos.writeUTF("vineet");

		DataInputStream dis = new DataInputStream(new FileInputStream("hello.txt"));

		System.out.println("Int : " + dis.readInt());
		System.out.println("String : " + dis.readUTF());
	}
}