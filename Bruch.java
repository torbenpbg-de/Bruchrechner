import sum.kern.*;
/**
 * Beschreiben Sie hier die Klasse Bruch.
 * 
 * @author TorbenPBG 
 * @version v8.30.1
 */
public class Bruch
{
    //Bezugsobjekte
    
    //Attribute
    int zZaehler, zNenner;
    
    //Konstruktor
    public Bruch(int pZaehler, int pNenner)
    {
        zZaehler = pZaehler;
        zNenner = pNenner;
    }
    
    //Dienste
    public void setzeZaehler(int pZaehler)
    {
        zZaehler = pZaehler;
    }
 
    public void setzeNenner(int pNenner)
    {
        zNenner = pNenner;
    }
    
    public int gibZaehler()
    {
        return zZaehler;
    }
    
    public int gibNenner()
    {
        return zNenner;
    }
    
    public void erweitereMit(int pFaktor)
    {
        zZaehler = zZaehler * pFaktor;
        zNenner = zNenner * pFaktor;
    }
    
    public void kurezeDurch(int pTeiler)
    {
        zZaehler = zZaehler / pTeiler;
        zNenner = zNenner / pTeiler;
    }
    
    public void kurezeVollstaendig()
    {
        //folgt
    }
    
}
