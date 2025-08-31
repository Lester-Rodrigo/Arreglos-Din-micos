public class Rutina {
    private String nombre;
    private int miembrosAsignados;
    private boolean rutinaActiva; 
    private int numerodeRutina;
    private int cantidadEjercicios;
    private String duracion;

    public Rutina (String nombre, int miembrosAsignados, int numerodeRutina,int cantidadEjercicios, String duracion, boolean rutinaActiva){
        this.nombre = nombre;
        this.miembrosAsignados = miembrosAsignados;
        this.numerodeRutina = numerodeRutina; 
        this.cantidadEjercicios = cantidadEjercicios;
        this.duracion = duracion; 
        this.rutinaActiva = rutinaActiva;
    }

    public String getNombre (){
        return nombre;
    }

    public int getMiembrosAsigandos (){
        return miembrosAsignados;
    }

    public int getNumerodeRutina (){
        return numerodeRutina;
    }

    public boolean getRutinaActiva() {
        return rutinaActiva;
    }

    public int getCantidadEjercicios (){
        return cantidadEjercicios;
    }

    public String getDuración (){
        return duracion;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setMiembrosAsignados (int miembrosAsignados){
        this.miembrosAsignados = miembrosAsignados;
    }

    public void setRutinaActiva (boolean rutinaActiva){
        this.rutinaActiva = rutinaActiva;
    }

    public void setNumerodeRutina (int numerodeRutina){
        this.numerodeRutina = numerodeRutina;
    }

    public void setCantidadEjercicios (int cantidadEjercicios){
        this.cantidadEjercicios = cantidadEjercicios;
    }

    public void setDuracion (String duracion){
        this.duracion = duracion;
    }

}
