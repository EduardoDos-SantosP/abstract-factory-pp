package produto;

public class OvoAlpino extends OvoPascoaAbstrato {
    @Override
    public void obterInformacoes() {
        System.out.println("Nome: Alpino");
        System.out.println("Marca: Nestlé");
        System.out.println("Peso: 337g");
        System.out.println("Preço: R$ 70,00");
        System.out.println("Classificação: 3.7");
    }
}
