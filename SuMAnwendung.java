/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author TorbenPBG
 * @version v8.30.1
 */
import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;
import sum.kern.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    
    private Bruchrechner hatBruchrechner;

    private Textfeld txtZaehler1;
    private Textfeld txtNenner1;
    private Knopf butAddi;
    private Knopf butSubt;
    private Knopf butMulti;
    private Knopf butDivi;
    private Textfeld txtZaehler2;
    private Textfeld txtNenner2;
    // private Zeichenbereich hatZeichenbereich1;
    // private Zeichenbereich hatZeichenbereich2;
    private Etikett etiZaehler;
    private Etikett etiNenner;
    // private Zeichenbereich hatZeichenbereich3;
    // private Zeichenbereich hatZeichenbereich4;
    private Knopf butEnde;

    // Attribute

    /**
     * Konstruktor
     */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(903, 540);
        
        hatBruchrechner = new Bruchrechner();

        txtZaehler1 = new Textfeld(78, 75, 97, 25, "x");
        // Ausrichtung
        txtZaehler1.setzeAusrichtung(Ausrichtung.MITTE);
        txtNenner1 = new Textfeld(77, 138, 100, 25, "y");
        // Ausrichtung
        txtNenner1.setzeAusrichtung(Ausrichtung.MITTE);
        butAddi = new Knopf(248, 66, 45, 25, "+");
        butAddi.setzeBearbeiterGeklickt("butAddiGeklickt");
        butSubt = new Knopf(248, 92, 45, 25, "-");
        butSubt.setzeBearbeiterGeklickt("butSubtGeklickt");
        butMulti = new Knopf(248, 118, 45, 25, "*");
        butMulti.setzeBearbeiterGeklickt("butMultiGeklickt");
        butDivi = new Knopf(248, 145, 45, 25, "/");
        butDivi.setzeBearbeiterGeklickt("butDiviGeklickt");
        txtZaehler2 = new Textfeld(359, 71, 100, 25, "x");
        // Ausrichtung
        txtZaehler2.setzeAusrichtung(Ausrichtung.MITTE);
        txtNenner2 = new Textfeld(359, 134, 100, 25, "y");
        // Ausrichtung
        txtNenner2.setzeAusrichtung(Ausrichtung.MITTE);

        etiZaehler = new Etikett(628, 65, 100, 25, "");
        // Ausrichtung
        etiZaehler.setzeAusrichtung(Ausrichtung.LINKS);
        etiNenner = new Etikett(628, 128, 100, 25, "");
        // Ausrichtung
        etiNenner.setzeAusrichtung(Ausrichtung.LINKS);
        butEnde = new Knopf(78, 220, 100, 25, "Ende");
        butEnde.setzeBearbeiterGeklickt("butEndeGeklickt");
    }

    /**
     * Vorher: Ereignis GeklicktvonbutAddi fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void butAddiGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
        int lZaehler1, lZaehler2, lZaehler3, lNenner1, lNenner2, lNenner3;
        Bruch lBruch1, lBruch2, lBruch3;
        
        
        lZaehler1 = txtZaehler1.inhaltAlsGanzeZahl();
        lZaehler2 = txtZaehler2.inhaltAlsGanzeZahl();
        
        lNenner1 = txtNenner1.inhaltAlsGanzeZahl();
        lNenner2 = txtNenner2.inhaltAlsGanzeZahl();
        
        lBruch1 = new Bruch(lZaehler1, lNenner1);
        lBruch2 = new Bruch(lZaehler2, lNenner2);
        
        lBruch3 = hatBruchrechner.summe(lBruch1, lBruch2);
        lZaehler3 = lBruch3.gibZaehler();
        lNenner3 = lBruch3.gibNenner();
        
        etiZaehler.setzeInhalt(lZaehler3);
        etiNenner.setzeInhalt(lNenner3);
        
    }

    /**
     * Vorher: Ereignis GeklicktvonbutSubt fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void butSubtGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
        int lZaehler1, lZaehler2, lZaehler3, lNenner1, lNenner2, lNenner3;
        Bruch lBruch1, lBruch2, lBruch3;

        
        lZaehler1 = txtZaehler1.inhaltAlsGanzeZahl();
        lZaehler2 = txtZaehler2.inhaltAlsGanzeZahl();
        
        lNenner1 = txtNenner1.inhaltAlsGanzeZahl();
        lNenner2 = txtNenner2.inhaltAlsGanzeZahl();
        
        lBruch1 = new Bruch(lZaehler1, lNenner1);
        lBruch2 = new Bruch(lZaehler2, lNenner2);
        
        lBruch3 = hatBruchrechner.differnez(lBruch1, lBruch2);
        lZaehler3 = lBruch3.gibZaehler();
        lNenner3 = lBruch3.gibNenner();
        
        etiZaehler.setzeInhalt(lZaehler3);
        etiNenner.setzeInhalt(lNenner3);
    }

    /**
     * Vorher: Ereignis GeklicktvonbutMulti fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void butMultiGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
        int lZaehler1, lZaehler2, lZaehler3, lNenner1, lNenner2, lNenner3;    
        Bruch lBruch1, lBruch2, lBruch3;        
        

        lZaehler1 = txtZaehler1.inhaltAlsGanzeZahl();
        lZaehler2 = txtZaehler2.inhaltAlsGanzeZahl();
        
        lNenner1 = txtNenner1.inhaltAlsGanzeZahl();
        lNenner2 = txtNenner2.inhaltAlsGanzeZahl();
        
        lBruch1 = new Bruch(lZaehler1, lNenner1);
        lBruch2 = new Bruch(lZaehler2, lNenner2);
        
        lBruch3 = hatBruchrechner.produkt(lBruch1, lBruch2);
        lZaehler3 = lBruch3.gibZaehler();
        lNenner3 = lBruch3.gibNenner();
        
        etiZaehler.setzeInhalt(lZaehler3);
        etiNenner.setzeInhalt(lNenner3);
    }

    /**
     * Vorher: Ereignis GeklicktvonbutDivi fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void butDiviGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
        int lZaehler1, lZaehler2, lZaehler3, lNenner1, lNenner2, lNenner3;
        
        Bruch lBruch1, lBruch2, lBruch3;
        
        lZaehler1 = txtZaehler1.inhaltAlsGanzeZahl();
        lZaehler2 = txtZaehler2.inhaltAlsGanzeZahl();
        
        lNenner1 = txtNenner1.inhaltAlsGanzeZahl();
        lNenner2 = txtNenner2.inhaltAlsGanzeZahl();
        
        lBruch1 = new Bruch(lZaehler1, lNenner1);
        lBruch2 = new Bruch(lZaehler2, lNenner2);
        
        lBruch3 = hatBruchrechner.quotient(lBruch1, lBruch2);
        lZaehler3 = lBruch3.gibZaehler();
        lNenner3 = lBruch3.gibNenner();
        
        etiZaehler.setzeInhalt(lZaehler3);
        etiNenner.setzeInhalt(lNenner3);
    }

    /**
     * Vorher: Ereignis GeklicktvonbutEnde fand statt.
     * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
     */
    public void butEndeGeklickt()
    {
        //    Schreiben Sie hier den Text ihres Dienstes
    }

}
