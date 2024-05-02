import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Cola {
    PriorityQueue<PersonaEmilioBonilla> listaPersonas;
    public Cola(){
        listaPersonas = new PriorityQueue<PersonaEmilioBonilla>();
    }
    public void encolar(int cedula, String nombre, int edad, String genero, String region){
        listaPersonas.add(new PersonaEmilioBonilla());
        listaPersonas.add(new PersonaEmilioBonilla(cedula,nombre,edad,genero,region));
    }
    public PersonaEmilioBonilla desencolar()throws Exception{
        if(listaPersonas.isEmpty()) {
            throw new Exception("No hay personas ingresadas");
        } else
            return listaPersonas.poll();
    }
    public String listarPersonas()throws Exception{
        String mensaje="";
        for(PersonaEmilioBonilla p:listaPersonas){
            mensaje+=p.toString();
        }
        return mensaje;
    }
    public void validacionCedula() throws Exception{
        for(PersonaEmilioBonilla p:listaPersonas){
            if(p.getCedula()==p.getCedula())
                throw new Exception("Usuario existente");
            else
                listarPersonas();
        }
    }
    public List<PersonaEmilioBonilla> listadoPersonas(){
        List<PersonaEmilioBonilla> listaPersonas = new LinkedList<>();
        for(PersonaEmilioBonilla p:listaPersonas){
            listaPersonas.add(p);
        }
        return listaPersonas;
    }
}
