package cliente;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import fabrica.FabricaOvoPascoaAbstrata;
import produto.OvoPascoaAbstrato;

public class Main {
    public static void main(String[] args) {
        print("---Fábrica de Ovos de Páscoa---");
        print("Digite o código do produto para ver as informações (ex: Lacta-1), ou Enter para sair");

        var input = new Scanner(System.in);
        while (true) {
            var codigo = input.nextLine();
            if (codigo.isEmpty()) return;
            buscarProduto(codigo);
            print("");
        }
    }

    private static void print(Object x) {
        System.out.println(x);
    }

    private static void buscarProduto(String codigo) {
        var codigoDividido = codigo.split("-");
        if (codigoDividido.length != 2) {
            print("Formato do código inválido. Tente algo como 'Marca'-'Numero'");
            return;
        }

        var codigoFabrica = codigoDividido[0];
        var codigoProduto = codigoDividido[1];

        Class classeFabrica;
        try {
            classeFabrica = Class.forName("fabrica.Fabrica" + codigoFabrica);
        } catch (ClassNotFoundException e) {
            print("Não existe uma fábrica com o nome '" + codigoFabrica + "''. Verifique se digitou corretamente.");
            return;
        }

        Method metodoFabrica;
        try {
            metodoFabrica = classeFabrica.getMethod("crieOvo" + codigoProduto);
        } catch (NoSuchMethodException | SecurityException e) {
            print("Não existe um produto com o codigo '" + codigoProduto + "'.");
            return;
        }

        FabricaOvoPascoaAbstrata instanciaFabrica;
        try {
            instanciaFabrica = (FabricaOvoPascoaAbstrata) classeFabrica.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            print("Ocorreu uma falha ao carreagar a fábrica de codigo: " + codigoFabrica);
            return;
        }

        try {
            var ovoPascoa = (OvoPascoaAbstrato) metodoFabrica.invoke(instanciaFabrica);
            ovoPascoa.obterInformacoes();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            print("Ocorreu uma falha ao carregar o produto de código: " + codigoProduto);
        }
    }
}
