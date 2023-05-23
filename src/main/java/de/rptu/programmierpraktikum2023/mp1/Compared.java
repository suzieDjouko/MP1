package de.rptu.programmierpraktikum2023.mp1;

import java.util.Comparator;

public class Compared implements Comparator<String> {
    public int compare(String keyA, String keyB) {
        return keyA.length() - keyB.length();
    }
}
