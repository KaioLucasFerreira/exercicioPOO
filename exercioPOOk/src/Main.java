class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Mamifero extends Animal {
    private String Alimento;
    public Mamifero(String nome, int idade, String Alimento) {
        super(nome, idade);
        this.Alimento = Alimento;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }

}

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Orca", 13, "Carne");

        System.out.println("Nome do mamífero: " + mamifero.getNome());
        System.out.println("Idade do mamífero: " + mamifero.getIdade());
        System.out.println("Tipo de alimento do mamífero: " + mamifero.getAlimento());
    }
}
