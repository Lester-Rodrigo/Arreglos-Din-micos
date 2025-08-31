import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto tipo controlador
        Controlador control = new Controlador();
        //Atributos para permitir recorrer el programa
        Scanner input = new Scanner(System.in);
        int pagina;
        //Atributos para crear un entrenador
        String nombreEntrenador;
        int edadEntrenador;
        int idEntrenador;
        //Atributos para crear una rutina
        String nombreRutina;
        String duracionRutina;
        int idRutina;
        int cantidadEjerciciosRutina;
        //Atributos para crear un miembro
        String nombreMiembro;
        int edadMiembro;
        int niveldeMembresiaMiembro;
        int entrenadorMiembro;
        int rutinaMiembro;

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
            Scanner datos = new Scanner(System.in);
                System.out.println("Ingrese el nombre del nuevo entrenador (primer nombre y primer apellido): ");
                nombreEntrenador = datos.nextLine();
                System.out.println("Ingrese la edad del nuevo entrenador: ");
                edadEntrenador=(datos.nextInt());
                System.out.println("Ingrese el ID del nuevo entrenador: ");
                idEntrenador = (datos.nextInt());
                if (control.IDUnicoEntrenador(idEntrenador) != 1) {
                   System.out.println(control.RegistrarEntrenador(nombreEntrenador, edadEntrenador, idEntrenador));
                   control.ReducirVelocidaddeAparicion();
                   System.out.println("-------------------------------------------------------------"); 
                }
                else{
                    System.out.println("Este ID ya fue asigando a otro entrenador, regsitro denegado");
                    control.ReducirVelocidaddeAparicion();
                    System.out.println("-------------------------------------------------------------"); 
                }
                
                break;
        
            case 2:
            datos = new Scanner(System.in);
                System.out.println("Ingrese el nombre de la rutina nueva: ");
                nombreRutina = datos.nextLine();
                System.out.println("Ingrese la duración de la rutina nueva: ");
                duracionRutina = datos.nextLine();
                System.out.println("Ingrese la cantidad de ejercicios de la nueva rutina: ");
                cantidadEjerciciosRutina=(datos.nextInt());
                System.out.println("Ingrese el ID de la nueva rutina: ");
                idRutina = (datos.nextInt());
                if (control.IDUnicoRutina(idRutina) != 1) {
                   System.out.println(control.RegistrarRutina(nombreRutina, idRutina, cantidadEjerciciosRutina, duracionRutina));
                   control.ReducirVelocidaddeAparicion();
                   System.out.println("-------------------------------------------------------------"); 
                }
                else{
                    System.out.println("Este ID ya fue asigando a otra rutina, regsitro denegado");
                    control.ReducirVelocidaddeAparicion();
                    System.out.println("-------------------------------------------------------------"); 
                }
                
                break;

            case 3:
                if (control.PrevioaCrearMiembro() != 1) {
                    datos = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del miembro a inscribir: ");
                    nombreMiembro = datos.nextLine();
                    System.out.println("Ingrese la edad del nuevo miembro: ");
                    edadMiembro = datos.nextInt();
                    System.out.println("Ingrese el nivel de membresia del nuevo miembro: ");
                    niveldeMembresiaMiembro=(datos.nextInt());
                    System.out.println("-------------------------------------------------------------"); 
                    for (Entrenador entrenador : control.MostrarEntrenadoresDisponibles()) {
                        System.out.println(entrenador.getIDdelEntrenador() + " " + entrenador.getNombre() + "\n");
                    }
                    System.out.println("-------------------------------------------------------------"); 
                    System.out.println("Ingrese el ID del entrenador deseado: ");
                    entrenadorMiembro = (datos.nextInt());
                    System.out.println("-------------------------------------------------------------"); 
                    for (Rutina rutina : control.MostrarRutinasDisponibles()) {
                        System.out.println(rutina.getNumerodeRutina() + " " + rutina.getNombre() + "\n");
                    }
                    System.out.println("-------------------------------------------------------------"); 
                    System.out.println("Ingrese el ID de la rutina deseada: ");
                    rutinaMiembro = (datos.nextInt());
                    System.out.println(control.RegistrarMiembro(nombreMiembro, edadMiembro, niveldeMembresiaMiembro, entrenadorMiembro, rutinaMiembro));
                    control.ModificarMiembrosAsigandosEntrenador();
                    control.ModificarMiembrosAsigandosRutina();
                    control.ModificarRutinaActiva();
                    control.ReducirVelocidaddeAparicion();
                    System.out.println("-------------------------------------------------------------"); 
                }
                else {
                    System.out.println("Asegurese de tener entrenadores y rutinas ya creadas previo a registrar un nuevo miembro");
                    control.ReducirVelocidaddeAparicion();
                    System.out.println("-------------------------------------------------------------"); 
                }
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
            switch (pagina) {
                case 1:
                    do {
                        System.out.println("1. Ver hoja de datos completa: ");
                        System.out.println("2. Ver entrenador tiene a su cargo másalumnos: ");
                        System.out.println("Ingrese alguna opción (Del 1 al 2): ");
                        pagina = input.nextInt();

                     } while (pagina < 1 || pagina > 4);
                     switch (pagina) {
                        case 1:
                            
                            break;
                     
                        case 2:
                            
                            break;
                     }
                    break;
            
                case 2:
                    do {
                        System.out.println("1. Ver hoja de datos completa: ");
                        System.out.println("2. Ver entrenador tiene a su cargo másalumnos: ");
                        System.out.println("Ingrese alguna opción (Del 1 al 2): ");
                        pagina = input.nextInt();

                     } while (pagina < 1 || pagina > 4);
                     switch (pagina) {
                        case 1:
                            
                            break;
                     
                        case 2:
                            
                            break;
                     }
                    break;
                
                case 3:
                    
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
            }while (pagina != 4);
                
                break;
            case 5:
                System.exit(0);
                break;
        }
        } while (pagina != 5);
    }
}