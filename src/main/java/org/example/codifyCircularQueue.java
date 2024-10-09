package org.example;

import Parte1.Ex4.CodifyCircularArray;

public class codifyCircularQueue {
    public static void main(String[] args){

        CodifyCircularArray cod = new CodifyCircularArray();

        cod.addKey(1);
        cod.addKey(2);
        cod.addKey(3);
        cod.addKey(4);
        cod.addKey(5);

        System.out.println("Mensagem: macacos pretos não nadam");
        System.out.println("Mensagem encriptada: " + cod.encode("macacos pretos não nadam"));
    }
}
