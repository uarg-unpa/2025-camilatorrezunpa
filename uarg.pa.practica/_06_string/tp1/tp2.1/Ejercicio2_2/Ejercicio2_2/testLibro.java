package Ejercicio2_2.Ejercicio2_2;

import Ejercicio2_2.Libro;

public class testLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro("J.K. Rowling", "Harry Potter y la piedra filosofal", 223);
        Libro l2 = new Libro("Rick Riordan", "Percy Jackson y el ladrón del rayo", 300);

        System.out.println(l1);
        System.out.println(l2);
    }
}
