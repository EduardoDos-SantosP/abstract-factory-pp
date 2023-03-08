package produto;

public class OvoSonhoValsa extends OvoPascoaAbstrato {
    @Override
    public void obterInformacoes() {
        System.out.println("Nome: Sonho de valsa");
        System.out.println("Marca: Lacta");
        System.out.println("Peso: 277g");
        System.out.println("Preço: R$ 60,00");
        System.out.println("Classificação: 4.1");
    } 
}
