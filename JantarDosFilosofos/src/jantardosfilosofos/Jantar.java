package jantardosfilosofos;

public class Jantar {
    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        Thread filosofo0 = new Filosofos(0, mesa);
        Thread filosofo1 = new Filosofos(1, mesa);
        Thread filosofo2 = new Filosofos(2, mesa);
        Thread filosofo3 = new Filosofos(3, mesa);
        Thread filosofo4 = new Filosofos(4, mesa);
        filosofo0.start();
        filosofo1.start();
        filosofo2.start();
        filosofo3.start();
        filosofo4.start();
    }
}