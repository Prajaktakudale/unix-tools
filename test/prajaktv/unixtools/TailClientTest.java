package prajaktv.unixtools;

import junit.framework.Assert;
import org.junit.Test;

public class TailClientTest {
    @Test
    public void testGiveLast10LinesDefault() throws Exception {
        String text = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\nkavita\r\nshweta\r\nkajal\r\nsamiksha\r\ntanbir";
        Tail tail = new Tail();
        String args[] = {"one.txt"};
        String expected = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\nkavita\r\nshweta\r\nkajal\r\nsamiksha\r\ntanbir\r\n";

        String actual = tail.tail(text, args[0]);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGivesLast5Lines() throws Exception {
        String text = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\nkavita\r\nshweta\r\nkajal\r\nsamiksha\r\ntanbir";
        Tail tail = new Tail();
        String args[] = {"-5", "one.txt"};
        String expected = "kavita\r\nshweta\r\nkajal\r\nsamiksha\r\ntanbir\r\n";

        String actual = tail.tail(text, args[0]);

        Assert.assertEquals(expected, actual);
    }
}
