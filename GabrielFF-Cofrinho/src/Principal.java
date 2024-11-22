public class Principal {
    public static void main(String[] args) throws Exception {
        
//        Menu menu = new Menu();
//        menu.exibirMenuPrincipal();

        Cofrinho cofrinho = new Cofrinho();
        cofrinho.listagemMoedas();

        Real doisReais = new Real(2);
        Dolar cincoDolares = new Dolar(5);
        Euro vinteECincoEuros = new Euro(25);
        Real tresReais = new Real(3);

        cofrinho.adicionar(doisReais);
        cofrinho.adicionar(cincoDolares);
        cofrinho.adicionar(vinteECincoEuros);
        cofrinho.adicionar(tresReais);

        cofrinho.listagemMoedas();

    }
}
