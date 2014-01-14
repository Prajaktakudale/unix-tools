package prajaktv.unixtools;

import junit.framework.Assert;
import org.junit.Test;

public class HeadTest {
    @Test
    public void test_give_first10Lines() throws Exception {
        String text = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\nkavita\r\nshweta\r\nkajal\r\nsamiksha\r\ntanbir";
        Head head = new Head();
        String args[]={"one.txt"};
        String expected = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\nkavita\r\nshweta\r\nkajal\r\nsamiksha\r\ntanbir\r\n";
        String actual = head.head(text,args);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGive5HeadLines() throws Exception {
        String text = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\nkavita\r\nshweta\r\nkajal\r\nsamiksha\r\ntanbir";
        Head head = new Head();
        String args[]={"-5","one.txt"};
        String expected = "prajakta\r\nsayali\r\nmanali\r\npallavi\r\nshital\r\n";
        String actual = head.head(text,args);
        Assert.assertEquals(expected, actual);
    }

}

