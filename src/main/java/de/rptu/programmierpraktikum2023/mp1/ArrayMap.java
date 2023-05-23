package de.rptu.programmierpraktikum2023.mp1;

public  class ArrayMap implements Map<String, Integer>{
    private static class Eintraege {
        String key;
        Integer value;
        Eintraege(String key , Integer value){
            this.key= key;
            this.value = value;
        }
    }
     // .....eintraege ist das Array mit der aktuellen Funktion bzw. den Tupeln
    private static Eintraege[]eintraege;
    // int size = 6 ;
    //public ArrayMap(){
        //eintraege = new Eintraege[size];}
 /* get_index sucht den Index eines Tupels mit dem gewünschten key aus eintraege.
        Falls der Eintrag nicht existiert, gibt get_index null zurück.
         */
    private Integer get_index(String key) {
        for (int i = 0; i < eintraege.length; i++) {
            if (eintraege[i].key.equals(key)) {
                return i;
            }
        }
        return null;
    }

//die get-Methode gibt den Funktionswert von key zurück, falls der Eintrag nicht existiert gibt sie null zurück.
    @Override
    public Integer get(String key) {
        Integer speicher = get_index(key);
        if (speicher != null) {
            return eintraege[speicher].value;
        }
        else {
            return null;
        }
    }

 /*
        Die put-Methode fügt einen neuen Eintrag (Tupel) in eintraege hinzu.
        Dabei sucht sie erst nach einem schon vorhandenen Eintrag mit dem key,
        um ihn zu überschreiben. Ansonsten muss eintraege kopiert werden, ein Array
        der größe eintraege.length + 1 erstellt werden und alle alten Einträge mit dem
        neuen zum Schluss eingefügt werden.
         */
    @Override
    public void put(String key, Integer value) {
        Integer speicher = get_index(key);
        if(speicher != null){
            eintraege[speicher].value = value;
            return;
        }
        Eintraege[] Speicher = eintraege;
        eintraege = new Eintraege[Speicher.length+1];
        for(int i=0; i< eintraege.length; i++){
            eintraege[i] = Speicher[i];
        }
        eintraege[eintraege.length-1].key = key;
        eintraege[eintraege.length-1].value = value;
    }
  // Size gibt die Länge des Arrays eintraege minus den Einträgen mit dem Wert null, da diese als gelöscht zählen.
    @Override
    public int size() {
        int zaehler = 0;
        for(int i=0; i<eintraege.length; i++){
            if(eintraege[i].value != null){
                zaehler += 1;
            }
        }
        //test if commits works
        return zaehler;
    } /*
        keys fügt die keys der Tupel in eintraege in das gewünschten Array ein,
        dabei werden wie bei remove nicht die keys mit dem Funktionswert null eingetragen,
        da diese als gelöscht zählen.
         */
    @Override
    public void keys(String[] array) {
        for(int j =0; j<size(); j++){
            if(eintraege[j].value != null) {
                array[j] = eintraege[j].key;
            }
        }
    }
// remove setzt den Wert des gewünschten keys auf null, was einer Löschung gleichkommt
    @Override
    public void remove(String key) {
        for (int i = 0; i < eintraege.length; i++) {
            if (eintraege[i].key.equals(key)) {
                eintraege[i].value = null;
            }
        }
    }
}
