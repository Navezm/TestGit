package be.digitalcity.formation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


    }
    public List dictionnaire(){
        List<String> dictonnaire = new ArrayList<>();
        dictonnaire.add("bonjour");
        dictonnaire.add("moto");
        dictonnaire.add("velo");
        dictonnaire.add("voiture");
        return dictonnaire;
    }
    public int genererMot(){
        return new Random().nextInt(dictionnaire().size());
    }
    public void parcourirMot(String motATrouver, char caractereEntrer,List lettreTrouver, int indice){
        //((String)dictionnaire().get(i)).length()
        for (int i = 0; i < motATrouver.length(); i++) {
            if(motATrouver.charAt(i)==caractereEntrer){
                placerLettre(motATrouver.charAt(i), i);
            }
        }
    }
    public void placerLettre(char lettre, int indice){
    }

    public void afficherMot(List mot) {

        System.out.println("Hehe");
    }



}
