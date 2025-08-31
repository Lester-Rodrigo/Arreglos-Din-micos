public class Entrenador {
    private String nombre;
    private int edad;
    private int miembrosAsignados;
    private boolean sabrecarga;
    private int idDelEntrenador;

    public Entrenador (String nombre, int edad, int miembrosAsignados, boolean sobrecarga, int idDelEntrenador){
        this.nombre = nombre;
        this.edad = edad;
        this.miembrosAsignados = miembrosAsignados; 
        this.sabrecarga = sobrecarga;
        this.idDelEntrenador = idDelEntrenador;
    }

    public String getNombre (){
        return nombre;
    }

    public int getEdad (){
        return edad;
    }

    public int getMiembrosAsigandos (){
        return miembrosAsignados;
    }

    public boolean getSobrecarga (){
        return sabrecarga;
    }

    public int getIDdelEntrenador(){
        return idDelEntrenador;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public void setSobrecarga (boolean sabrecarga){
        this.sabrecarga = sabrecarga;
    }

    public void setMiembrosAsignados (int miembrosAsignados){
        this.miembrosAsignados = miembrosAsignados;
    }

    public void setIDdelEntrenador (int idDelEntrenador){
        this.idDelEntrenador = idDelEntrenador;
    }

    public boolean EntrenadorSobrecargado (Entrenador entrenador){
        if (entrenador.getMiembrosAsigandos() >= 15) {

            entrenador.setSobrecarga(true);
        }
        return entrenador.getSobrecarga();
    }
}
