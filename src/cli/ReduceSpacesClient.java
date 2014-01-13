package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.Reduce;

public class ReduceSpacesClient {
    public static void main(String[] args) {
        Reduce lib = new Reduce();
        String result;
        String filename = args[0];
        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        result = lib.reduceSpaces(data);
        System.out.println(result);
    }
}

