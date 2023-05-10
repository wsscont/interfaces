public class Pessoa implements Humano{
    private String raca;
    private String cor;
    private String nome;

    public Pessoa(){}
    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String getRaca() {
        return this.raca;
    }

    @Override
    public String getCor() {
        return this.cor;
    }

    @Override
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }
}
