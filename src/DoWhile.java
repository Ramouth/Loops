import java.util.Scanner; //importere en scanner

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Count Down i Do While Loop"); //Fortæller, hvad programmet gør

       Scanner se = new Scanner(System.in); //Laver en scanner

    // Vi forklare brugeren, at vi skal bruge et tal
       System.out.println("Hvor skal vi starte?");
    int y = se.nextInt(); //her bruger vi scanneren
       do {
        System.out.println("Tallet er: " + y); // Så længe programmet kører skal det fortælle os, hvor langt vi er
        y = y - 1; //Tallet bliver mindre hver gang løkken kører.
    } while(y > 0); //løkken slutter når vi rammer 0
       System.out.println("Nu er det slut"); //Når vi slutter får brugeren besked
}
}