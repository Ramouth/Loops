import java.util.Scanner; //importerer scanner

public class For {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in); //Starter scanner
        System.out.println("Nedtælling med For Loop"); //Vi giver besked om, hvad programmet gør
        System.out.println("Hvor skal vi starte?"); //Programmet skal vide, hvor løkken og dermed nedtællingen skal begynde
        for(int i =  se.nextInt(); i > 0; i--) { //for løkken går i gang, vores start gives ved scanner-inputtet
        System.out.println("Vi er på: " + i); //hver gang løkken har gået en omgang får vi besked om, hvor vi er
    }
        System.out.println("Så er det slut"); //Når løkken er slut printer systemet dette
}
}