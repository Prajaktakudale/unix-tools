package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.Sort;

public class SortClient {
    public static void main(String[] args) {
        String sort_data;
        String reverse_data;
        Sort lib = new Sort();
        String filename = args[0];
        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        if(args.length == 2 && (0 == args[1].compareTo("-r"))){
            reverse_data = lib.reverse(data);
            System.out.println(reverse_data);
        }
        else {
            sort_data = lib.sort(data);
            System.out.println(sort_data);
        }
    }
}