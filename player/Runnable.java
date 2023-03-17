package player;

import java.util.ArrayList;
import java.util.Scanner;

public class Runnable {

    static String tempName = "";
    static int tempType = 0;
    static int tempDuration = 0;
    static int tempVol = 0;
    static int tempLum = 0;
    static ArrayList<MediaElement> media = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("\n *** PLAYER MULTIMEDIALE DI VINCENZO*** \n");

        for (int e = 0; e < 5; e++) {
            System.out.println("\n > NUOVO FILE *** \n");
            System.out.print("Inserisci titolo: ");
            tempName = scan.nextLine();
            System.out.println("Inserisci tipo: \n 1- IMAGE, 2-VIDEO, 3-AUDIO 0-QUIT");
            tempType = scan.nextInt();
           if (tempType <= 3 && tempType >= 0) {
                if (tempType == 0) {
                    System.exit(0);
                }
                if (tempType == 1 || tempType == 2) {
                    System.out.print("Inserisci luminosità da 0 a 5:");
                    tempLum = scan.nextInt();
                }
                if (tempType == 2 || tempType == 3) {
                    System.out.print("Inserisci durata:");
                    tempDuration = scan.nextInt();
                    System.out.print("Inserisci volume:");
                    tempVol = scan.nextInt();
                }
            } else {
               System.exit(0);
           }

            switch (tempType) {
                case 1 -> media.add(new Image(tempName, tempLum));
                case 2 -> media.add(new Video(tempName, tempDuration, tempLum, tempVol));
                case 3 -> media.add(new Audio(tempName, 3, tempVol));
                case 0 -> System.exit(0);
                default -> System.out.println("Vabbè questa la duplichiamo...");
            }
            System.out.println("Ho inserito questo elemento nell'ARRAY!");


        }


       // System.out.println("\n *** INIZIO A RIPRODURRE I CONTENUTI IN ORDINE *** \n");
        int scelta = 0;
        while (true) {
            System.out.println("\n *** SCEGLI COSA RIPRODURRE (Hai 5 Elementi) 0 per uscire *** \n");
            scelta = scan.nextInt();

if (scelta > 0 && scelta <= 5) {
    switch (media.get(scelta-1).getType()) {
        case AUDIO -> Playable.play((Audio) media.get(scelta-1));
        case VIDEO -> Playable.play((Video) media.get(scelta-1));
        case IMAGE -> Image.show((Image) media.get(scelta-1));
    }} else {
        System.out.println("\n *** Grazie per aver partecipato! ***");
        System.out.println("\n *** Made with Love by Vincenzo Maiorana ***");
        System.exit(0);
    }
}        }

    }


