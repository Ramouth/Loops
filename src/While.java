public class While {

public static void main(String[] args) {

    // WHILE LOOP SOM COUNT DOWN
    // Vi starter vores count med 5
    int x = 5;

    // Her bruger vi et if statement, der viser at vi er i gang. Conditionen if x er over 0 betyder
    // at den vil være sand i starten af countdownet
    if(x > 0) {
        System.out.println("Nedtællingen begynder"); //Vi får informationen at vi er i gang
    }
    while(x >= 0) { // her har vi sat condition, at hvis countdownet er i gang, får vi at vide, hvor langt vi er
        System.out.println("Vi er på:" + x); // vi får infomation om, hvor langt vi er, hver gang løkken er er i gang
        x = x - 1; //Her sætter vi countdownet til at gå ned med en
        }
    System.out.println("Nedtællingen er slut"); // Vi giver besked om, at nedtællingen er slut
    }
}
