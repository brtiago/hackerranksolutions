package Study.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Funcionario {

    private final int id;
    private final String nome;
    private final String telefone;
    private final int idade;
    private final String[] skills;

    public Funcionario(int id, String nome, String telefone, int idade, String[] skills) {
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

    public String[] getSkills() {
        return skills;
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
                ", skills=" + Arrays.toString(skills) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return id == that.id && idade == that.idade && Objects.equals(nome, that.nome) && Objects.equals(telefone, that.telefone) && Objects.deepEquals(skills, that.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, telefone, idade, Arrays.hashCode(skills));
    }
}
