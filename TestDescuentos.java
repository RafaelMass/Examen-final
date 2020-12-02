
import com.mycompany.encuentradescuento.EncuentraDescuento;
import com.mycompany.encuentradescuento.Descuentos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rafa
 */
public class TestDescuentos {
    Descuentos des = new Descuentos();
    
    @Test
    public void Test1 () {
        assertEquals(25, des.discount(100, 75));
    }
    
    @Test
    public void Test2 () {
        assertEquals(105.5, des.discount(211, 50));
    }
    
    @Test
    public void Test3 () {
        assertEquals(231.27, des.discount(593, 61));
    }
    
    @Test
    public void Test4 () {
        assertEquals(338.6, des.discount(1693, 80));
    }
    
    @Test
    public void Test5 () {
        assertEquals(630, des.discount(700, 10));
    }
}
