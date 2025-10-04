import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class conv {
	
	  public static objet[] convertire_tab_obj(String filePath) {
	        // Cr�er une ArrayList pour stocker les objets lus � partir du fichier
	        ArrayList<objet> objets = new ArrayList<>();

	        try {
	            File file = new File(filePath);
	            Scanner scanner = new Scanner(file);

	            // Lire chaque ligne du fichier et cr�er un objet pour chaque ligne
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                // Supposons que le format de chaque ligne soit "objet :<index> poid <poid> val <valeur>"
	                String[] parts = line.split(" ");
	                int poid = Integer.parseInt(parts[3]);
	                int valeur = Integer.parseInt(parts[5]);
	                objet objet = new objet(valeur, poid);
	                objets.add(objet);
	            }

	            scanner.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	        // Convertir l'ArrayList en un tableau si n�cessaire
	        return objets.toArray(new objet[0]);

	       
	        
	        }
	       
	        public static Sac�dos[] convertir_tab_sac(String filePath1 ,int nbobj)   {
	        
	       // String directoryPath1 = System.getProperty("user.home") + "/Documents/fichier sacados";
	       // String filePath1 = directoryPath1 + "/sacsados.txt";
	        int [] tab_init_0= new int[nbobj];
			for(int i=0;i<nbobj;i++) {
						
				tab_init_0[i]=0;

			}
	        // Cr�er une ArrayList pour stocker les sacs lus � partir du fichier
	        ArrayList<Sac�dos> sacsList = new ArrayList<>();

	      /*  try {
	            File directory = new File(directoryPath1);
	            if (!directory.exists()) {
	                directory.mkdirs(); // Cr�er le r�pertoire s'il n'existe pas d�j�
	            }
	            */
	        try {
	            File file = new File(filePath1);
	            if (!file.exists()) {
	                // Traiter le cas o� le fichier n'existe pas
	                System.out.println("Le fichier " + filePath1 + " n'existe pas.");
	                
	            }

	            Scanner scanner = new Scanner(file);

	            // Lire chaque ligne du fichier et cr�er un objet Sac�dos pour chaque ligne
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                // Supposons que le format de chaque ligne soit "sac :<index> poids <poids>"
	                String[] parts = line.split(" ");
	                int poids = Integer.parseInt(parts[3]);
	                Sac�dos sac = new Sac�dos(poids, 0, 0, tab_init_0); // Assurez-vous d'avoir tab_init_0 initialis�
	                sacsList.add(sac);
	            }
	        
	            scanner.close();
	            }
	      //  } catch (FileNotFoundException e) {
	        //    e.printStackTrace();
	        //}
	         catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	        // Convertir l'ArrayList en un tableau si n�cessaire
	            return sacsList.toArray(new Sac�dos[0]);	   
	            /*for (int i=0;i<sacs.length;i++) {
	            System.out.println("Poids : " + sacs[i].poidsmax);
	        }*/
	        
	        }
}
