package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.WC;

public class WcClient {
    public static void main(String[] args) {
        int no_of_lines = 0;
        int no_of_words = 0;
        int numberOfCharacters = 0;
        String filename = args[0];

        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        WC lib = new WC();

        lib.wc(data);
        no_of_lines = lib.countLines();
        numberOfCharacters = lib.countCharacters();
        no_of_words = lib.countWords();


        System.out.println(no_of_lines + "\t" + no_of_words + "\t" + numberOfCharacters);
    }
}