package Study.streams;

import java.util.ArrayList;
import java.util.List;

public class UsandoSream {

    public static void main(String[] args) {

        List funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(new Funcionario(1, "Jose da Silva", "1111-1111", 25, new String[] {"Python", "Java", "Angular", "PostgreSQL"}));
        funcionarios.add(new Funcionario(2, "Maria Santos", "2222-2222", 30, {"HTML", "CSS", "Javascript", "Next.JS"}));
        funcionarios.add(new Funcionario(3, "Ana Maria", "3333-3333", 22));
        funcionarios.add(new Funcionario(4, "Antonio Silveira", "4444-4444", 28));
        funcionarios.add(new Funcionario(6, "Fabiana Maria Pereira", null, 52));
        funcionarios.add(new Funcionario(6, "Fabiana Maria Pereira", null, 52)); // Item repetido propositalmente
        funcionarios.add(new Funcionario(7, "Paulo Ferreira Monteiro", "7777-7777", 15));
        funcionarios.add(new Funcionario(8, "James Oliver", "1111-22222", 74));
        funcionarios.add(new Funcionario(9, "Venceslau Brás Garcia", "2222-33247", 74));
        funcionarios.add(new Funcionario(10, "Alberto Roberto", "4444-55555", 22));
        funcionarios.add(new Funcionario(11, "Zeleide Almeida", "5555-444", 34));


        /* forma antiga
        for (var funcionario : funcionarios) {
            System.out.println(funcionario);
        }
        */

        // usando streams
        funcionarios.stream().forEach(System.out::println);



    }
}
