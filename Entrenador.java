public class Entrenador {
    private String nombre;
    private int edad;
    private int miembrosAsignados = 0;
    private boolean sabrecarga = false;

    public Entrenador (String nombre, int edad, int miembrosAsignados, boolean sobrecarga){
        this.nombre = nombre;
        this.edad = edad;
        this.miembrosAsignados = miembrosAsignados; 
        this.sabrecarga = sobrecarga;
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

    public void setSobrecarga (boolean sabrecarga){
        this.sabrecarga = sabrecarga;
    }

    public void setMiembrosAsignados (int miembrosAsignados){
        this.miembrosAsignados = miembrosAsignados;
    }
}
