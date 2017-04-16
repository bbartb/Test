package wzorzecsingletone;


class Singletone{
    private static Singletone unikat;
    
    private Singletone(){}
    
    public static Singletone pobierz(){
        if(unikat == null)
            synchronized(Singletone.class){
                if(unikat == null)
                    unikat = new Singletone();
            }
        
        System.out.println("0.3.5");
        return unikat;
    }
}

public class WzorzecSingletone {

    public static void main(String[] args) {

        Singletone s = Singletone.pobierz();
        
    }
    
}
