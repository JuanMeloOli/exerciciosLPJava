import java.util.concurrent.ThreadLocalRandom;

public class ExemploNumeroAleatorio {
    public static void main(String[] args) {
        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt(1, 30);

        System.out.println(inteiroAleatorio);
    }
}
