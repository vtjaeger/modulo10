package domain;

import java.util.concurrent.TimeUnit;

public class Carro {
    private String modelo;
    private String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void acelerar() throws InterruptedException {
        System.out.println("acelerendo");
        System.out.println("velocidade: 10km/h");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("velocidade: 30km/h");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("velocidade: 60km/h");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("velocidade: 90km/h");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("velocidade: 120km/h");
    }

    public void freiar() throws InterruptedException {
        System.out.println("freiando");
        System.out.println("velocidade: 100km/h");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("velocidade: 80km/h");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("velocidade: 60km/h");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("velocidade: 30km/h");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("velocidade: 10km/h");
        System.out.println("velocidade: 0km/h");
    }

}
