package prajaktv.unixtools;

public class Head {
    public void head(String filedata, String[] args) {
        int count = 10;
        if (args[0].startsWith("-")) {
            count = Integer.parseInt(args[0].substring(1));
        }
        String lines[] = filedata.split("\r\n");
        for (int line = 0; line < count; line++)
            System.out.println(lines[count]);
    }
}