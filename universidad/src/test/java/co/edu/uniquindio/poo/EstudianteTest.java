/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado pureba datos completos");
        Estudiante estudiante = new Estudiante("Santiago", "Solarte", "1059355828", "3217651592", "santiago.solartet@uqvirtual.edu.co", 18);
        assertEquals("Santiago", estudiante.nombres());
        assertEquals("Solarte", estudiante.apellidos());
        assertEquals("1059355828", estudiante.numeroIdentificacion());
        assertEquals("3217651592", estudiante.telefono());
        assertEquals("santiago.solartet@uqvirual.edu.co", estudiante.correo());
        assertEquals(18, estudiante.edad());
        
        LOG.info("Finalizando prueba datos completos");
    }
    @Test
    public void datosNulos(){
        LOG.info("Inicio datosNulos");
        assertThrows(Throwable.class, ()-> new Estudiante(null, null, null, null, null, 0));
        LOG.info("Finalizacion datosNulos");
    }
    @Test
    public void datosVacios(){
        LOG.info("Inicio datosVacios");
        assertThrows(Throwable.class, ()-> new Estudiante("", "", "", "", "", 0));
        LOG.info("Finalizacion datosVAcios");

    }
    @Test
    public void datosNegativos(){
        LOG.info("Inicio datosNegativos");
        assertThrows(Throwable.class, ()-> new Estudiante("Santiago", "Solarte", "1059355828", "3217651592", "santiago.solartet@uqvirtual.edu.co", -18)  );
        LOG.info("Finalizacion datosNegativos");
    }
    @Test
    public void correoInvalido(){
        LOG.info("Inicio correoInvalido");
        assertThrows(Throwable.class,()-> new Estudiante("Santiago", "Solarte", "1059355828", "3217651592", "santiago.solartet", 18));
        LOG.info("Finalizacion correoInvalido");
    }
    
}
