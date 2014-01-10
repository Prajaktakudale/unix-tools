package prajaktv.unixtools;

public class Reduce {
    public void reduceSpaces(String fileData) {
        fileData = fileData.replaceAll(" +", " ");
        System.out.println(fileData);
    }
}