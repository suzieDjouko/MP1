package de.rptu.programmierpraktikum2023.mp1;

import java.util.Comparator;

public class TreeMap<K,V> implements Map<K, V> {
    private Baumknoten<K,V> Wurze;
    private  Comparator<K> comparator;

   public TreeMap(Comparator<K> comparator){
       this.comparator = comparator;

    }
    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void put(K key, V value) {

    }

    @Override
    public void remove(K key) {

    }

    @Override
    public void keys(K[] array) {

    }

    @Override
    public int size() {
        return 0;
    }
}

