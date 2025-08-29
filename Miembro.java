public class Miembro {
    private String nombre;
    private int edad;
    private int niveldeMembresia;
    private Entrenador entrenador;
    private Rutina rutina;

    public Miembro (String nombre, int edad, int niveldeMembresía, Entrenador entrenador, Rutina rutina) {
        this.nombre = nombre;
        this.edad = edad;
        this.niveldeMembresia = niveldeMembresía;
        this.entrenador = entrenador;
        this.rutina = rutina;
    }

    public String getNombre (){
        return nombre;
    }

    public int getEdad (){
        return edad;
    }

    public int getNiveldeMembresia (){
        return niveldeMembresia;
    }

    public Entrenador getEntrenador (){
        return entrenador;
    }

    public Rutina getRutina (){
        return rutina;
    }

    public void setNiveldeMembresia (int niveldeMembresia){
        this.niveldeMembresia = niveldeMembresia;
    }

    public void setEntrenador (Entrenador entrenador){
        this.entrenador = entrenador;
    }

    public void setRutina (Rutina rutina){
        this.rutina = rutina;
    }
}
