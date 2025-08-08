package pageObjects;

public class StringManupulation {
	public String reverseAString(String str) {
		StringBuffer strBuffer = new StringBuffer(str);
		strBuffer.reverse();
		return strBuffer.toString();
	}
	
	
	public String removeVowels(String str) {
		String newString = str.replaceAll("(?i)[aeiuo]","");
		return newString;
	}
}
