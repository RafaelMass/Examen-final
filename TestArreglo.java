
import com.mycompany.arreglomultiplo.Arreglo;
import com.mycompany.arreglomultiplo.ArregloMultiplo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rafa
 */
public class TestArreglo {
    Arreglo Ar = new Arreglo();
    
    @Test
    public void Test1() {
        assertArrayEquals(new int[] {21, 42, 63, 84}, Ar.arrayOfMultiples(21, 4));
    }
    
    @Test
    public void Test2() {
        assertArrayEquals(new int[] {3, 6, 9, 12, 15, 18}, Ar.arrayOfMultiples(3, 6));
    }
    
    @Test
    public void Test3() {
        assertArrayEquals(new int[] {10, 20, 30, 40, 50}, Ar.arrayOfMultiples(10, 5));
    }
    
    @Test
    public void Test4() {
        assertArrayEquals(new int[] {8, 16, 24}, Ar.arrayOfMultiples(8, 3));
    }
    @Test
    public void Test5() {
        assertArrayEquals(new int[] {32, 64, 96, 128, 160, 192}, Ar.arrayOfMultiples(32, 6));
    }
    
    @Test
    public void Test6() {
        assertArrayEquals(new int[] {15, 30, 45, 60, 75, 90, 105, 120, 135, 150}, Ar.arrayOfMultiples(15, 10));
    }
    
    @Test
    public void Test7() {
        assertArrayEquals(new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18}, Ar.arrayOfMultiples(2, 9));
    }
}
