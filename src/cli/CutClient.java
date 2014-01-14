package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.Cut;

public class CutClient {
    public static void main(String[] args) {
        Cut lib = new Cut();
        String delimeter = " ";
        int feild = 0;
        String result;
        String filename = "";
        if (args.length == 3) {
            filename = args[0];
            delimeter = args[2];
            if (args[1].startsWith("-")) {
                feild = Integer.parseInt(args[1].substring(1));
            }
        }
        if (args.length == 2) {
            filename = args[0];
            if (args[1].startsWith("-")) {
                feild = Integer.parseInt(args[1].substring(1));
                delimeter = " ";
            }
        }
        FileReader fr = new FileReader();
        String data = fr.readFile(filename);

        result = lib.cutCount(data, feild, delimeter);
        System.out.println(result);
    }
}