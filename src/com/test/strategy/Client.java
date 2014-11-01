package com.test.strategy;

import java.io.File;
import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		CompressionContext ctx = new CompressionContext();
		ctx.setCompressionStrategy(new ZipCompressionStrategy());
		ArrayList<File> files = new ArrayList<File>();
		ctx.createArchive(files);
	}

}
