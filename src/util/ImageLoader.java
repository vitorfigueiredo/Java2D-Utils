package util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImageLoader {
	
	public InputStream load(String filename) throws IOException {
		File image = new File(filename);
		FileInputStream fis = new FileInputStream(image);
		BufferedInputStream bis = new BufferedInputStream(fis);
		bis.read();
		return bis;
	}

}
