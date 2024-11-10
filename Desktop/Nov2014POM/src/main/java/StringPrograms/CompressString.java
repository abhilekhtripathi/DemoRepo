package StringPrograms;

public class CompressString {
	public static void main(String[] args) {
		String s = "aabbbcccddd";
		char[] c = s.toCharArray(); // change string in character array
		int count = 1;

		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
			} else {
				System.out.print(c[i] + "" + count);
				count = 1;
			}
		}
	}
}