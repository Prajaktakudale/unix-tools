package prajaktv.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqClientTest {
    @Test
    public void testForPrintUniqData() throws Exception {
        String text = "praju\npallu\npallu\npraju";
        Uniq uniq = new Uniq();
        String expected = "praju\npallu\npraju\n";

        String actual = uniq.getUniqLines(text);

        assertEquals(expected, actual);
    }

    @Test
    public void testForPrintUniqData1() throws Exception {
        String text = "praju\npraju\npallu\npallu";
        Uniq uniq = new Uniq();
        String expected = "praju\npallu\n";

        String actual = uniq.getUniqLines(text);

        assertEquals(expected, actual);
    }
}