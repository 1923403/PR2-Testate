
package pr2.pu2;

import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Floris 1921233
 * 
 * @brief This class is copied from <a href=
 *        "http://services.informatik.hs-mannheim.de/~fischer/lectures/PR1_Files/programs/MyClass.java">Jörn
 *        Fischer Website</a>.
 *        <p>
 *        It can {@link #readFile(String) read} an
 *        {@link #writeFile(String , byte[]) write} text files.
 *        </p>
 *
 */
public class Copy {

	public Copy() {

	}

	public static void main(String[] arg) throws IOException {
		Copy copy = new Copy();
		Scanner sc = new Scanner(System.in);

		// Eingabe File
		System.out.println("Geben Sie die zu kopierende Datei ein");

		String infile = new String(sc.next());

		// Ausgabe File
		System.out.println("In welche Datei soll " + infile + "kopiert werden?");
		String outfile = new String(sc.next());
		copy.copy(infile, outfile);
	}

	private void copy(String inFile, String outFile) {
		var in = new File("tmp/" + inFile + ".txt");
		var out = new File("tmp/" + outFile + ".txt");
	
		if (out.exists()) {
			System.err.println("Die Datei " + outFile + " existiert bereits!");
			System.exit(1);
		}
		try (var fis = new FileInputStream(inFile)) {
			try (var fos = new FileOutputStream(outFile)) {

				var daten = 0;

				while ((daten = fis.read()) != -1) {
					System.out.println(daten);
					fos.write((byte) daten);
					// fos.close();

				}
			}
			catch (FileNotFoundException fe) {
				fe.printStackTrace();
				System.err.println("Die Datei " + outFile + " konnte nicht erstellt werden!");
				System.exit(1);
			} 

		
		} catch (FileNotFoundException ex) {
				if (in.isDirectory())
					System.err.println("Es handelt sich bei " + inFile + " um ein Verzeichnis!");
				else if (in.exists())
					System.err.println("Die Datei " + inFile + " konnte nicht geoeffnet werden!");
				else
					System.err.println("Die Datei " + inFile + " konnte nicht gefunden werden!");
				System.exit(1);

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		
	}

}




