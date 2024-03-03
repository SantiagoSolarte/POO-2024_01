package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> mascotas;

    public Veterinaria(String nombre) {
        assert nombre != null : "El nombre no puede ser nulo";
        this.nombre = nombre;
        mascotas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarMascota(Mascota mascota) {
        assert validarNumeroIdentificacionExiste(mascota.numeroIdentificacion()) == false
                : "El numero de identificacion ya existe";
        mascotas.add(mascota);
    }

    public Mascota getMascota(String numeroIdentificacion) {
        Mascota mascotaInteres = null;

        for (Mascota mascota : mascotas) {
            if (mascota.numeroIdentificacion().equals(numeroIdentificacion)) {
                mascotaInteres = mascota;
            }
        }
        return mascotaInteres;
    }

    public Collection<Mascota> getMascotas() {
        return Collections.unmodifiableCollection(mascotas);
    }

    public Collection<Mascota> getmascotasMayoresDe10() {
        return Collections.unmodifiableCollection(mascotas);
    }

    private boolean validarNumeroIdentificacionExiste(String numeroIdentificacion) {
        boolean existe = false;
        for (Mascota mascota : mascotas) {
            if (mascota.numeroIdentificacion().equals(numeroIdentificacion)) {
                existe = true;
            }
        }
        return existe;
    }

}
