public class DuplicateCharacters {
	
	public static void main(String[] args) {
		
		String st ="LiriL";
		
		//converting the String into charArray
		char[] chars = st.toCharArray();

		for(int i = 0; i<chars.length ; i++) {
			
			for(int j = i + 1 ;j<chars.length; j++) {
				
				if(chars[i] == chars[j]) {					
					System.out.println("Duplicate character::::" + chars[i]);
				}
			}
		}
	}
}
