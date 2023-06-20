package iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		File file = new File("src/iostreams/ashokit.txt");
		
		char[] ch = new char[(int)file.length()];

		try (FileReader fr = new FileReader(file)) {

			// Reading the data from File
			fr.read(ch);

			System.out.println("File Content Data");
			System.out.println(new String(ch));

		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}

}
