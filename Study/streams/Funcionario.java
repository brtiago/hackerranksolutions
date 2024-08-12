package Study.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Funcionario {

    private final int id;
    private final String nome;
    private final String telefone;
    private final int idade;
    private final Optional<List<String>> skills;

    public Funcionario(int id, String nome, String telefone, int idade, Optional<List<String>> skills) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                ", skills=" + skills +
                '}';
    }
}
