import domain.Carro;

import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws InterruptedException {
        Carro carro = new Carro("320i", "BMW");

        System.out.println("modelo: " + carro.getModelo());
        System.out.println("marca: " + carro.getMarca());

        carro.acelerar();
        carro.freiar();
    }
}