public class felinos {
    private String nombre;
    private int edad;

    //constructores
    public felinos(){

    }
    public felinos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Setter y Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
