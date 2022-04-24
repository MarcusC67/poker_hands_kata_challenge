import java.util.Arrays;

public class PokerHand {

    public PokerHand(String input) {

    }

    public static String stripInput(String input) {

        // Strip player name "Black" from input string
        int pos1 = input.indexOf(':');
        String name1 = input.substring(0, pos1);
        
        // Strip player name "White" from input string
        int pos2 = input.indexOf(':', pos1 + 1);
        String name2 = input.substring((pos2-5), pos2);

        return name1;

    }
}
