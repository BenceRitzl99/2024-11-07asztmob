public class Rek {
    public static void kiir(int szam){
        System.out.println(szam);

        if (szam>0){
            kiir(szam-1);
    }
}

    public static void doit(){
        
       
        kiir(10);
        
    }

    
    
}