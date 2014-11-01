package com.test.strategy;

import java.io.File;
import java.util.ArrayList;

public class RARCompressionStrategy implements CompressionStrategy {

	@Override
public void compressFiles(ArrayList<File> files) {
		System.out.println("RARCompressionStrategy.compressFiles()");
}
	
}
