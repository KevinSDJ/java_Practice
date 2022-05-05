

public class Main {
    public static void main(String[] args){
        suma(2,2);
    }
    public static String suma(int a, int b){
        int count =0;
        count++;
        if(count< a+b){
            System.out.println(count);
            suma(a,b);
        }
        System.out.println("done");
        return "Done";

    }
}


