package prajaktv.unixtools;

public class Head {
    public String head(String filedata, String[] args) {
        int count = 10;
        StringBuilder stringBuilder = new StringBuilder();
        if (args[0].startsWith("-")) {
            count = Integer.parseInt(args[0].substring(1));
        }
        String lines[] = filedata.split("\r\n");
        for (int line = 0; line < count; line++){
//            System.out.println("i m here" + "    " + lines[line]);
            stringBuilder.append(lines[line]).append("\r\n");
        }
//        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}