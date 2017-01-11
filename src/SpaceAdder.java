
/**
 * Adds spaces between valid dictionary words in a spaceless string
 * 
 * Most of solutions on internet have solved it using recursion, i have used loop to solve it
 * Link to recursion and other way of doing it:  http://www.geeksforgeeks.org/dynamic-programming-set-32-word-break-problem/
 * 
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpaceAdder {

	static Set<String> dictionary = new HashSet<String>();

	public static void main(String[] args) {
		String s1 = "howareyou";
		String s2 = "wellknown";
		String s3 = "verywellknown";
		String s4 = "verywellwellknown";

		List<String> list = Arrays.asList("how", "are", "you", "very", "we", "well", "known");

		dictionary.addAll(list);

		String s1Output = addSpace(s1);
		String s2Output = addSpace(s2);
		String s3Output = addSpace(s3);
		String s4Output = addSpace(s4);

		System.out.println(s1Output); // "how are you"
		System.out.println(s2Output); // "well known"
		System.out.println(s3Output); // "very well known"
		System.out.println(s4Output); // "very well well known"

	}

	private static String addSpace(String s) {

		String temp = "";
		String sentence = "";
		int lastValidMark = 0;
		String lastValidWord = "";

		for (int i = 0; i < s.length(); i++) {

			temp = temp + s.charAt(i);

			if (dictionary.contains(temp)) {
				sentence = sentence + " " + temp;
				lastValidWord = temp;
				lastValidMark = i;
				temp = "";
			}

			if (i == s.length() - 1 && !compareString(s, sentence)) {
				i = lastValidMark;
				sentence = sentence.trim();

				if (sentence.lastIndexOf(" ") != -1) { // if not first word
					sentence = sentence.substring(0, sentence.lastIndexOf(" ")).trim();
				} else {
					sentence = "";
				}
				temp = lastValidWord;
			}

		}

		return sentence.trim();

	}

	private static boolean compareString(String source, String target) {

		String[] arr = target.split(" ");
		String temp = "";

		for (String s : arr) {

			String p = s.trim();
			temp = temp + p;

		}

		return source.equals(temp);

	}

}
