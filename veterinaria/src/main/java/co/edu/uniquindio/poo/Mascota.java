package co.edu.uniquindio.poo;

public record Mascota(String numeroIdentificacion, String nombre, String especie, String raza, byte edad, String genero,
        String color, double peso) {

    public Mascota {
        assert numeroIdentificacion != null && !numeroIdentificacion.isBlank()
                : "el numero de identificacion debe ser diferente de null";
        assert nombre != null && !nombre.isBlank() : "el nombre debe ser diferente de null";
        assert especie != null && !especie.isBlank() : "La especie debe ser diferente de null";
        assert raza != null && !raza.isBlank() : "La raza debe ser diferente de null";
        assert genero != null && !genero.isBlank() : "El genero debe ser diferente de null";
        assert color != null && !color.isBlank() : "el color debe ser diferente de null";
        assert edad >= 0 : "la edad debe ser mayor a 0";
        assert peso > 0 : "El peso debe ser mayor a 0";
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}