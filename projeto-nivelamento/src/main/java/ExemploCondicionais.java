public class ExemploCondicionais {
    public static void main(String[] args) {
        Integer idade = 19;


        //Cuidado, com == , nunca usar para String
        if (idade >= 18) {
            System.out.println("É maior de idade");
        }else{
            System.out.println("É menor de idade");
        }

        String nome01 =  "Bob";
        String nome02 =  "Bob";

        if (nome01.equals(nome02)) {
            System.out.println("Igual");
        }

        //operador ternario

        String resultadoMaioridade = idade>=18 ? "Maior de idade" : "Menor de idade";
        Boolean ehMaiorDeIdade = idade>=18;
        System.out.println("É maior de idade: " + resultadoMaioridade);
    }
}
