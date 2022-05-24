package tema9;

public class Ejerciciot9 {
    public static void main(String [] args){
        /*----- cliente ----- */
        Cliente cliente = new Cliente();
        cliente.setNombre("nuevocliente");
        cliente.setEdad(24);
        cliente.setTelefono(003112003);
        cliente.setCredito(2000.96);
        System.out.println(cliente.getResumeclient());
        System.out.println("----------------------------");
        /*----- trabajador -----*/
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("trabajador1");
        trabajador.setEdad(30);
        trabajador.setTelefono(32032190);
        trabajador.setSalario(3000);
        System.out.println(trabajador.getResumetrabajador());




    }
}
class Person {
    private int edad;
    private String nombre;
    private long telefono;
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int nuevaedad){
        this.edad=nuevaedad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public long getTelefono(){
        return this.telefono;
    }
    public void setTelefono(long telefono){
        this.telefono=telefono;
    }
}
class Cliente extends Person{
    private double credito;
    public double getCredito(){
        return this.credito;
    }
    public void setCredito(double credito){
        this.credito=credito;
    }
    public String getResumeclient(){
        return "CLIENTE:\nNombre:\n"+this.getNombre()+",\nEdad:\n"+this.getEdad()+"\nTelefono\n"+this.getTelefono()+"\nCredito\n"+this.getCredito();
    }
}
class Trabajador extends Person{

    private long salario;
    public String getResumetrabajador(){
        return "TRABAJADOR:\nNombre:\n"+this.getNombre()+",\nEdad:\n"+this.getEdad()+"\nTelefono\n"+this.getTelefono()+"\nSalario\n"+this.getSalario();
    }
    public long getSalario(){
        return this.salario;
    }
    public void setSalario(long salario){
        this.salario=salario;
    }

}