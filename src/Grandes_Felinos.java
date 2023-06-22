public class Grandes_Felinos extends felinos{
    private String ejemplar;

    //Constructores
    public Grandes_Felinos(){
        super();
    }
    public Grandes_Felinos(String nombre, int edad, String ejemplar) {
        super(nombre, edad);
        this.ejemplar = ejemplar;
    }

    //Setter y Getter
    public String getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(String ejemplar) {
        this.ejemplar = ejemplar;
    }

    public String toString(){
        return getNombre() + ", " + getEdad() + ", " + ejemplar;
    }
}
