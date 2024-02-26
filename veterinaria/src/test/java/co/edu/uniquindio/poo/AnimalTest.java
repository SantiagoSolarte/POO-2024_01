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
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AnimalTest {
    private static final Logger LOG = Logger.getLogger(AnimalTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado de la prueba de datos completos");
        Animal animal = new Animal("Mailo", "Roedor", "Hamster", (byte) 2, "Macho", "Cafe", 1.2);
        assertEquals("Mailo", animal.nombre());
        assertEquals("Roedor", animal.especie());
        assertEquals("Hamster", animal.raza());
        assertEquals(2, animal.edad());
        assertEquals("Macho", animal.genero());
        assertEquals("Cafe", animal.color());
        assertEquals(1.2, animal.peso());
        LOG.info("Finalización de la prueba de datos completos");
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado de la prueba de datos nulos");
        assertThrows(Throwable.class, () -> new Animal(null, null, null, (byte) 0, null, null, 0));
        LOG.info("Finalizacion prueba datos nulos");

    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciado de la prueba de datos vacios");
        assertThrows(Throwable.class, () -> new Animal("", "", "", (byte) 0, "", "", 0));
        LOG.info("fin prueba datos vacios");

    }

    @Test
    public void datosNegativos() {
        LOG.info("Iniciando de la prueba de datos negativos");
        assertThrows(Throwable.class, () -> new Animal("Mailo", "Roedor", "Hamster", (byte) -2, "M", "Cafe", -1.2));
        LOG.info("finalizacion de la prueba de datos negativos");

    }
}
