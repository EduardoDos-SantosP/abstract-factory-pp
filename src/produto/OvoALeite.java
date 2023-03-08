package produto;

public class OvoALeite extends OvoPascoaAbstrato {
    @Override
    public void obterInformacoes() {
        System.out.println("Nome: A Leite");
        System.out.println("Marca: Lacta");
        System.out.println("Peso: 170g");
        System.out.println("Preço: R$ 55,00");
        System.out.println("Classificação: 4.5");
    } 
}
