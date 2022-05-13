public class Letter {
    String word;
    char letter;
    int count = 0;

    public Letter(String word, char letter) {
        this.word = word;
        this.letter = letter;
    }

    public int countLetterInWord() {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
