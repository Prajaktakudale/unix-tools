package prajaktv.unixtools;

public class Tail {
    public String tail(String filedata, String[] args) {
        int count = 10;
        StringBuilder stringBuilder = new StringBuilder();
        if (args[0].startsWith("-")) {
            count = Integer.parseInt(args[0].substring(1));
        }
        String result[] = filedata.split("\r\n");
        for (int i = result.length - count; i < result.length; i++) {
            stringBuilder.append(result[i]).append("\r\n");
        }
        return stringBuilder.toString();
    }
}