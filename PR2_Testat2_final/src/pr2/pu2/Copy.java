package pr2.pu2;

/**
 * @author Gruppe 25: Raphael (1926543), Steffen (1923403), Floris (1921233)
 * @brief Description: This class creates a copy of a file, reading and writing byte by byte.
 * 
 **/
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

		// user is prompted to type in filename (as a string) of source file
		System.out.println("Von welcher Datei soll der Text kopiert werden?");

		// the typed in filename is stored in "copyFrom"
		try {
			copyFrom = in.readLine();
		} catch (IOException ie) {
			System.err.println(ie.getMessage());
		}

		// user is prompted to type in filename (as a string) of file to be created and
		// copied to
		System.out.println("In welche Datei soll der Text kopiert werden?");

		// the typed in filename is stored in "copyTo"
		try {
			copyTo = in.readLine();
		} catch (IOException ie) {
			System.err.println(ie.getMessage());
		}

		// both typed in filenames, stored in copyFrom and copyTo respectively, are
		// given to the method "copy"
		Copy.copy(copyFrom, copyTo);
	}

	// the method "copy" expects two strings and uses them to create two objects of
	// type File with the strings used in the filenames
	public static void copy(String copyFrom, String copyTo) {
		var fileIn = new File("tmp/" + copyFrom + ".txt");
		var fileOut = new File("tmp/" + copyTo + ".txt");

		// error message and terminate if there already is a file with the same
		// filename
		if (fileOut.exists()) {
			System.err.println("Die Datei " + copyTo + " existiert bereits!");
			System.exit(1);
		}

		// InputStream "fis", OutputStream "fos" and storage variable "data" are
		// introduced
		try (var fis = new FileInputStream(fileIn); var fos = new FileOutputStream(fileOut)) {
			var data = 0;
			// reading, storing in "data" and writing byte by byte until end of source file
			// is reached
			while ((data = fis.read()) != -1) {
				fos.write((byte) data);
			}
			// Exception handling of various errors by printing error message and terminating
		} catch (FileNotFoundException fe) {

			// source file is a directory
			if (fileIn.isDirectory())
				System.err.println("Es handelt sich bei " + copyFrom + " um ein Verzeichnis!");

			// no access rights to source file
			else if (fileIn.exists())
				System.err.println("Die Datei " + copyFrom + " konnte nicht geoeffnet werden!");

			// source file doesn't exist
			else if (!fileIn.exists())
				System.err.println("Die Datei " + copyFrom + " konnte nicht gefunden werden!");

			// file can't be created e.g. missing rights
			else if (!fileOut.exists())
				System.err.println("Die Datei " + copyTo + " konnte nicht erstellt werden!");

			// handling unexpected FileNotFoundExceptions
			else
				System.err.println("Es ist ein unbekannter Fehler aufgetreten!");

			System.exit(1);
			
		// handling I/O-errors by printing error message and terminating
		} catch (IOException ie) {
			System.err.println(ie.getMessage());
			System.exit(1);
		}
	}
}
