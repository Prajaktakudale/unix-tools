package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.Uniq;

public class UniqClient {
    public static void main(String[] args) {
        Uniq lib = new Uniq();
        String filename = args[0];
        String result;
        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        result = lib.getUniqLines(data);
        System.out.println(result);
    }
}