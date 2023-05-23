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
    private static Eintraege[]eintraege;
    // int size = 6 ;
    //public ArrayMap(){
        //eintraege = new Eintraege[size];}

    private Integer get_index(String key) {
        for (int i = 0; i < eintraege.length; i++) {
            if (eintraege[i].key.equals(key)) {
                return i;
            }
        }
        return null;
    }


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
    }
    @Override
    public void keys(String[] array) {
        for(int j =0; j<size(); j++){
            if(eintraege[j].value != null) {
                array[j] = eintraege[j].key;
            }
        }
    }

    @Override
    public void remove(String key) {
        for (int i = 0; i < eintraege.length; i++) {
            if (eintraege[i].key.equals(key)) {
                eintraege[i].value = null;
            }
        }
    }
}
