import java.util.concurrent.ThreadLocalRandom;

public class ExemploLacosDeRepeticao {
    public static void main(String[] args) {
        //For que exibe numeros de 0 a 10
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("for: "+i);
        }


        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt(1, 30);
        //while

        while(inteiroAleatorio != 3){
            System.out.println("Não foi 3, numero sorteado: "+inteiroAleatorio);
            inteiroAleatorio = ThreadLocalRandom.current().nextInt(1, 30);
        }
        System.out.println("Número sorteado 3");

    }
}
