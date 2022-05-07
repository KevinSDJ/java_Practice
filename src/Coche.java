public class Coche {
    private int puertas;
    public Coche( int ctPuerto){
        puertas+=ctPuerto;
    }
    public int getPuertas(){
       return puertas;
    }
    public void aumPuertas(){
        puertas+=1;
    }
    public void resPuertas(){
        puertas-=1;
    }
}
