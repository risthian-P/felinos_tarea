public class Gatos_domesticos extends felinos{
    private String ejemplar3;

    //constructores
    public Gatos_domesticos(){
        super();
    }
    public Gatos_domesticos(String nombre, int edad, String ejemplar3) {
        super(nombre, edad);
        this.ejemplar3 = ejemplar3;
    }

    //Setter y Getter
    public String getEjemplar3() {
        return ejemplar3;
    }

    public void setEjemplar3(String ejemplar3) {
        this.ejemplar3 = ejemplar3;
    }
    public String toString(){
        return getNombre() + ", " + getEdad() + ", " + ejemplar3;
    }
}
