import junit.framework.TestCase;

public class ClaseCadenaTest extends TestCase {

    public void testDevuelveIniciales() {
        ClaseCadena claseCadena = new ClaseCadena();
        assertEquals("J.P.", claseCadena.DevuelveIniciales("Juan Perez"));
    }


}
