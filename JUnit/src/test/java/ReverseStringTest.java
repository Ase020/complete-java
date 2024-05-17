import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
        ReverseString reverseString = new ReverseString();

    @Test
    void reverseString_oneWord() {
        assertEquals("asabmom", reverseString.reverseString("mombasa"));
        assertEquals("neilA", reverseString.reverseString("Alien"));
    }

    @Test
    void reverseString_multipleWords(){
        assertEquals("emosewa si asabmom", reverseString.reverseString("mombasa is awesome"));
    }
}