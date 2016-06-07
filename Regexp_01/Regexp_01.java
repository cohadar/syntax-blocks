import java.util.*;
import java.io.*;

/* Mighty Cohadar */
public class Regexp_01 {

	public static boolean matchAID(String line) {
		//return line.matches("i-[a-fA-F0-9]{8}");
		return line.matches("i-\\p{XDigit}{8}");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			if (matchAID(line)) {
				System.out.println(line);
			}
		}
	}

	static void debug(Object...os) {
		System.err.printf("%.65536s\n", Arrays.deepToString(os));
	}
	
}

