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
        
        System.out.println("0.0.2");
        return unikat;
    }
}

public class WzorzecSingletone {

    public static void main(String[] args) {

        Singletone s = Singletone.pobierz();
        
    }
    
}
