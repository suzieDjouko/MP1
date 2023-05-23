package de.rptu.programmierpraktikum2023.mp1;
import java.util.Comparator;


import java.security.Key;

public class Baumknoten<K,V> {
    K key ;
    V value;
    Baumknoten <K,V>  Left ;
    Baumknoten<K,V>  Right;

   Baumknoten(Baumknoten<K,V> Left , K key , V value){
       this.key = key;
       this.value = value;
       this.Left= Left;
       //Konstruktor für den Linken Teilbaum
   }

    Baumknoten( K key , V value){
        this.key = key;
        this.value = value;
        // Konstructor für den rechten Teilbaum
    }
}
