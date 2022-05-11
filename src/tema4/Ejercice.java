package tema4;

public class Ejercice {
    public static void main(String[] args){
        System.out.println("Ejemplo if ...");
        ifejempl(2);
        System.out.println("Ejemplo while ...");
        whilejempl(5);
        System.out.println("Ejemplo do while ...");
        dowhilejempl(5);
        System.out.println("Ejemplo do switch ...");
        switchejempl("jhi");

    }
    public static void ifejempl(int arg){
        if(arg>0 ){
            System.out.println("Es positivo");
        };
        if(arg<0 ){
            System.out.println("Es negativo ");
        };
        if(arg==0 ){
            System.out.println("Es 0");
        };
    }
    public static void whilejempl(int arg){
        int numeroWhile= 0;
        while (numeroWhile<arg){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }
    public static void dowhilejempl(int arg){
        int numeroWhile= arg;
        do{
            numeroWhile-=1;
            System.out.println(numeroWhile);
        }while (numeroWhile==arg);
    }
    public static void forejempl(){
        for (int numerofor=0;numerofor<3;numerofor++){
            System.out.println(numerofor);
        }
    }
    public static void switchejempl(String estacion){
        switch(estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoñp":
                System.out.println("Es otoñp");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("alguna etacion rara");
        }
    }

}
