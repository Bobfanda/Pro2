import java.util.*;
import java.lang.Math;
import static java.lang.Math.*;

class First {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Hello World!");
        //A:Nacist od uzivatele udaje o dvou studentech
        // (jmeno,prijmeni hodina,minuta)
        //I: udaje od uzivatele
        //O: promenne naplnene hodnotami



  System.out.println("Zadej krestni jmeno prvniho");
  String firstName= input.next();
        System.out.println("Zadej prijmeni prvniho");
        String surname= input.next();
  System.out.println("Zadej krestni jmeno druheho");
  String firstName2= input.next();
        System.out.println("Zadej prijmeni druheho");
        String surname2=input.next();
        System.out.println("Zadej hodinu prvniho");
 int hodina= input.nextInt();
        System.out.println("Zadej hodinu druheho");
        int hodina2= input.nextInt();
        System.out.println("Zadej minutu prvniho");
        int minute= input.nextInt();
        System.out.println("Zadej minutu druheho");
        int minute2= input.nextInt();
        //A: Zjistit, ktery student odevzdal pozdeji
        //I: Promenne z predchoziho algoritmu
        //O: Promenne s vysledkem (udaji studenta)





System.out.println("Jmeno"+ firstName+
        "\nPrijmeni:"+surname+
        "\nHodina:"+hodina+
        "\nMinuta:"+minute);
    }
}