package produto;

public class OvoClassic extends OvoPascoaAbstrato {
    @Override
    public void obterInformacoes() {
        System.out.println("Nome: Classic");
        System.out.println("Marca: Nestlé");
        System.out.println("Peso: 158g");
        System.out.println("Preço: R$ 60,00");
        System.out.println("Classificação: 4.2");
    }    
}
