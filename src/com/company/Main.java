package com.company;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        var nf = NumberFormat.getInstance(Locale.GERMAN);
        var scan = new Scanner(System.in);


        boolean inputHasErrors = true;
        do {
            try {
                System.out.print("Geben Sie eine Zahl ein: ");
                String line = scan.next();
                // parse liefert Number-Objekt, muss in double umgewandelt werden

                Number nmb = nf.parse(line);
                double d = nmb.doubleValue();
                System.out.format("Die Zahl ist %f.", d);
                scan.close();
                inputHasErrors = false; //Es liegen keine Fehler mehr vor, alles bestens!
            } catch (ParseException e) {
                System.out.println("Ihre Eingabe war fehlerhaft. Bitte wiederholen Sie die Eingabe!");

            }
        }while(inputHasErrors);
        //Wenn ich mit der Schleife fertig bin, wird der Scanner geschlossen!
        scan.close();
    }
}
