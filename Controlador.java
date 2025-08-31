import java.util.ArrayList;

public class Controlador {

    public Controlador(){
    }

    //Listas 
    private ArrayList<Entrenador> EntrenadoresContratados = new ArrayList<>();
    private ArrayList<Rutina> RutinasDisponibles = new ArrayList<>();
    private ArrayList<Miembro> MiembrosInscritos = new ArrayList<>();
    
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

        int indexaModificar = RutinasDisponibles.indexOf(miembro.getRutina());
        RutinasDisponibles.get(indexaModificar).setMiembrosAsignados(RutinasDisponibles.get(indexaModificar).getMiembrosAsigandos()+1);
        
        int indexaModificar2 = EntrenadoresContratados.indexOf(miembro.getEntrenador());
        EntrenadoresContratados.get(indexaModificar2).setMiembrosAsignados(EntrenadoresContratados.get(indexaModificar2).getMiembrosAsigandos()+1);
        miembro.getEntrenador().EntrenadorSobrecargado(miembro.getEntrenador());
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

    public ArrayList<Miembro> MostrarMiembrosActuales () {
        return MiembrosInscritos;
    }

    public String EntrenadorFavorito () {
        int entrenadorFavorito = 0;
        String entrenadorFavoritoNombre = null;
        for (Entrenador entrenador : EntrenadoresContratados) {
            int entrenadoraEvaluar = entrenador.getMiembrosAsigandos();
            if (entrenadoraEvaluar > entrenadorFavorito) {
                entrenadorFavorito = entrenadoraEvaluar;
                entrenadorFavoritoNombre = entrenador.getNombre();
            }
        }
        return ("El entrenador favoriro es: " + entrenadorFavoritoNombre + " con "+ entrenadorFavorito + " miembros asignados");
    }

    public String RutinaFavorito () {
        int rutinaFavorita = 0;
        String rutinaFavoritaNombre = null;
        for (Rutina rutina : RutinasDisponibles) {
            int rutinaaEvaluar = rutina.getMiembrosAsigandos();
            if (rutinaaEvaluar > rutinaFavorita) {
                rutinaFavorita = rutinaaEvaluar;
                rutinaFavoritaNombre = rutina.getNombre();
            }
        }
        return ("La rutina favorira es: " + rutinaFavoritaNombre + " con "+ rutinaFavorita + " miembros asignados");
    }

    public int RutinasEnUso () {
        int rutinasenFuncionamiento = 0;
        for (Rutina rutina : RutinasDisponibles){
            if (rutina.getRutinaActiva() == true) {
                rutinasenFuncionamiento += 1;
            }
        }
        return rutinasenFuncionamiento;
    }
//Métodos para hacer cambios en los datos dentro de las listas
    public void ModificarMiembrosAsigandosEntrenador () {
        for (Miembro miembro : MiembrosInscritos) {
            if (miembro.getEntrenador() != null) {
                int indexaModificar = EntrenadoresContratados.indexOf(miembro.getEntrenador());
                EntrenadoresContratados.get(indexaModificar).setMiembrosAsignados(EntrenadoresContratados.get(indexaModificar).getMiembrosAsigandos()+1);
                
            }
        }
    }

    public void ModificarMiembrosAsigandosRutina () {
        for (Miembro miembro : MiembrosInscritos) {
            if (miembro.getRutina() != null) {
                int indexaModificar = RutinasDisponibles.indexOf(miembro.getRutina());
                RutinasDisponibles.get(indexaModificar).setMiembrosAsignados(RutinasDisponibles.get(indexaModificar).getMiembrosAsigandos()+1);
                
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
