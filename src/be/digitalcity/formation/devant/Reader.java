package be.digitalcity.formation.devant;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String> lireFichier(String path) {
        List<String> personneList = new ArrayList<>();

        BufferedReader bf = null;

        try {

            bf = new BufferedReader(new FileReader(path));

            bf.readLine();

            String line;

            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personneList;
    }

}
