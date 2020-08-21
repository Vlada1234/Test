import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Exersise {

	public static String reverseCase(String str) {
		char[] ch = str.toCharArray();
		char upperCase = 0;
		char lowerCase = 0;
		String s = "";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < ch.length; ++i) {
			if (Character.isLowerCase(ch[i])) {

				upperCase = Character.toUpperCase(ch[i]);
				sb.append(Character.toString(upperCase));

			} else {
				lowerCase = Character.toLowerCase(ch[i]);
				sb.append(Character.toString(lowerCase));

			}
			s = sb.toString();

		}

		return s;

	}

}