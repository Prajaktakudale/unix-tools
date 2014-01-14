package prajaktv.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceSpacesClientTest {
    @Test
    public void test_for_reducing_more_than_one_speces() throws Exception {
        String text = "praja  kta\npall  avi";
        Reduce reduce = new Reduce();
        String expected = "praja kta\npall avi";
        String actual = reduce.reduceSpaces(text);
        assertEquals(expected, actual);
    }
}