
import java.util.*;
public class EnigmaOpgave {

    public static final String ALFABET = "abcdefghijklmnopqrstuvwxyzæøå";

    public static String krypter(String besked, int shift){
        besked = besked.toLowerCase();

        String nyBesked ="";

        for (int i = 0; i < besked.length(); i++) {
            int bogstavPosition = ALFABET.indexOf(besked.charAt(i));
            int nøgleVærdi = shift + bogstavPosition;
            if (bogstavPosition > 29) {
                bogstavPosition = bogstavPosition -29;
            }

            if (bogstavPosition < 0) {
                bogstavPosition = bogstavPosition + 29;
            }
            char nyVærdi = ALFABET.charAt(nøgleVærdi);
            nyBesked += nyVærdi;
        }
        return nyBesked;
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String besked;

        int nøgle = 0;

        System.out.print("Skriv besked der skal krypteres: ");
        besked = in.next();

        System.out.print("\n Skriv nøglen/shift: ");
        nøgle = in.nextInt();
        System.out.print("\n Den krypterede besked: " + krypter(besked, nøgle));
    }
}
