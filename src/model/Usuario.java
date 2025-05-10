package model;

public class Usuario extends Pessoa {
    private int id;
    private boolean temEmprestimo;
    
    public Usuario(String nome, String telefone, String endereco, String email, int id, boolean temEmprestimo) {
        super(nome, telefone, endereco, email);
        this.id = id;
        this.temEmprestimo = false;
    }
    
    public String mostrarDados() {
        return "ID: " + id + "\n" +
               "Nome: " + nome + "\n" +
               "Telefone: " + telefone + "\n" +
               "Endereço: " + endereco + "\n" +
               "Email: " + email + "\n" +
               "Possui Empréstimo: " + (temEmprestimo ? "Sim" : "Não");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTemEmprestimo() {
        return temEmprestimo;
    }

    public void setTemEmprestimo(boolean temEmprestimo) {
        this.temEmprestimo = temEmprestimo;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", temEmprestimo=" + temEmprestimo + "]";
    }

}
