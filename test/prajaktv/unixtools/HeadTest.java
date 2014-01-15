package prajaktv.unixtools;

import junit.framework.Assert;
import org.junit.Test;

public class HeadTest {
    @Test
    public void test_give_first_5_lines() throws Exception {
        String text = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\nkavita\r\nshweta\r\nkajal\r\nsamiksha\r\ntanbir";
        Head head = new Head();
        String args[] = {"-5"};
        String expected = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\n";

        String actual = head.head(text, args[0]);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_gives_10_lines_defalut() throws Exception {
        String text = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\nkavita\r\nshweta\r\nkajal\r\nsamiksha\r\ntanbir";
        Head head = new Head();
        String args[] = {"one.txt"};
        String expected = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\nkavita\r\nshweta\r\nkajal\r\nsamiksha\r\ntanbir\r\n";

        String actual = head.head(text, args[0]);

        Assert.assertEquals(expected, actual);
    }
}

