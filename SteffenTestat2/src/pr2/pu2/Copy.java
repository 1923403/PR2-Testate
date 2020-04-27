package pr2.pu2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Copy {

	public static void main(String[] args) {
		var in = new BufferedReader(new InputStreamReader(System.in));
		var copyFrom = "";
		var copyTo = "";

		System.out.println("Von welcher Datei soll der Text kopiert werden?");

		try {
			copyFrom = in.readLine();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}

		System.out.println("In welche Datei soll der Text kopiert werden?");

		try {
			copyTo = in.readLine();
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}

		Copy.copy(copyFrom, copyTo);
	}

	public static void copy(String copyFrom, String copyTo) {
		var fileIn = new File("tmp/" + copyFrom + ".txt");
		var fileOut = new File("tmp/" + copyTo + ".txt");
		byte[] data = null;

		try (var fis = new FileInputStream(fileIn)) {
			data = new byte[(int) fileIn.length()];
			fis.read(data);
		} catch (FileNotFoundException fe) {
			if (fileIn.isDirectory())
				System.err.println("Es handelt sich bei " + copyFrom + " um ein Verzeichnis!");
			else if (fileIn.exists())
				System.err.println("Die Datei " + copyFrom + " konnte nicht geoeffnet werden!");
			else
				System.err.println("Die Datei " + copyFrom + " konnte nicht gefunden werden!");
			System.exit(1);
		} catch (IOException ie) {
			ie.printStackTrace();
		}

		if (fileOut.exists()) {
			System.err.println("Die Datei " + copyTo + " existiert bereits!");
			System.exit(1);
		}

		try (var fos = new FileOutputStream(fileOut)) {
			fos.write(data);
		} catch (FileNotFoundException fe) {
			System.err.println("Die Datei " + copyTo + " konnte nicht erstellt werden!");
			System.exit(1);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
