package produto;

public class OvoOreo extends OvoPascoaAbstrato {
    @Override
    public void obterInformacoes() {
        System.out.println("Nome: Oreo");
        System.out.println("Marca: Lacta");
        System.out.println("Peso: 257g");
        System.out.println("Preço: R$ 70,00");
        System.out.println("Classificação: 3.2");
    } 
}
