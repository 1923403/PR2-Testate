package de.hsmannheim.inf.pr2.ads;

/**
 * AUFGABE 7<br>
 * <br>
 * The static method createStrings() of this class creates Strings of an
 * arbitrary length.
 * 
 * @author Gruppe 25: Floris (1921233), Raphael (1926543), Steffen (1923403)
 */
public class CreateStrings {

	public static String createStrings(int length) {
		var word = "";

		for (var i = 0; i < length; i++)
			word += (char) (Math.random() * 26 + 97);

		return word;
	}
}
