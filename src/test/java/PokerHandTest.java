import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class PokerHandTest {

    @Disabled
    @ParameterizedTest
    @CsvSource({"Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C AH, Black"})
    void checkStripNameBlack(String input, String expected) {
        assertEquals(expected, PokerHand.stripInput(input));
    }

    @ParameterizedTest
    @CsvSource({"Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C AH, 2C 3H 4S 8C AH"})
    void checkStripFiveCardsFromWhite(String input, String expected) {
        assertEquals(expected, PokerHand.stripInput(input));
    }

}
