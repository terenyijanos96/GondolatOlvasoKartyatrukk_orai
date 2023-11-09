package csomag;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author TerényiJános(SZF_E_2
 */
public class Program {

    private String[] kartyak = new String[21];

    public static void main(String[] args) {
        Program p = new Program();

        p.feltolt();

        for (int i = 0; i < 3; i++) {
            p.Kirak();
            p.Melyik();
            p.Kever();
        }

        p.EzVolt();

    }

    public void feltolt() {
        int index = 0;

        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int db = 0;

        for (int i = 0; i < szinek.length; i++) {
            for (int j = 0; db < 21 && j < ertekek.length; j++) {
                kartyak[db++] = szinek[i] + "_" + ertekek[j];
            }
        }
    }

    public void Kirak() {
        for (int i = 0; i < kartyak.length; i++) {

            System.out.printf("%-10s ", kartyak[i]);
            if ((i + 1) % 3 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public int Melyik() {
        Scanner sc = new Scanner(System.in);
        int valasz;

        do {
            System.out.println("Melyik oszlopban van a kártya?");

            valasz = sc.nextInt();
            if (valasz < 1 || valasz > 3) {
                System.out.println("Nincs ilyen oszlop. Kérlek add meg újra!");
            }

        } while (valasz < 1 || valasz > 3);
      
        return valasz;
    }

    public void Kever() {
        String[] elso = new String[7];
        String[] masodik = new String[7];
        String[] harmadik = new String[7];

        for (int i = 0; i < kartyak.length; i++) {

        }
    }

    public void EzVolt() {
        System.out.println(kartyak[12]);
    }

}
