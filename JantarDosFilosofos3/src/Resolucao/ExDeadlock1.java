package Resolucao;

class ThreadDeadlock extends Thread {

    private int numero;
    private boolean v1 = false, v2 = false;

    public ThreadDeadlock(int n) {
        numero = n;
    }

    public void run() {
        while (true) {
            try {
                if (numero == 1) {
                    // tenta pegar v1, se for false
                    while (v1 == true) {
                        System.out.println("Thread 1 vai dormir");
                        sleep(100);
                    }
                    System.out.println("Thread 1 pega valor");
                    v1 = true;
                    // libera v2
                    v2 = false;

                } else {
                    while (v2 == true) {
                        System.out.println("Thread 2 vai dormir");
                        sleep(100);
                    }
                    System.out.println("Thread 2 pega valor");
                    v2 = true;
                    v1 = false;
                }

            } catch (Exception e) {
            }

        }

    }

}

public class ExDeadlock1 {

    public static void main(String[] args) {
        ThreadDeadlock t1 = new ThreadDeadlock(1);
        ThreadDeadlock t2 = new ThreadDeadlock(2);
        t1.start();
        t2.start();

    }
}
