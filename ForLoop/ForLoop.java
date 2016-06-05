import java.util.*;
import java.io.*;

/* Mighty Cohadar */
public class ForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		assert 1 <= n && n <= 10000 : "out of range, n: " + n;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scanner.nextInt();
		}
		System.out.println(sum);
	}

}

