
public class ThFilosofoComDeadLock extends Thread {

    private boolean _executar;
    private String _nome;
    private boolean _alguemPegouGarfoDireita;
    private boolean _alguemPegouGarfoEsquerda;

    public void setExecutar(boolean _executar) {
        this._executar = _executar;
    }

    public boolean isExecutar() {
        return _executar;
    }

    public ThFilosofoComDeadLock(String nome) {
        this.setExecutar(true);
        this._nome = nome;
        this._alguemPegouGarfoDireita = false;
        this._alguemPegouGarfoEsquerda = false;
    }

    public synchronized void run() {
        while (isExecutar()) {
            int tempoAleatorio = (int) (Math.random() * 1000) + 500;//1 e 10 ms
            try {
                this.sleep(tempoAleatorio);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            while (_alguemPegouGarfoDireita) {
                try {
                    System.out.println(_nome + " VAI DORMIR");
                    this.sleep(500);

                    //wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //tenta pegar o garfo da direita
            if (!_alguemPegouGarfoDireita) {
                System.out.println(_nome + " pegou o garfo da Direita");
                _alguemPegouGarfoDireita = true;
            }

            while (_alguemPegouGarfoEsquerda) {
                try {
                    System.out.println(_nome + " vai dormir");
                    this.sleep(500);
                    //wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //se conseguiu pega o da esquerda
            if (!_alguemPegouGarfoEsquerda) {
                System.out.println(_nome + " pegou o garfo da Esquerda");
                _alguemPegouGarfoEsquerda = true;
            }

            //tempo para comer:
            tempoAleatorio = (int) (Math.random() * 3000) + 500;//50 e 100 ms
            try {
                this.sleep(tempoAleatorio);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            _alguemPegouGarfoEsquerda = false;
            _alguemPegouGarfoDireita = false;
            //notify();

        }
    }

}
