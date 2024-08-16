package Study.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsandoSream {

    public static void main(String[] args) {

        var funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(new Funcionario(1, "Jose da Silva", "1111-1111", 25, Arrays.asList("Python", "Java", "Angular", "PostgreSQL")));
        funcionarios.add(new Funcionario(2, "Maria Santos", "2222-2222", 30, Arrays.asList("HTML", "CSS", "Javascript", "MySql")));
        funcionarios.add(new Funcionario(3, "Ana Maria", "3333-3333", 22, Arrays.asList("C++")));
        funcionarios.add(new Funcionario(4, "Antonio Silveira", "4444-4444", 28, Arrays.asList("Delphi", "PHP", "MySql", "HTML")));
        funcionarios.add(new Funcionario(6, "Fabiana Maria Pereira", null, 52, Arrays.asList("HTML", "CSS", "Bootstrap", "TailwindCSS")));
        funcionarios.add(new Funcionario(6, "Fabiana Maria Pereira", null, 52, Arrays.asList("HTML", "CSS", "Bootstrap", "TailwindCSS"))); // Item repetido propositalmente
        funcionarios.add(new Funcionario(7, "Paulo Ferreira Monteiro", "7777-7777", 15, Arrays.asList("Python", "Java", "Angular", "PostgreSQL")));
        funcionarios.add(new Funcionario(8, "James Oliver", "1111-22222", 74, Arrays.asList("Python", "Java", "Angular", "PostgreSQL")));
        funcionarios.add(new Funcionario(9, "Venceslau Brás Garcia", "2222-33247", 74, Arrays.asList("Delphi", "PHP", "MySql", "HTML")));
        funcionarios.add(new Funcionario(10, "Alberto Roberto", "4444-55555", 22, Arrays.asList("Python", "Java", "Angular", "PostgreSQL")));
        funcionarios.add(new Funcionario(11, "Zeleide Almeida", "5555-444", 34, Arrays.asList("Python", "Golang", "NextJS", "MongoDB")));


        /* forma antiga
        for (var funcionario : funcionarios) {
            System.out.println(funcionario);
        }
        */

        // usando streams
        // funcionarios.forEach(System.out::println);

        /* ordenar lista por idade e por nome
        funcionarios.stream()
                .sorted(Comparator.comparing(Funcionario::getIdade).thenComparing(Comparator.comparing(Funcionario::getNome)))
                .distinct() // só fuciona quando temos equals and hashcode
                .limit(2)
                .forEach(System.out::println);
        */


        /*
        var mediaIdade = funcionarios.stream()
                // se a variável funcionarios estiver definida como List
                // teremos o seguinte erro no campo Funcionario::getIdade abaixo:
                // Non-static method cannot be referenced from a static context
                .mapToInt(Funcionario::getIdade).average();

        System.out.println("Média de idade: " + mediaIdade.getAsDouble());

        System.out.println("Lista de todos os funcionários acima da média");
        funcionarios.stream()
                .filter(f -> f.getIdade() > mediaIdade.getAsDouble())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Lista de todos os funcionários abaixo da média:");
        funcionarios.stream()
                .filter(f -> f.getIdade() < mediaIdade.getAsDouble())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();
         */

        /*
        var maisVelho = funcionarios.stream()
                .max(Comparator.comparing(Funcionario::getIdade)).get(); // isEmpty

        var maisJovem = funcionarios.stream()
                        .min(Comparator.comparing(Funcionario::getIdade)).get();
        System.out.println("Funcionário mais velho: " + maisVelho);
        System.out.println("Funcionário mais jovem: " + maisJovem);
         */

        /*
        System.out.println("Funcionários cujo nome contem ana:");
        funcionarios.stream()
                .filter(f -> f.getNome().toLowerCase().contains("ana"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
         */

        /*
        var somaDasIdades = funcionarios.stream().mapToInt(Funcionario::getIdade).sum();
        System.out.println("Soma das idades: " + somaDasIdades);
         */

        /*
        var funcionarioSet = funcionarios.stream().collect(Collectors.toSet()); //não vai exibir os indices duplicados pois é um set
        funcionarioSet.forEach(System.out::println);
        */

        /*
        // listas de cursos não repetidos
        funcionarios.stream()
                .map(f -> f.getSkills().toString())
                .distinct()
                .forEach(System.out::println);
         */

        List<List<String>> listaDeCursos = funcionarios.stream().map(f -> f.getSkills()).collect(Collectors.toList());
        System.out.println("Lista de Cursos:\n" + listaDeCursos);
        System.out.println();

        List<String> listaDeCursos2 = funcionarios.stream().flatMap(f -> f.getSkills().stream()).distinct().collect(Collectors.toList());
        System.out.println("Lista 2:\n" + listaDeCursos2);

    }
}
