package produto;

public class OvoBatomLeite extends OvoPascoaAbstrato {
    @Override
    public void obterInformacoes() {
        System.out.println("Nome: Batom ao leite");
        System.out.println("Marca: Garoto");
        System.out.println("Peso: 172g");
        System.out.println("Preço: R$ 55,00");
        System.out.println("Classificação: Sem classificação");
    }
}
