package org.com;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Q_27_ReadAndWriteFile {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\JOEL\\FileOperation\\Sample\\note.txt");


		//To read the data from the file 
		List<String> readLines = FileUtils.readLines(f);
		System.out.println(readLines);
		
		FileUtils.write(f,"File Operation",true);
		
		
	}

}



