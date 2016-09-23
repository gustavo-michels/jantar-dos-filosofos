
/**
 * Controla Tanto o Garfo da Esquerda quanto o Garfo da Direita
 *
 */
public class AreaCritica {

    private boolean _alguemPegouGarfoDireita;
    private boolean _alguemPegouGarfoEsquerda;

    public AreaCritica() {
        _alguemPegouGarfoDireita = false;
        _alguemPegouGarfoEsquerda = false;
    }

    public synchronized void pegarGarfoDireita() {
        while (_alguemPegouGarfoDireita) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        _alguemPegouGarfoDireita = true;
    }

    public synchronized void soltarGarfoDireita() {
        _alguemPegouGarfoDireita = false;
        notify();
    }

    public synchronized void pegarGarfoEsquerda() {
        while (_alguemPegouGarfoEsquerda) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        _alguemPegouGarfoEsquerda = true;
    }

    public synchronized void soltarGarfoEsquerda() {
        _alguemPegouGarfoEsquerda = false;
        notify();
    }
}
