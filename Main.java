package com.company;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] ia={1,2,7};
        ArrayUtils.printArray(ia);
        System.out.println("Element srodkowy "+ArrayUtils.getCentral(ia));
        int imax = ArrayUtils.max(ia);
        System.out.println("elem max= "+imax);
        Double[] da={1.5, 231.7};
        double dmax = ArrayUtils.max(da);
        System.out.println("Elem srodkowy "+ArrayUtils.getCentral(da));
        System.out.println(imax+ " "+dmax);
        Character[] ca={'H','E','L','L','O'};
        System.out.println("Tablica znakow: ");
        ArrayUtils.printArray(ca);
        String[] s ={"alpha","beta","gamma"};
        String sc = ArrayUtils.getCentral(s);
        System.out.println(sc);
        Osoba[] oa={
                new Osoba("123","Jan","Kowalski"),
                new Osoba("223","Lan","Mowalski"),
                new Osoba("323","Gan","Rowalski"),
                new Osoba("423","Zan","Owalski")
        };
        Osoba omax = ArrayUtils.max(oa);
        System.out.println("Osoba o max nazwisku to: " +omax);
        int ilPowO=ArrayUtils.counterGreaterThan(oa,new Osoba(null,null,"O"));
        System.out.println("Osoby z nazwiskiem powyzej O: "+ilPowO);
        System.out.println("\nArray Osoby contains: ");
        ArrayUtils.printArray(oa);
    }
}
