import java.util.ArrayList;

public class Cofrinho {
    
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho(){
        this.listaMoedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) { //Adiciona moeda na lista
        this.listaMoedas.add(moeda);
    }

    public boolean remover(Moeda moeda) { //Remove moeda da lista
        return this.listaMoedas.remove(moeda);
    }

    public void listagemMoedas() { //Exibe moedas

        if(this.listaMoedas.isEmpty()) {
            System.out.println("Não existe nenhuma moeda no cofrinho!");
            return;
        }

        for(Moeda moeda: this.listaMoedas){
            moeda.info();
        }
    }

    public double totalConvertido() { //Converte moedas 
        
        if (this.listaMoedas.isEmpty()) {
            return 0;
        }

        double valorAcumulado = 0;

        for (Moeda moeda : this.listaMoedas){
            valorAcumulado = valorAcumulado + moeda.converter();
        }

        return valorAcumulado;
    }

}
