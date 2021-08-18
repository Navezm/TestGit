package be.digitalcity.formation.devant;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<Personne> lireFichier(String path) {
        List<Personne> personneList = new ArrayList<>();

        BufferedReader bf = null;

        try {

            bf = new BufferedReader(new FileReader(path));

            bf.readLine();

            String line;

            while ((line = bf.readLine()) != null) {
                String[] tab = line.split(",");
                Personne personne = new Personne(Long.parseLong(tab[0]), tab[1], tab[2], tab[3], tab[4]);
                personneList.add(personne);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personneList;
    }

}
