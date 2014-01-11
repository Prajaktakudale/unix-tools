package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.Sort;

public class SortClient {
    public static void main(String[] args) {
        Sort lib = new Sort();
        String filename = args[0];
        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        lib.sortData(data);
    }
}
