package prajaktv.fileReader;

import java.io.BufferedReader;

public class FileReader {
    public String readFile(String filename) {
        String data = "";
        String sCurrentLine = "";
        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader(filename));
            while ((sCurrentLine = br.readLine()) != null) {
                data += sCurrentLine + "\r\n";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return data;
    }
}
