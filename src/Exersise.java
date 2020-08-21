import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Exersise {

	public static String reverseCase(String str) {
		char[] ch = str.toCharArray();
		char upperCase = 0;
		char lowerCase = 0;
		String s = "";
		String s2 = "";

		for (int i = 0; i < ch.length; ++i) {
			if (Character.isLowerCase(ch[i])) {
				upperCase = Character.toUpperCase(ch[i]);
				s = Character.toString(upperCase);
				System.out.print(s);

			} else {
				lowerCase = Character.toLowerCase(ch[i]);
				s2 = Character.toString(lowerCase);
				System.out.print(s2);

			}

		}
		return str;

	}

}