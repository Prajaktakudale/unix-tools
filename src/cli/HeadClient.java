package cli;

import prajaktv.fileReader.FileReader;
import prajaktv.unixtools.Head;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Properties;

public class HeadClient {
    public static void main(String[] args) {
        Head lib = new Head();
        String filename;
        String result;
        int defaultLines;
        String numberofrows = "-0";

        if (args.length == 2) {
            filename = args[1];
            numberofrows = args[0];
        } else
            filename = args[0];
        FileReader fr = new FileReader();
        String data = fr.readFile(filename);
        Properties headDefaultLines = new Properties();
        if (args.length == 1) {
            try {
                String configfile = System.getenv("PK_SH")+ "/config.properties";
                BufferedReader br = new BufferedReader(new java.io.FileReader(configfile));
                headDefaultLines.load(br);
                defaultLines = Integer.parseInt(headDefaultLines.getProperty("Head-Default-Lines"));
                numberofrows = "-" + defaultLines;
            } catch (IOException e) {
                numberofrows = "-10";
            }
        }
        result=lib.head(data,numberofrows);
        System.out.println(result);
    }
}