import java.util.HashMap;
import java.util.Map;

public class SymetricChecker {

	private static Map<Character, Character> map = new HashMap<>();

	static {
		map.put('1', '1');
		map.put('0', '0');
		map.put('6', '9');
		map.put('8', '8');
		map.put('9', '6');
	}

	public static void main(String[] args) {
		// testcase 1: "0891680"
		// testcase 2: ""
		// testcase 3: "aa"
		// testcase 4: "1234"

		System.out.println(isSymetric("aa"));

	}

	private static final boolean isSymetric(String s) {

		if (s.length() == 0) {
			return false;
		}
		if (s.length() == 1) {
			return true;
		}

		int i = 0;
		while (i <= s.length() / 2) {
			char c = s.charAt(i);
			if (map.get(c) == null || s.charAt(s.length() - 1 - i) != map.get(c)) {
				return false;
			}
			i++;
			;
		}

		return true;

	}

}