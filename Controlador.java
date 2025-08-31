import java.util.ArrayList;

public class Controlador {

    public Controlador(){
    }

    //Listas 
    ArrayList<Entrenador> EntrenadoresContratados = new ArrayList<>();
    ArrayList<Rutina> RutinasDisponibles = new ArrayList<>();
    ArrayList<Miembro> MiembrosInscritos = new ArrayList<>();
    
//Métodos para crear un nuevo objeto
    public String RegistrarEntrenador (String nombre, int edad, int idDelEntrenador){
        Entrenador entrenador = new Entrenador(nombre, edad, 0, false, idDelEntrenador);
        EntrenadoresContratados.add(entrenador);
        return "Se ha registardo con éxito al nuevo entrenador";
    }

    public String RegistrarMiembro (String nombre, int edad, int niveldeMembresia, int entrenadoraAsignar, int rutinaaAsignar  ){
        Miembro miembro = new Miembro(nombre, edad, niveldeMembresia, null, null);
        for (int i = 0; i<EntrenadoresContratados.size(); i++){
            if (EntrenadoresContratados.get(i).getIDdelEntrenador() == entrenadoraAsignar) {
                miembro.setEntrenador(EntrenadoresContratados.get(i));
            }
        }
        for(int i = 0; i<RutinasDisponibles.size(); i++){
            if (RutinasDisponibles.get(i).getNumerodeRutina() == rutinaaAsignar) {
                miembro.setRutina(RutinasDisponibles.get(i));
            }
        }
        MiembrosInscritos.add(miembro);
        return "Se ha registardo con éxito al nuevo miembro del gym";
    }

    public String RegistrarRutina (String nombre, int numerodeRutina, int cantidadEjercicios, String duracion){
        Rutina rutina = new Rutina(nombre, 0, numerodeRutina, cantidadEjercicios, duracion, false);
        RutinasDisponibles.add(rutina);
        return "Rutina nueva guardada con éxito";
    }

//Métodos para mostrar cosas con menos código en el main
    public ArrayList<Entrenador> MostrarEntrenadoresDisponibles () {
        ArrayList<Entrenador> EntrenadoresDisponibles = new ArrayList<>();
        for (Entrenador entrenador : EntrenadoresContratados) {
            if (entrenador.getSobrecarga() != true) {
                EntrenadoresDisponibles.add(entrenador);
            }
        }
        return EntrenadoresDisponibles;
    }

    public ArrayList<Rutina> MostrarRutinasDisponibles () {
        return RutinasDisponibles;
    }
//Métodos para hacer cambios en los datos dentro de las listas
    public void ModificarMiembrosAsigandosEntrenador () {
        for (Miembro miembro : MiembrosInscritos) {
            if (miembro.getEntrenador() != null) {
                int indexaModificar = EntrenadoresContratados.indexOf(miembro.getEntrenador());
                EntrenadoresContratados.get(indexaModificar).setMiembrosAsignados(EntrenadoresContratados.get(indexaModificar).getMiembrosAsigandos()+1);
                break;
            }
        }
    }

    public void ModificarMiembrosAsigandosRutina () {
        for (Miembro miembro : MiembrosInscritos) {
            if (miembro.getRutina() != null) {
                int indexaModificar = RutinasDisponibles.indexOf(miembro.getRutina());
                RutinasDisponibles.get(indexaModificar).setMiembrosAsignados(RutinasDisponibles.get(indexaModificar).getMiembrosAsigandos()+1);
                break;
            }
        }
    }

    public void ModificarRutinaActiva () {
        for (Miembro miembro : MiembrosInscritos) {
            if (miembro.getRutina() != null) {
                int indexaModificar = RutinasDisponibles.indexOf(miembro.getRutina());
                RutinasDisponibles.get(indexaModificar).setRutinaActiva(true);
            }
        }
    }
// Métodos para validaciones 
    public int IDUnicoEntrenador (int id) {
        int idRepetido = 0;
        for (Entrenador entrenador : EntrenadoresContratados) {
            if (entrenador.getIDdelEntrenador() == id) {
                idRepetido = 1;
            }
            else {
                idRepetido = 0;
            }
        }
        return idRepetido;
    }

    public int IDUnicoRutina (int id) {
        int idRepetido = 0;
        for (Rutina rutina : RutinasDisponibles) {
            if (rutina.getNumerodeRutina() == id) {
                idRepetido = 1;
            }
            else {
                idRepetido = 0;
            }
        }
        return idRepetido;
    }

    public int PrevioaCrearMiembro () {
        int accesopermitido = 0;
        if (EntrenadoresContratados.size() == 0 || RutinasDisponibles.size() == 0) {
            accesopermitido = 1;
        }
        else{
            accesopermitido = 0;
        }
        return accesopermitido;
    }
//Métodos para mejoras de vida reduciendo el código en el main    
    public void ReducirVelocidaddeAparicion () {
        try{Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
    }
}
