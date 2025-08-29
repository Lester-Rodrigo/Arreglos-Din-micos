import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int pagina;

        do{
        do {
        System.out.println("1. Ingresar un entrenador: ");
        System.out.println("2. Ingresar una nueva rutina: ");
        System.out.println("3. Ingresar un nuevo miembro: ");
        System.out.println("4. Ver datos actuales del gimnasio: ");
        System.out.println("5. Salir: ");
        System.out.println("Ingrese alguna opción (Del 1 al 5): ");
        pagina = input.nextInt();

        } while (pagina < 1 || pagina > 5);
        switch (pagina) {
            case 1:
                
                break;
        
            case 2:
                
                break;

            case 3:
                
                break;

            case 4:
            do{
            do {
                System.out.println("1. Ver entrenadores actuales y sus datos: ");
                System.out.println("2. Ver rutinas actuales y sus datos: ");
                System.out.println("3. Ver miembros actuales y sus datos: ");
                System.out.println("4. Salir: ");
                System.out.println("Ingrese alguna opción (Del 1 al 4): ");
                pagina = input.nextInt();

            } while (pagina < 1 || pagina > 4);
            }while (pagina != 4);
                
                break;
            case 5:
                
                break;
        }
        } while (pagina != 5);
    }
}