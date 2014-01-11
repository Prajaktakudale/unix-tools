package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.Head;

public class HeadClient {
    public static void main(String[] args) {
        Head lib = new Head();
        String filename;
        if(args.length == 2){
        filename = args[1];
        }
        else
        filename = args[0];
        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        lib.head(data, args);
    }
}
