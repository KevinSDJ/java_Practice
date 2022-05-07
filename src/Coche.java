public class Coche {
    private int puertas;
    public Coche( int ctPuerto){
        puertas+=ctPuerto;
    }
    public void getPuertas(){
       System.out.println("Puertas :"+puertas);
    }
    public void aumPuertas(){
        puertas+=1;
    }
    public void resPuertas(){
        puertas-=1;
    }
}
