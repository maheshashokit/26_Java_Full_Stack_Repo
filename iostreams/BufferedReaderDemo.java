package iostreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		
		try(BufferedReader br = new BufferedReader(new FileReader("students.txt"))){
			
			String studentInformation;
			
			while((studentInformation = br.readLine()) != null) {
				System.out.println(studentInformation);//current line
				String[] stInfo = studentInformation.split(",");
				System.out.println(stInfo[0] +"-----" + stInfo[1]+"-----------" + stInfo[2] +"--------" + stInfo[3]);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
