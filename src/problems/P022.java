package problems;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), 
 * a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. 
 * Then working out the alphabetical value for each name, 
 * multiply this value by its alphabetical position in the list to obtain a name score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, 
 * which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 * 
 * @author Hai
 *
 */
public class P022 {

	public static void main(String[] args) {
		printAnswer();
	}
	
	public static void printAnswer() {
		String fileName = "p022_names.txt";
		System.out.println(getTotalOfAllNames(fileName));
	}
	
	public static long getTotalOfAllNames(String fileName) {
		String[] allNames = getAllNamesFromFile(fileName);
		long total = 0;
		
		// sort alphabetically
		Arrays.sort(allNames);
		
		// go through all names
		for (int i = 0; i < allNames.length; i++) {
			String name = allNames[i];
			int alphabeticalValue = 0;
			
			// go through letters
			for (int j = 0; j < name.length(); j++) {
				char letter = name.charAt(j);
				if (letter != '"' && Character.isLetter(letter)) {
					alphabeticalValue += (Character.getNumericValue(letter) - 9);
				}
			}
			total += (i + 1) * alphabeticalValue;
		}
		
		return total;
	}
	
	public static String[] getAllNamesFromFile(String fileName) {
		try {
	        InputStream input = P022.class.getResourceAsStream("/assets/" + fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(input));

		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String allNames = sb.toString();
			br.close();
			
			return allNames.split(",");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null; 
	}

}
