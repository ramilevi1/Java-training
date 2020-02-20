package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		// 1. define the file path we want to write
		String filename = "C:\\SDET University\\Files\\fileToWrite.txt";
		String message = " i am writing data that will be placed in a file";
		//2. create the file in java
		File file = new File(filename);
		//3. open the file
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			//4. write to the file
			fw.write(message);
			//5.close the resources.
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: cound not find file "+ filename);
			e.printStackTrace();
		} finally {
			System.out.println("closing the filewriter");
		}
		
	}

}
