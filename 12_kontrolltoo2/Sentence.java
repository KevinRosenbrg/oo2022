import java.io.*;
import java.util.*;

public class Sentence {
    String sentence;
    String[] wordsList;
    char letter;

    public Sentence(String sentence, char letter) {
        this.sentence = sentence;
        this.letter = letter;
    }

    public int countWordsInSentence() {
        wordsList = sentence.split("\\s");
        return wordsList.length;
    }

    public int countLetterInSentence() {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public void countLetterInWord() throws IOException {
        // sentence is put to lowercase to correctly count letters in words
        // sentence is then split by whitespace to list so that words could be individually accessed
        List<String> wordsList = Arrays.asList(sentence.toLowerCase().split("\\s"));
        for (int i = 0; i < wordsList.size(); i++) {

            // create Letter object for each word to use the method countLetterInWord()
            Letter letter1 = new Letter(wordsList.get(i), letter);
            int count = letter1.countLetterInWord();
            System.out.println("Word '" + wordsList.get(i) + "' has " + count + " letter '" + letter + "'.");

        }

        // after the sentence has been processed, new words will be added to words.txt
        // ---------------------------------------------------------------------------------------

        // open current words in the words.txt file and and them to a list
        Scanner s = new Scanner(new File("words.txt"));
        ArrayList<String> listFromFile = new ArrayList<String>();
        while (s.hasNext()) {
            listFromFile.add(s.next());
        }
        s.close();

        // compare words.txt list words with current sentence words. Add words that aren't in the file and ignore repeated words
        List<String> wordsNew = new ArrayList<String>();
        List<String> wordsThatRepeat = new ArrayList<String>(); // collect words that repeat to display them later
        int repeatIndex;

        for (int i = 0; i < wordsList.size(); i++) {
            wordsNew.add(wordsList.get(i));
            for (int j = 0; j < listFromFile.size(); j++) {
                if (Objects.equals(listFromFile.get(j), wordsList.get(i))) { // removes correct element
                    wordsThatRepeat.add(wordsList.get(i));
                    repeatIndex = wordsList.indexOf(wordsList.get(i));
                    wordsNew.remove(repeatIndex);
                }
            }
        }

        // check all lists
        /*
        System.out.println(listFromFile);
        System.out.println(wordsList);
        System.out.println(wordsThatRepeat);
        System.out.println(wordsNew);
         */

        List<String> wordsNewFiltered = new ArrayList<String>();
        wordsNew.stream().distinct().forEach(wordsNewFiltered::add);

        // System.out.println(wordsNewFiltered);

        // add new words to file
        // start
        for (int i = 0; i < wordsNewFiltered.size(); i++) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            PrintWriter pw = null;
            try {
                fw = new FileWriter("words.txt", true);
                bw = new BufferedWriter(fw);
                pw = new PrintWriter(bw);

                pw.println(wordsNewFiltered.get(i));

                System.out.println("New word added: " + wordsNewFiltered.get(i));
                pw.flush();
            } finally {
                try {
                    pw.close();
                    bw.close();
                    fw.close();
                } catch (IOException io) {// can't do anything
                }
            }
        }
        // end

        // words that repeat catches multiple same words so .stream().distinct() sorts out only unique items in the list
        // .forEach(System.out::println) prints the value for each distinct element in the list
        List<String> wordsThatRepeatFiltered = new ArrayList<String>();
        wordsThatRepeat.stream().distinct().forEach(wordsThatRepeatFiltered::add);
        System.out.println("Words that are already in the file:");
        for (int i = 0; i < wordsThatRepeatFiltered.size(); i++) {
            System.out.println(wordsThatRepeatFiltered.get(i));
        }
    }
}
