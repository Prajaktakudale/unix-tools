package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.Head;

public class HeadClient {
    public static void main(String[] args) {
        Head lib = new Head();
        String filename = args[1];
        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        lib.head(data, args);
    }
}
