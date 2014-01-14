package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.Tail;

public class TailClient {
    public static void main(String[] args) {
        Tail lib = new Tail();
        String filename;
        if (args.length == 2) {
            filename = args[1];
        } else
            filename = args[0];
        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        lib.tail(data, args);
    }
}