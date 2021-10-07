public class Handphone1 {

    public int layar;
    public int camera;
    public String batre;


public static void main(String args[]){
    menelpon();
    
    int hasil = berfoto();
    System.out.println("Kualitas foto hp ini adalah "+hasil+" megapixel");
    int x = 12, y=6;
    System.out.println("Kekuatan engine nya sebesar "+engine(x, y)+" megavolt");        
}


    public static void menelpon(){ 
        int layar = 30;
        System.out.println("Sedang menelpon dengan layar hp ke "+layar);            
    }


    public static int berfoto(){
        int x = 12;
        int y = 6;
        int camera = x*y;
        return camera;
    }


    public static double engine(int x, int y){
        int camera = x;
        int batre = y;
        return batre%camera ;
    }
}