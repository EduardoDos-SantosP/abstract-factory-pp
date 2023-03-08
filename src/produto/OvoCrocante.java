package produto;

public class OvoCrocante extends OvoPascoaAbstrato {
    @Override
    public void obterInformacoes() {
        System.out.println("Nome: Crocante");
        System.out.println("Marca: Garoto");
        System.out.println("Peso: 215g");
        System.out.println("Preço: R$ 55,00");
        System.out.println("Classificação: 3.9");
    }
}
