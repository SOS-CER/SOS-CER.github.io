import org.junit.*;
import junit.framework.TestCase;

/**
 * This program tests SomewhatSimplifiedSolitaire
 * 
 * Somewhat Simplified Solitaire Encryption and Decryption algorithm.
 * 
 * See: https://www.schneier.com/academic/solitaire/
 * 
 * @author Dr. Jason King
 *
 */
public class SomewhatSimplifiedSolitaireTest extends TestCase {

    @Test
    public void testEncrypt() {
        String deck = "1 4 7 10 13 16 19 22 25 28 3 6 9 12 15 18 21 24 27 2 5 8 11 14 17 20 23 26";
        String description = "Encrypt the message \"HELLO\"";
        String expected = "SNISY";
        String actual = SomewhatSimplifiedSolitaire.encrypt(deck, "HELLO");
        assertEquals(description, expected, actual);

        // TODO: Add Test Case
    }

    @Test
    public void testDecrypt() {
        String deck = "1 4 7 10 13 16 19 22 25 28 3 6 9 12 15 18 21 24 27 2 5 8 11 14 17 20 23 26";
        String description = "Decrypt the message \"SNISY\"";
        String expected = "HELLO";
        String actual = SomewhatSimplifiedSolitaire.decrypt(deck, "SNISY");
        assertEquals(description, expected, actual);

        // TODO: Add Test Case
    }

    @Test
    public void testMoveFirstJokerDownByOne() {
        String deck = "1 4 7 10 13 16 19 22 25 28 3 6 9 12 15 18 21 24 27 2 5 8 11 14 17 20 23 26";
        String description = "Moving Joker A down by one when Joker A "
                + "is not the last card in the deck";
        String expected = "1 4 7 10 13 16 19 22 25 28 3 6 9 12 15 18 21 24 2 27 5 8 11 14 17"
                + " 20 23 26";
        String actual = SomewhatSimplifiedSolitaire.moveFirstJokerDownOne(deck);
        assertEquals(description, expected, actual);

        deck = "27 4 7 10 13 16 19 22 25 28 3 6 9 12 15 18 21 24 1 2 5 8 11 14 17 20 23 26";
        description = "Moving Joker A down by one when Joker A is the first card in the deck";
        expected = "4 27 7 10 13 16 19 22 25 28 3 6 9 12 15 18 21 24 1 2 5 8 11 14 17 20 23 26";
        actual = SomewhatSimplifiedSolitaire.moveFirstJokerDownOne(deck);
        assertEquals(description, expected, actual);
    }

    @Test
    public void testMoveSecondJokerDownByTwo() {
        // TODO: Add Test Cases
    }

    @Test
    public void testTripleCut() {
        // TODO: Add Test Cases
    }

    @Test
    public void testMoveToBack() {
        // TODO: Add Test Cases
    }

    @Test
    public void testGetKey() {
        // TODO: Add Test Cases
    }

    @Test
    public void testShuffle() {
        // TODO: Add Test Cases
    }
}
