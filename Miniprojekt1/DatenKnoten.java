
/**
 * Beschreiben Sie hier die Klasse DatenKnoten.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class DatenKnoten<E>
{
    private E element; 
    private DatenKnoten<E> naechstes; 
    private DatenKnoten<E> voriges;
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen


    /**
     * Konstruktor für Objekte der Klasse DatenKnoten
     */
    public DatenKnoten(int n)
    {
        // Instanzvariable initialisieren
        if (n>1){
            naechstes = new DatenKnoten<>(n-1);
            naechstes.voriges=this;
        }
        
    }
    

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void  setElement(E element){
        this.element = element;
    }
    public E getElement() {
        return element;
    }
    public DatenKnoten<E> getNaechstes() {
        return naechstes;
    }
    public DatenKnoten<E> getVoriges() {
        return voriges;
    }
}
