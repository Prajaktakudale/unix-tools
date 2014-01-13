package prajaktv.unixtools;

public class Reduce {
    public String reduceSpaces(String fileData) {
        fileData = fileData.replaceAll(" +", " ");
        return fileData;
    }
}