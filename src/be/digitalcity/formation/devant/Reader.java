package be.digitalcity.formation.devant;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static List<String> lireFichier(String path) {
        List<String> personneList = new ArrayList<>();

        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {

            fis = new FileInputStream(path);
            FileChannel fc = fis.getChannel();
            ByteBuffer bBuff = ByteBuffer.allocate((int)fc.size());

            fc.read(bBuff);
            bBuff.flip();

            byte[] resultat = bBuff.array();

            for (int i = 0; i < resultat.length; i++) {
                if (i == 0) {
                    continue;
                }
                System.out.println((char) resultat[i]);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personneList;
    }

}
