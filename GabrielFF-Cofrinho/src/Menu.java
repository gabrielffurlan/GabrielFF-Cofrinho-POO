import java.util.Scanner;

public class Menu {
    
    private Scanner sc;
    private Cofrinho cofrinho;

    public Menu(){
        sc = new Scanner(System.in);
        cofrinho = new Cofrinho();
    }

    public void exibirMenuPrincipal() { //MENU PRINCIPAL
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("COFRINHO - GABRIEL FONTES FURLAN - RU: 4822969");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Escolha a opção desejada abaixo: ");
        System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Converter valor total para Real");
		System.out.println("0 - Encerrar");

        String opcaoSelecionada = sc.next();

        switch (opcaoSelecionada) { //Opções em que chamam os métodos

            case "0": //Encerra programa
                System.out.println("Finalizando ...");             
                break;

            case "1": //Adiciona moeda
                exibirSubMenuAdd();
                exibirMenuPrincipal();                
                break;

            case "2": //Remove moeda
                exibirSubMenuRemover();
                exibirMenuPrincipal();                
                break;
            
            case "3": //Lista moeda
                cofrinho.listagemMoedas();
                exibirMenuPrincipal();
                break;
            
            case "4": //Converte para Real
                double valorTotalConvertido = cofrinho.totalConvertido();
                System.out.println("O valor total convertido em real é: R$ " + valorTotalConvertido);
                exibirMenuPrincipal();
                break;
                
            default:
                System.out.println("Opção invalida!");
                exibirMenuPrincipal();
                break;
        }


    }
    private void exibirSubMenuAdd() { //SUB MENU ADICIONAR
        System.out.println("Escolha a Moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        
        int opcaoMoeda = sc.nextInt();

        System.out.println("Digite o valor: ");

        String valorTextoMoeda = sc.next();

        valorTextoMoeda = valorTextoMoeda.replace(",",".");
        double valorMoeda = Double.parseDouble(valorTextoMoeda);

        Moeda moeda = null;

        if (opcaoMoeda == 1) { 
            moeda = new Real(valorMoeda);
        }
        else if (opcaoMoeda == 2) {
            moeda = new Dolar(valorMoeda);
        }
        else if (opcaoMoeda == 3) {
            moeda = new Euro(valorMoeda);
        }
        else{
            System.out.println("Essa opção não existe!");
            exibirMenuPrincipal();
        }

        cofrinho.adicionar(moeda);
        System.out.println("Moeda adicionada!");
    }

    private void exibirSubMenuRemover() { //SUB MENU REMOVER
        System.out.println("Escolha a Moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        
        int opcaoMoeda = sc.nextInt();

        System.out.println("Digite o valor: ");

        String valorTextoMoeda = sc.next();

        valorTextoMoeda = valorTextoMoeda.replace(",",".");
        double valorMoeda = Double.parseDouble(valorTextoMoeda);

        Moeda moeda = null;

        if (opcaoMoeda == 1) {
            moeda = new Real(valorMoeda);
        }
        else if (opcaoMoeda == 2) {
            moeda = new Dolar(valorMoeda);
        }
        else if (opcaoMoeda == 3) {
            moeda = new Euro(valorMoeda);
        }
        else{
            System.out.println("Essa opção não existe!");
            exibirMenuPrincipal();
        }

        boolean removeuMoeda = cofrinho.remover(moeda);

        if (removeuMoeda) {
            System.out.println("Moeda removida!");
        }
        else{
            System.out.println("Essa moeda não existe!");
        }

    }
}
