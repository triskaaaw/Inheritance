package com.company;

public class Main {

    public static void main(String[] args) {
//	    menu menu1 = new menu();
//        menu1.nama = "Gacoan";
//        menu1.harga = "10.000";
//        menu1.display();

        makanan menu2 = new makanan();
        menu2.nama = "Mie";
        menu2.harga = "13.000";
        menu2.display();

        minuman menu3 = new minuman();
        menu3.nama = "Teh";
        menu3.harga = "8.000";
        menu3.display();

        MieGoreng menu4 = new MieGoreng();
        menu4.nama = "Mie goreng sambal matah";
        menu4.harga = "10.000";
        menu4.display();

        Teh menu5 = new Teh();
        menu5.nama = "Teh anget";
        menu5.harga = "5.000";
        menu5.display();

    }
}
