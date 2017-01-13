package test;

import com.a7mad.TwoDArrayDS;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by a7mad on 13/01/17.
 */
public class TwoDArrayDSTest {

    @Test
    public void testcase1() {
        TwoDArrayDS twoDArrayDS = new TwoDArrayDS();
        int input[][] = twoDArrayDS.getInput();
        int max = twoDArrayDS.getMaxHourglass(input);
        assertEquals(19, max);
    }
}
