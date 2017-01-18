package CareerBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author RAVI TEJA KADIYAM
 */
public class ReverseString {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String line;
			System.out.print("Enter String : ");
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				System.out.println("Reverse String : " + reverseString(line));
				System.out.print("Enter String : ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param string
	 * @return reverse string
	 */
	private static String reverseString(final String str) {
		char[] charArray = str.toCharArray();
		int lastIndex = charArray.length - 1;
		for (int i = 0; i < charArray.length/2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[lastIndex - i];
			charArray[lastIndex - i] = temp;
		}
		return new String(charArray);
	}

}
