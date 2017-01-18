package CareerBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author RAVI TEJA KADIYAM
 */
public class CharacterCount {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String line;
			System.out.print("Enter String : ");
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				System.out.println("Character count for String : " );
				characterCount(line).forEach((k,v)->System.out.print(k + " : " + v + ","));
				System.out.println();
				System.out.print("Enter String : ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param str
	 * @return character count map.
	 */
	private static Map<Character, Integer> characterCount(final String str) {
		Map<Character, Integer> characterCountMap = new TreeMap<>(); // Used TreeMap to sort by keys.
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			if (characterCountMap.containsKey(key)) {
				int count = characterCountMap.get(key);
				characterCountMap.put(key, ++count);
			} else {
				characterCountMap.put(key, 1);
			}
		}
		return characterCountMap;
	}

}
