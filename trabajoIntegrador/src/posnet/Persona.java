package posnet;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    public Persona(String dni, String nombre, String apellido, String telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "\nTitular:" + "\nDNI: " + dni + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nTelefono: " + telefono + "\nMail: " + mail;
    }
}
