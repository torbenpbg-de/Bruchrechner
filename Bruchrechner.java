import sum.kern.*;
/**
 * Beschreiben Sie hier die Klasse Bruchrechner.
 * 
 * @author TorbenPBG 
 * @version v8.30.1
 */
public class Bruchrechner
{
    // Bezugsobjekte
    
    // Attribute
    
    //Konstruktor
    public Bruchrechner()
    {
        
    }
    
    //Dienste
    public Bruch summe(Bruch pBruch1, Bruch pBruch2)
    {
        int lZaehler, lNenner;
        
        lNenner = pBruch1.gibNenner() * pBruch2.gibNenner();
        lZaehler = pBruch1.gibZaehler() * pBruch2.gibNenner()
                + pBruch2.gibZaehler() + pBruch1.gibNenner();
        return new Bruch(lZaehler, lNenner);
    }
    
    public Bruch differnez(Bruch pBruch1, Bruch pBruch2)
    {
        int lZaehler, lNenner;
        
        lNenner = pBruch1.gibNenner() * pBruch2.gibNenner();
        lZaehler = pBruch1.gibZaehler() * pBruch2.gibNenner()
                - pBruch2.gibZaehler() + pBruch1.gibNenner();
        return new Bruch(lZaehler, lNenner);
    }
    
    public Bruch produkt(Bruch pBruch1, Bruch pBruch2)
    {
        int lZaehler, lNenner;
        
        lNenner = pBruch1.gibNenner() * pBruch2.gibNenner();
        lZaehler = pBruch1.gibZaehler() * pBruch2.gibZaehler();
        return new Bruch(lZaehler, lNenner);
    }
    
    public Bruch quotient(Bruch pBruch1, Bruch pBruch2)
    {
        int lZaehler, lNenner;
        
        lNenner = pBruch1.gibNenner() * pBruch2.gibZaehler();
        lZaehler = pBruch1.gibZaehler() * pBruch2.gibNenner();
        return new Bruch(lZaehler, lNenner);
    }

}

