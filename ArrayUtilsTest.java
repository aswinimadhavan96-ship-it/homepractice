
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayUtilsTest {
    

    @Test
    public void testFindMax() {
          int[] arr = {12,5,8,20,3};
        int result = ArrayUtils.findMax(arr);
        assertEquals(20, result);
        }

    @Test
    public void testFindMin() {
        int[] arr = {12,5,8,20,3};
        int result = ArrayUtils.findMin(arr);
        assertEquals(3, result);
              
    }
    
}
