package tema8;

public class Ejercicio {
    public static void main (String[] args){
        var mypersona = new Person();
        mypersona.setNombre("kevin");
        mypersona.setEdad(25);
        mypersona.setTelefono(03243);
        mypersona.getNombre();
        mypersona.getEdad();
        mypersona.getTelefono();
    }
}
class Person {
    private int edad;
    private String nombre;
    private int telefono;
    public void setNombre(String arg){
        this.nombre=arg;
    }
    public void getNombre(){
        System.out.println(this.nombre);
    }
    public void setEdad(int arg){
        this.edad=arg;
    }
    public void getEdad(){
        System.out.println(this.edad);
    }
    public void setTelefono(int arg){
        this.telefono=arg;
    }
    public void getTelefono(){
        System.out.println(this.telefono);
    }

}
