package prajaktv.unixtools;

import junit.framework.Assert;
import org.junit.Test;

public class SortTest {
    @Test
    public void testDataIsSortingInAssendingOrder() throws Exception {
        String text = "d\r\nc\r\na";
        String expected = "a\r\nc\r\nd\r\n";

        Sort sort = new Sort();
        String result = sort.sort(text);
        String actual = result.toString();

        Assert.assertEquals(expected, actual);
    }
}
