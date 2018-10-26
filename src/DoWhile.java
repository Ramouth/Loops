import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

       Scanner se = new Scanner(System.in);

    // DO WHILE
       System.out.println("Hvor skal vi starte?");
    int y = se.nextInt();
       do {
        System.out.println("Current y: " + y);
        y = y - 1;
    } while(y > 0);
       System.out.println("Final y: "+ y);
       System.out.println();
}
}