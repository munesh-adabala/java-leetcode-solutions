package first_non_repeating_char;

public class Main {

	public static void main(String[] args) {
		String input = "advdwwsee";
		System.out.println(getFirstNonRepeatingChar(input));
	}

	private static char getFirstNonRepeatingChar(String input) {
		char[] arr = new char[256];
		for (int i = 0; i < input.length(); ++i) {
			arr[input.charAt(i)]++;
		}

		for (char val : input.toCharArray()) {
			if (arr[val] == 1) {
				return val;
			}
		}
		return ' ';
	}
}
