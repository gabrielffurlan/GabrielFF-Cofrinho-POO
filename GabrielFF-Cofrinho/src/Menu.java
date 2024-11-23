import java.util.Scanner;

public class Menu {
    
    private Scanner sc;
    private Cofrinho cofrinho;

    public Menu(){
        sc = new Scanner(System.in);
        cofrinho = new Cofrinho();
    }

    public void exibirMenuPrincipal() {
        System.out.println("COFRINHO");
        System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Converter valor total para Real");
		System.out.println("0 - Encerrar");

        String opcaoSelecionada = sc.next();

        switch (opcaoSelecionada) {

            case "0":
                System.out.println("Finalizando ...");             
                break;

            case "1":
                exibirSubMenuAdd();
                exibirMenuPrincipal();                
                break;

            case "2":
                exibirSubMenuRemover();
                exibirMenuPrincipal();                
                break;
            
            case "3":
                cofrinho.listagemMoedas();
                exibirMenuPrincipal();
                break;
            
            case "4":
                double valorTotalConvertido = cofrinho.totalConvertido();
                System.out.println("O valor total convertido em real é: " + valorTotalConvertido);
                exibirMenuPrincipal();
                break;
                
            default:
                System.out.println("Opção invalida!");
                exibirMenuPrincipal();
                break;
        }


    }
    private void exibirSubMenuAdd() {
        System.out.println("Escolha Moeda:");
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

    private void exibirSubMenuRemover() {
        System.out.println("Escolha Moeda:");
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
