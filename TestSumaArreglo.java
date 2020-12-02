
import com.mycompany.sumaarreglo.Arreglo;
import com.mycompany.sumaarreglo.SumaArreglo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rafa
 */
public class TestSumaArreglo {
    Arreglo Arr = new Arreglo();
    
    @Test
    public void Test1() {
        assertEquals(10, Arr.sum(new int[] {1, 2, 3, 4}));
    }
    
    @Test
    public void Test2() {
        assertEquals(-3, Arr.sum(new int[] {-1, -1, -1}));
    }
    
    @Test
    public void Test3() {
        assertEquals(1, Arr.sum(new int[] {1}));
    }
    
    @Test
    public void Test4() {
        assertEquals(0, Arr.sum(new int[] {}));
    }
}
