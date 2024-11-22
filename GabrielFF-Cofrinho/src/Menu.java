import java.util.Scanner;

public class Menu {
    
    private Scanner sc;

    public Menu(){
        sc = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        System.out.println("COFRINHO");
        System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Converter valor total para real");
		System.out.println("0 - Encerrar");

        String opcaoSelecionada = sc.next();

        switch (opcaoSelecionada) {
            case "0":
                System.out.println("Finalizando ...");             
                break;
        
            default:
                System.out.println("Opção invalida!");
                exibirMenuPrincipal();
        }


    }

}
