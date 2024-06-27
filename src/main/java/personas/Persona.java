package personas;

public abstract class Persona {
  protected String nombre;
  protected String apellido;
  protected int edad;
  protected TipoDocumento documento;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public TipoDocumento getDocumento() {
    return documento;
  }

  public void setDocumento(TipoDocumento documento) {
    this.documento = documento;
  }
}
