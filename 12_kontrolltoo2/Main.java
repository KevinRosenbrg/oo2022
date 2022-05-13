import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Sentence sentence = new Sentence("This is a test sentence", 'a');
        System.out.println("This sentence has " + sentence.countWordsInSentence() + " words."); // counts words in sentence
        System.out.println("This sentence has " + sentence.countLetterInSentence() + " selected letters."); // counts letters in sentence
        System.out.println("");
        sentence.countLetterInWord();

    }
}
