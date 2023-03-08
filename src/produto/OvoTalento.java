package produto;

public class OvoTalento extends OvoPascoaAbstrato {
    @Override
    public void obterInformacoes() {
        System.out.println("Nome: Talento");
        System.out.println("Marca: Garoto");
        System.out.println("Peso: 350g");
        System.out.println("Preço: R$ 75,00");
        System.out.println("Classificação: 4.4");
    }
}
