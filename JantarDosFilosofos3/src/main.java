
import Resolucao.ExDeadlock1;

public class main {

    public static void main(String[] args) {
        /*AreaCritica ac = new AreaCritica();
		ThFilosofo[] filosofos = new ThFilosofo[5];
		filosofos[0] = new ThFilosofo(ac, "Nostradamus");
		filosofos[1] = new ThFilosofo(ac, "Fei Long");
		filosofos[2] = new ThFilosofo(ac, "Jaspion");
		filosofos[3] = new ThFilosofo(ac, "Rodrigo Rdrz");
		filosofos[4] = new ThFilosofo(ac, "Mestre Yoda");
		
		for (int i = 0; i < filosofos.length; i++){
			filosofos[i].start();
		}*/

        ThFilosofoComDeadLock[] filosofos = new ThFilosofoComDeadLock[5];
        filosofos[0] = new ThFilosofoComDeadLock("Nostradamus");
        filosofos[1] = new ThFilosofoComDeadLock("Fei Long");
        filosofos[2] = new ThFilosofoComDeadLock("Jaspion");
        filosofos[3] = new ThFilosofoComDeadLock("Rodrigo Rdrz");
        filosofos[4] = new ThFilosofoComDeadLock("Mestre Yoda");

        for (int i = 0; i < filosofos.length; i++) {
            filosofos[i].start();
        }

    }
}
/**
Rodrigo Rdrz pegou o garfo da Direita
Rodrigo Rdrz pegou o garfo da Esquerda
Nostradamus pegou o garfo da Direita
Nostradamus pegou o garfo da Esquerda
Jaspion pegou o garfo da Direita
Jaspion pegou o garfo da Esquerda
Mestre Yoda pegou o garfo da Direita
Mestre Yoda pegou o garfo da Esquerda
Fei Long pegou o garfo da Direita
Fei Long pegou o garfo da Esquerda
 * */
