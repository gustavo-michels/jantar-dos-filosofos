package jantardosfilosofos;

import java.util.Random;

/**
 *
 * @author gustavo.michels
 */
public class Filosofos {

    void test() {
        Garfos g1 = new Garfos(1, 5);
        Garfos g2 = new Garfos(2, 1);
        Garfos g3 = new Garfos(3, 2);
        Garfos g4 = new Garfos(4, 3);
        Garfos g5 = new Garfos(5, 4);

        Filosofo filosofo1 = new Filosofo("Platão ", g1);
        Filosofo filosofo2 = new Filosofo("Aristóteles ", g2);
        Filosofo filosofo3 = new Filosofo("Sócrates ", g3);
        Filosofo filosofo4 = new Filosofo("Descartes ", g4);
        Filosofo filosofo5 = new Filosofo("Euclides ", g5);

        new Thread(filosofo1).start();
        new Thread(filosofo2).start();
        new Thread(filosofo3).start();
        new Thread(filosofo4).start();
        new Thread(filosofo5).start();
    }

    public class Garfos extends Thread {

        private final int garfoEsquerda;
        private final int garfoDireita;

        public Garfos(int garfoEsquerda, int garfoDireita) {
            this.garfoEsquerda = garfoEsquerda;
            this.garfoDireita = garfoDireita;
        }

        @Override //Método que executa a Thread
        public void run() {
            while (true) {
                try {
                    SorteioDireita();
                    SorteioEquerda();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        //Método que sorteia o garfo da direita
        public void SorteioDireita() {

            int garfoDireita;
            Random r = new Random();
            garfoDireita = r.nextInt(5);

            System.out.println("O garfo da direita sorteado " + garfoDireita);
        }

        //Método que sorteia o garfo da esquerda
        public void SorteioEquerda() {

            int garfoEsquerda;
            Random r = new Random();
            garfoEsquerda = r.nextInt(5);

            System.out.println("O garfo da esquerda sorteado " + garfoEsquerda);
        }
    }

    //Classe individual dos filósofos, cada filósofo é uma thread
    public class Filosofo extends Thread {

        String nome;
        Garfos garfo;
        boolean comeu;

        public Filosofo(String nome, Garfos garfo) {
            this.nome = nome;
            this.garfo = garfo;

            System.out.println("O filósofo " + nome + " sentou à mesa.");
        }

        public void Pensar() throws InterruptedException {
            System.out.println("O filósofo " + nome + " está pensando.");
            Thread.sleep(1000);
        }

        @Override
        public void run() {
        int comeram = 0;
            while (true) {
                //Garfo = 5
                if (garfo.garfoDireita == 5) {
                    System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoDireita);
                    if (garfo.garfoEsquerda == 1 && !this.comeu) {
                        System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo.");
                        System.out.println("O filósofo " + nome + " largou o garfo da direita.");
                        System.out.println("O filósofo " + nome + " largou o garfo da esquerda.");
                        this.comeu = true;
                    } else {
                        System.out.println("O filósofo " + nome + " largou o garfo " + garfo.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }

                //Garfo = 1
                if (garfo.garfoDireita == 1) {
                    System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoDireita);
                    if (garfo.garfoEsquerda == 2 && !this.comeu) {
                        System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo.");
                        System.out.println("O filósofo " + nome + " largou o garfo da direita.");
                        System.out.println("O filósofo " + nome + " largou o garfo da esquerda.");
                        this.comeu = true;
                    } else {
                        System.out.println("O filósofo " + nome + " largou o garfo " + garfo.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }

                //Garfo = 2
                if (garfo.garfoDireita == 2) {
                    System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoDireita);
                    if (garfo.garfoEsquerda == 3 && !this.comeu) {
                        System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo.");
                        System.out.println("O filósofo " + nome + " largou o garfo da direita.");
                        System.out.println("O filósofo " + nome + " largou o garfo da esquerda.");
                        this.comeu = true;
                    } else {
                        System.out.println("O filósofo " + nome + " largou o garfo " + garfo.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }

                //Garfo = 3
                if (garfo.garfoDireita == 3) {
                    System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoDireita);
                    if (garfo.garfoEsquerda == 4 && !this.comeu) {
                        System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo.");
                        System.out.println("O filósofo " + nome + " largou o garfo da direita.");
                        System.out.println("O filósofo " + nome + " largou o garfo da esquerda.");
                        this.comeu = true;
                    } else {
                        System.out.println("O filósofo " + nome + " largou o garfo " + garfo.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }

                //Garfo = 4
                if (garfo.garfoDireita == 4) {
                    System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoDireita);
                    if (garfo.garfoEsquerda == 5 && !this.comeu) {
                        System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo.");
                        System.out.println("O filósofo " + nome + " largou o garfo da direita.");
                        System.out.println("O filósofo " + nome + " largou o garfo da esquerda.");
                        this.comeu = true;
                    } else {
                        System.out.println("O filósofo " + nome + " largou o garfo " + garfo.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }
}
