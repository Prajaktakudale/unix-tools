package prajaktv.unixtools;

import java.util.Arrays;

public class Sort {
    public void sortData(String filedata) {
        String[] data;
        data = filedata.split("\n");
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}