package prajaktv.unixtools;

public class Head {
    public String head(String filedata, String args) {
        int count = 10;
        StringBuilder stringBuilder = new StringBuilder("");
        if (args.startsWith("-")) {
            count = Integer.parseInt(args.substring(1));
        }
        String lines[] = filedata.split("\r\n");

        if(lines.length < count){
            return filedata;
        }
        for (int line = 0; line < count; line++) {
            stringBuilder.append(lines[line]).append("\r\n");
        }
        return stringBuilder.toString();
    }
}