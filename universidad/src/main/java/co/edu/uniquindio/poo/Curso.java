package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Curso {
    private final String nombre;
    private final Collection<Estudiante> estudiantes;

    /**
     * Método constructor de la clase Curso
     * 
     * @param nombre Nombre del curso
     */
    public Curso(String nombre) {
        assert nombre != null : "El nombre no puede ser nulo";
        this.nombre = nombre;
        estudiantes = new LinkedList<>();
    }

    /**
     * Método para obtener el nombre del curso
     * 
     * @return Nombre del curso
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para agregar a un estudiante al curso
     * 
     * @param estudiante Estudiante que se desea agregar
     */
    public void registrarEstudiante(Estudiante estudiante) {
        assert validarNumeroIdentificacionExiste(estudiante.numeroIdentificacion()) == false
                : "El número de identificación ya existe.";
        estudiantes.add(estudiante);
    }

    /**
     * Método para buscar un estudiante dado el número de indicación
     * 
     * @param numeroIdenficacion Número de identificación del estudiante a buscar
     * @return Estudiante con el número de indicación indicado o null
     */
    public Estudiante getEstudiante(String numeroIdenficacion) {
        Estudiante estudianteInteres = null;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.numeroIdentificacion().equals(numeroIdenficacion)) {
                estudianteInteres = estudiante;
            }
        }
        return estudianteInteres;
    }

    /**
     * Método para obtener la colección NO modificable de los estudiantes del curso
     * 
     * @return la colección NO modificable de los estudiantes del curso
     */
    public Collection<Estudiante> getEstudiantes() {
        return Collections.unmodifiableCollection(estudiantes);
    }

    /**
     * Método privado para determinar si ya existe un estudiante registro en el
     * mismo número de identificación
     * 
     * @param numeroIdentificacion Número de identificación a buscar
     * @return Valor boolean que indica si el número de identificación ya está o no
     *         registrado.
     */
    private boolean validarNumeroIdentificacionExiste(String numeroIdentificacion) {
        boolean existe = false;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.numeroIdentificacion().equals(numeroIdentificacion)) {
                existe = true;
            }
        }

        return existe;
    }
}
