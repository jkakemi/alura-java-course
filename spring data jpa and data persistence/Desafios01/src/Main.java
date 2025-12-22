import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args){
        // desafio 01
        List<String> input = Arrays.asList("10", "abc", "20", "30x");
        // basicamente funciona assim:
        /* stream() pega cada valor de um array, depois utiliza o map para transformar
        * elementos , no caso deste, utiliza um try catch para ver se foi bem sucedido
        * ou nao, dpeois utiliza o optional (que pode ser ou não) um inteiro transformado
        * com sucesso, e depois filtra se está presente e salva na lista */
        input.stream() .map(str -> {
            try {
                return Optional.of(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                return Optional.<Integer>empty();
            }
        }) .filter(Optional::isPresent)
                .map(Optional::get).toList();

        // desafio02
        System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
        System.out.println(processaNumero(Optional.empty())); // Saída: Optional.empty

        // desafio03
        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"

        // desafio04
        System.out.println(ehPalindromo("socorram me subi no onibus em marrocos")); // Saída: true
        System.out.println(ehPalindromo("Java")); // Saída: false

        // desafio05
        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
        System.out.println(converterEmails(emails));
        // Saída: ["teste@exemplo.com", "exemplo@java.com", "usuario@teste.com"]

        // desafio06
        System.out.println(Mes.FEVEREIRO.getNumeroDeDias());
        System.out.println(Mes.JULHO.getNumeroDeDias());

        // desafio07
        System.out.println(Moeda.DOLAR.converterPara(100)); // 19.60 (aproximado)
        System.out.println(Moeda.EURO.converterPara(100)); // 18.18 (aproximado)

        // desafio08
        System.out.println(CodigoErro.NOT_FOUND.getCodigo()); // 404
        System.out.println(CodigoErro.BAD_REQUEST.getDescricao()); // Requisição inválida
    }

    // desafio02
    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
        return numero.filter(n -> n > 0).map(n -> n*n);
    }

    // desafio03
    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
            String[] nomes = nomeCompleto.trim().split("\\s+");
            if(nomes.length == 1) return nomes[0];
            return nomes[0] + " " + nomes[nomes.length-1];
    }

    // desafio04
    public static boolean ehPalindromo(String palavra) {
        String semEspacos = palavra.replace(" ", "").toLowerCase();
        return new StringBuilder(semEspacos).reverse().toString().equalsIgnoreCase(semEspacos);
    }

    // desafio05
    public static List<String> converterEmails(List<String> emails){
        return emails.stream()
                .map(email -> email.trim().toLowerCase())
                .toList();
    }

    // desafio06
    public enum Mes {
        JANEIRO(31),
        FEVEREIRO(28),
        MARCO(31),
        ABRIL(30),
        MAIO(31),
        JUNHO(30),
        JULHO(31),
        AGOSTO(31),
        SETEMBRO(30),
        OUTUBRO(31),
        NOVEMBRO(30),
        DEZEMBRO(31);

        private final int dias;

        Mes(int dias) {
            this.dias = dias;
        }

        public int getNumeroDeDias() {
            return dias;
        }
    }

    public enum Moeda{
        DOLAR(4.74),
        EURO(5.50),
        REAL(1.0);

        private final double taxa;
        Moeda(double taxa){
            this.taxa = taxa;
        }

        public double converterPara(double valorEmReais){
            return valorEmReais/taxa;
        }
    }

    public enum CodigoErro{
        NOT_FOUND(404,"Recurso não encontrado"),
        BAD_REQUEST(400, "Requisição inválida"),
        INTERNAL_SERVER_ERROR(500, "Erro interno do servidor");

        private final int codigo;
        private final String descricao;

        CodigoErro(int codigo, String descricao){
            this.codigo = codigo;
            this.descricao = descricao;
        }

        public String getDescricao(){
            return descricao;
        }

        public int getCodigo(){
            return codigo;
        }
    }

}
