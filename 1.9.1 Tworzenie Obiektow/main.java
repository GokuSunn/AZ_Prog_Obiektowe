
class main {

    static MojeDane mojeDane; 
    static Kolo kolo;    
    
    public static void main(String [] args)
    {        
        init();        
        System.out.println(mojeDane.toString());

        Logowanie lg = new Logowanie();
        System.out.println(lg.toString()); 
        
        Kolo k1 = new Kolo();
        System.out.println(k1.pole());
        System.out.println(k1.obwod());

        Kolo k2 = new Kolo();        
        System.out.println(k2.pole());
        System.out.println(k2.obwod());
        
    }

    private static void init()
    {
        mojeDane = new MojeDane();
        mojeDane.imie = "Adrian";
        mojeDane.nazwisko = "Ziębowski";
        mojeDane.klasa = "2PTN";       
    }
}