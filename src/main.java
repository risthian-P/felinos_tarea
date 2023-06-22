import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Grandes_Felinos grandes []= {
                new Grandes_Felinos("Carlos",8,"felino grande"),
                new Grandes_Felinos("Copo de nieve",12,"felino grande"),
                new Grandes_Felinos("tigre",10,"felino grande"),
                new Grandes_Felinos("Charlie",8,"felino grande"),
                new Grandes_Felinos("Leon",13, "felino grande")};
        Gatos_domesticos medianos []= {
                new Gatos_domesticos("Bengalí",13,"Gatos domesticos"),
                new Gatos_domesticos("Birmano", 9, "Gatos domesticos"),
                new Gatos_domesticos("Burmés", 10, "Gatos domesticos"),
                new Gatos_domesticos("Kotar", 12, "Gatos domesticos"),
                new Gatos_domesticos("Pixie", 8, "Gatos domesticos")};
        Gatos_Salvajes salvajes []= {
                new Gatos_Salvajes("Lince rojo", 2, "Felino Salvaje"),
                new Gatos_Salvajes("Ocelote", 7, "Felino Salvaje"),
                new Gatos_Salvajes("Jaguarundi", 6, "Felino Salvaje"),
                new Gatos_Salvajes("Serval", 9, "Felino Salvaje"),
                new Gatos_Salvajes("Caracal", 9, "Felino Salvaje")};
        System.out.println("Felinos grandes");
        for (int i = 0; i <= 6;i++ ){
            System.out.println(grandes[i]);
        }
        System.out.println("Felinos domesticos");
        for (int i = 0; i <= 6;i++ ){
            System.out.println(medianos[i]);
        }
        System.out.println("Felinos salvajes");
        for (int i = 0; i <= 6;i++ ){
            System.out.println(salvajes[i]);
        }
    }
}
