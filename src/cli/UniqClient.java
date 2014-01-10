package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.Uniq;

public class UniqClient {
    public static void main(String[] args) {
        Uniq lib = new Uniq();
        String filename = args[0];
        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        lib.getUniqLines(data);
    }
}
