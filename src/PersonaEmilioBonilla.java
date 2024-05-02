public class PersonaEmilioBonilla implements Comparable<PersonaEmilioBonilla>{
    private int cedula;
    private String nombre;
    private int edad;
    private String genero;
    private String region;

    public PersonaEmilioBonilla(int cedula, String nombre, int edad, String genero, String region) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.region = region;
    }
    public PersonaEmilioBonilla() {
        this.cedula = 1727066167;
        this.nombre = "Emilio";
        this.edad = 20;
        this.genero = "HOMBRE";
        this.region = "Sierra";
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString(){
        return "\nCedula: "+cedula+"\nNombre: "+nombre+"\nEdad: "+edad+"\nGenero: "+genero+"\nRegion: "+region;
    }

    @Override
    public int compareTo(PersonaEmilioBonilla o) {
        if(edad<o.getEdad())
            return -1;
        else if(edad>o.getEdad())
            return 1;
        else
            return 0;
    }
}
