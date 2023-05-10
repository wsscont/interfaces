public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Willian Silva");
        pessoa.setRaca("Negra");
        pessoa.setCor("mulato");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Raca: " + pessoa.getRaca());
        System.out.println("Cor: " + pessoa.getCor());
    }
}
