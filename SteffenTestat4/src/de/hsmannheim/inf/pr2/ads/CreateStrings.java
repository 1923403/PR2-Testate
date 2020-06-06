package de.hsmannheim.inf.pr2.ads;

public class CreateStrings {

	public static String createStrings(int i) {
		String word = "";
		
		for (int j = 0; j < i; j++)
			word += (char) (Math.random() * 26 + 97);
		
		return word;
	}
}
