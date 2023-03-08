package produto;

public class OvoKitKat extends OvoPascoaAbstrato {
    @Override
    public void obterInformacoes() {
        System.out.println("Nome: KitKat");
        System.out.println("Marca: Nestlé");
        System.out.println("Peso: 227g");
        System.out.println("Preço: R$ 60,00");
        System.out.println("Classificação: 3.4");
    }
}
