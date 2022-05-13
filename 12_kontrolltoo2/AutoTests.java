import org.junit.Test;

import static org.junit.Assert.*;

public class AutoTests {

    @Test
    public void howManyLetterAinWordPere() {
        Letter letter = new Letter("pere", 'a');
        int count = letter.countLetterInWord();
        System.out.println(count);
        assertEquals(count, 0);
    }

    @Test
    public void howManyLetterPinWordPere() {
        Letter letter = new Letter("pere", 'p');
        int count = letter.countLetterInWord();
        System.out.println(count);
        assertEquals(count, 1);
    }

    @Test
    public void howManyLetterEinWordPere() {
        Letter letter = new Letter("pere", 'e');
        int count = letter.countLetterInWord();
        System.out.println(count);
        assertEquals(count, 2);
    }

    @Test
    public void howManyLetterAinSentence() {
        Sentence sentence = new Sentence("Nam id risus nec sapien lobortis feugiat", 'a');
        int countLetters = sentence.countLetterInSentence();
        System.out.println(countLetters);
        assertEquals(countLetters, 3);
    }
}
