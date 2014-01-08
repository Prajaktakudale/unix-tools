package prajaktv.unixtools;

import prajaktv.fileReader.FileReader;

public class wcClient {
    public static void main(String[] args) {
        int no_of_lines = 0;
        int no_of_words = 0;
        int numberOfCharacters = 0;
        String filename = args[0];

        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        wc lib = new wc(data);

        no_of_lines = lib.countLines();
        numberOfCharacters = lib.countCharacters();
        no_of_words = lib.countWords();

        System.out.println(no_of_lines + "\t" + no_of_words + "\t" + numberOfCharacters);
    }
}