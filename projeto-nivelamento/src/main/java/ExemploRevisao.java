public class ExemploRevisao {
    public static void main(String[] args) {
        // tipos que usaremos:
        //tipos Wrapper = são classes, ou seja possuem métodos
        //Valor inicial de Wrapper = null

        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.55;
        Boolean bloqueado = false;
        String nomePet;
        nomePet = "teste";


        System.out.println("Meu Nome é " + nome + " minha altura é "+ altura+ " minha idade é " + idade);
    // interpolação
        System.out.println("Meu nome é %s, minha altura é %.2f e minha idade é %d".formatted(nome, altura,idade));
    //interpolação + text block

        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                Nome do Pet: %s
                """.formatted(nome, idade, altura, "Caramelo"));

        //Não usaremos...
        //tipo primitivo, não são classe, sem métodos
        boolean bloqueado02 = false;
        int numero = 42;
    }
}
