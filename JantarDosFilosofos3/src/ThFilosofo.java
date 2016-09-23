
public class ThFilosofo extends Thread {

    private boolean _executar;
    private AreaCritica _ac;
    private String _nome;

    public void setExecutar(boolean _executar) {
        this._executar = _executar;
    }

    public boolean isExecutar() {
        return _executar;
    }

    public ThFilosofo(AreaCritica ac, String nome) {
        this.setExecutar(true);
        this._ac = ac;
        this._nome = nome;
    }

    public void run() {
        while (isExecutar()) {
            int tempoAleatorio = (int) (Math.random() * 1000) + 500;//1 e 10 ms
            try {
                this.sleep(tempoAleatorio);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //tenta pegar o garfo da direita
            _ac.pegarGarfoDireita();
            System.out.println(_nome + " pegou o garfo da Direita");
            //se conseguiu pega o da esquerda
            _ac.pegarGarfoEsquerda();
            System.out.println(_nome + " pegou o garfo da Esquerda");

            //tempo para comer:
            tempoAleatorio = (int) (Math.random() * 3000) + 500;//50 e 100 ms
            try {
                this.sleep(tempoAleatorio);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            _ac.soltarGarfoEsquerda();
            _ac.soltarGarfoDireita();

        }
    }

}
