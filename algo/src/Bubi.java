public class Bubi {
    
    public static void  rendez() {
        int[] szamok = {3, 82, 24, 17, 31};
        int n = szamok.length;
            for(int i=n-1; i>0 ; i--){
                for(int j=0; j<i; j++){
                    if(szamok[j] > szamok[j+1]){
                        int tmp = szamok[j];
                        szamok[j] = szamok[j+1];
                        szamok[j+1] = tmp;
                    }

            }
        }
        for(int szam:szamok) {
            System.out.println(szam + " ");
        }

    }
}
