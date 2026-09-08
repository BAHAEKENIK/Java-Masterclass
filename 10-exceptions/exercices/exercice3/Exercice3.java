import java.io.*;

public class Exercice3{
	public static void lireFichier(String nomFichier){
		try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
			String ligne = reader.readLine();
			
				System.out.println(ligne);
			
		}
		catch(FileNotFoundException e){
			System.out.println("Fichier non trouve : " + nomFichier);
		}catch(IOException e){
			System.out.println("Erreur de lecture");
		}
	}

	public static void main(String[] args){
		lireFichier("test.txt");
		
	}
}

			