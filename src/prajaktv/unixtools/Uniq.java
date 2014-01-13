package prajaktv.unixtools;

public class Uniq {
    public StringBuilder getUniqLines(String filedata) {
        StringBuilder result = new StringBuilder("");
        String[] lines;
        int index;
        lines = filedata.split("\n");
        result.append(lines[0]).append("\n");
        for (index = 0; index < lines.length - 1; index++) {
            if (!lines[index].equalsIgnoreCase(lines[index + 1]))
                result.append(lines[index + 1]).append("\n");
            else index++;
        }
        return result;
    }
}