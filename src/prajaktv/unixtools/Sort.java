package prajaktv.unixtools;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public String sort(String filedata) {
        String lines[] = filedata.split("\r\n");
        Arrays.sort(lines);
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            result.append(line).append("\r\n");
        }
        return result.toString();
    }

    public String reverse(String filedata) {
        String[] lines = filedata.split("\r\n");
        StringBuilder result = new StringBuilder();
        List<String> string_list = Arrays.asList(lines);
        Collections.sort(string_list);
        lines = string_list.toArray(new String[string_list.size()]);
        for (String line : lines) {
            result.append(line).append("\r\n");
        }
        return result.toString();
    }
}