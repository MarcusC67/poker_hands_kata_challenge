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

        // Strip out each of the 5 cards for player named Black
        String hand1 = input.substring(pos1+2, pos2-7);
        String[] parts1 = hand1.trim().split(" +"); // split on any single or multiple space

        // Strip out each of the 5 cards for player named White
        int len = input.length();
        String hand2 = input.substring(pos2+2, len);
        String[] parts2 = hand2.trim().split(" +");

        for (int i=0; i < 5; i++) {
            System.out.println("parts 2 array = " + parts2[i]);
        }

        return Arrays.toString(parts2).replace("[", "").replace("]", "").replace(",", "");

    }


}
