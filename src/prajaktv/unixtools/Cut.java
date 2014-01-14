package prajaktv.unixtools;


public class Cut {
    public String cutCount(String filedata, int field_no, String delimeter) {
        String words[];
        String result = "";
        int i;
        String data[] = filedata.split("\n");
        for (i = 0; i < data.length; i++) {
            words = data[i].split(delimeter);
            if (words.length <= field_no)
                result = result + "\r\n";
            else
                result = result + words[field_no - 1] + "\r\n";
        }
        return result;
    }
}
