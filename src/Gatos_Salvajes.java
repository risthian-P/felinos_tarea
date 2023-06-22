public class Gatos_Salvajes extends felinos{
    private String ejemplar2;

    //constructor
    public Gatos_Salvajes(){
        super();
    }
    public Gatos_Salvajes(String nombre, int edad, String ejemplar2) {
        super(nombre, edad);
        this.ejemplar2 = ejemplar2;
    }

    //Setter y Getter
    public String getEjemplar2() {
        return ejemplar2;
    }

    public void setEjemplar2(String ejemplar2) {
        this.ejemplar2 = ejemplar2;
    }
    public String toString(){
        return getNombre() + ", " + getEdad() + ", " + ejemplar2;
    }
}
