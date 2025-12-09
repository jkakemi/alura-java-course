import br.com.alura.desafio03.modelos.animal.Cachorro;
import br.com.alura.desafio03.modelos.animal.Gato;
import br.com.alura.desafio03.modelos.carro.ModeloCarro;
import br.com.alura.desafio03.modelos.contabancaria.ContaBancaria;
import br.com.alura.desafio03.modelos.contabancaria.ContaCorrente;
import br.com.alura.desafio03.modelos.primos.GeradorPrimo;
import br.com.alura.desafio03.modelos.primos.NumerosPrimos;
import br.com.alura.desafio03.modelos.primos.VerificadorPrimo;

public class Main {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(3000, 32000, 35000);
        meuCarro.exibirInfo();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}