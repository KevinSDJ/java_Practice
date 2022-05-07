
public class Main {
    public static void main(String[] args){
        int result= suma(10,20);
        Coche mycoche=  new Coche(1);
        mycoche.aumPuertas();
        mycoche.resPuertas();
        var puertas = mycoche.getPuertas();
        System.out.println(puertas);
        System.out.println(result);
    }
    public static int suma(int a, int b){
        return a + b;
    }

}


