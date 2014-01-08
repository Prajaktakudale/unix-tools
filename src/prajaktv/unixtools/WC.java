package prajaktv.unixtools;

public class WC {
    String data;

    public void wc(String fileData) {
        data = fileData;
    }

    public int countLines() {
        int no_of_lines = data.split("\n").length - 1;
        return no_of_lines;
    }

    public int countCharacters() {
        int no_of_characters = data.length();
        return no_of_characters;
    }

    public int countWords() {
        int no_of_words = data.split(" ").length;
        return no_of_words;
    }
}