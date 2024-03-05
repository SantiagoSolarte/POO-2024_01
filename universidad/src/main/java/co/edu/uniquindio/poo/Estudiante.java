package co.edu.uniquindio.poo;

public record Estudiante(String nombres, String apellidos, String numeroIdentificacion, String telefono, String correo, int edad) {
    public Estudiante{
        assert nombres != null && nombres.isBlank(): "El nombre debe ser diferente de null";
        assert apellidos != null && apellidos.isBlank(): "El apellido debe ser diferente de null";
        assert numeroIdentificacion != null && numeroIdentificacion.isBlank(): "El numero de identificacion debe ser diferente de null";
        assert telefono != null && telefono.length() == 10: "El telefono no puede ser null";
        assert correo != null && correo.contains("@"): "El correo electronico debe contener el simbolo @";
        assert edad > 0: "La edad debe ser mayor de cero";
        



    }
    
}
