package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    @Test
    public void agregarMascota() {
        LOG.info("Iniciando agregarMascota");
        var veterinaria = new Veterinaria("Amigos Peludos");
        var mascota = new Mascota("00000001", "Mailo", "Roedor", "Hasmter", (byte) 1, "Macho", "Cafe", 1.2);
        veterinaria.registrarMascota(mascota);
        assertTrue(veterinaria.getMascotas().contains(mascota));
        assertEquals(1, veterinaria.getMascotas().size());

        LOG.info("Finalizacion agregarMascota");
    }

    @Test
    public void datosNulos() {
        LOG.info("Inicio datosNulos");
        assertThrows(Throwable.class, () -> new Veterinaria(null));
        LOG.info("Finaizacion datosNulos");
    }

    @Test
    public void agregarMascotaRepetida() {
        LOG.info("Inicio agregarMascotaRepetida");
        var veterinaria = new Veterinaria("Amigos Peludos");
        var mascota1 = new Mascota("00000001", "Mailo", "Roedor", "Hasmter", (byte) 1, "Macho", "Cafe", 1.2);
        var mascota2 = new Mascota("00000001", "Rex", "Perro", "Criollo", (byte) 12, "Macho", "negro", 12.5);
        veterinaria.registrarMascota(mascota1);
        assertThrows(Throwable.class, () -> veterinaria.registrarMascota(mascota2));
        LOG.info("finalizacion agregar mascota repetida");
    }

    @Test
    public void obtenerMayoresDe10() {
        LOG.info("inicio obtenerMayores10");
        var veterinaria = new Veterinaria("Amigos Peludos");
        var mascota1 = new Mascota("00000001", "Mailo", "Roedor", "Hasmter", (byte) 1, "Macho", "Cafe", 0.15);
        var mascota2 = new Mascota("00000002", "Rex", "Perro", "Criollo", (byte) 12, "Macho", "negro", 12.5);
        var mascota3 = new Mascota("00000003", "Nala", "Perro", "Criollo", (byte) 6, "Hembra",
                "Blanco con manchas cafes", 9.2);
        var mascota4 = new Mascota("00000004", "Alfredo", "Ave", "Guacamayo", (byte) 30, "Macho", "Amarillo y azul",
                1.3);
        var mascota5 = new Mascota("00000006", "Aliss", "Perro", "French poodle", (byte) 10, "Hembra", "Beige", 5);

        veterinaria.registrarMascota(mascota1);
        veterinaria.registrarMascota(mascota2);
        veterinaria.registrarMascota(mascota3);
        veterinaria.registrarMascota(mascota4);
        veterinaria.registrarMascota(mascota5);

        Collection<Mascota> mascotasMayoresDe10 = new LinkedList<>();
        for (Mascota mascota : veterinaria.getmascotasMayoresDe10()) {
            if (mascota.getEdad() > 10) {
                mascotasMayoresDe10.add(mascota);
            }
        }
        System.out.println("Mascotas mayores de 10 años");
        for (Mascota mascota : mascotasMayoresDe10){
            System.out.println(mascota.getNombre());
        }
        LOG.info("finalizacion obtenerMayoresDe10 ");
    }

}
