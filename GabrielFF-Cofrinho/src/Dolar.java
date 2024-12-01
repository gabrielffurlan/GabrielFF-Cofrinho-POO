public class Dolar extends Moeda{ //Classe filha de Moeda

    public Dolar(double valorInicial){
        this.valor = valorInicial;
    }

    @Override
    public void info() {
        System.out.println("Dolar -> " + valor);
    }

    @Override
    public double converter() {
        return this.valor * 6;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this.getClass() != objeto.getClass()) {
            return false;
        }

        Dolar objetoDeDolar = (Dolar) objeto;

        if (this.valor != objetoDeDolar.valor) {
            return false;
        }

        return true;
    }
    
}
