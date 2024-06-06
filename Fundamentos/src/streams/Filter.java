package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jó", 4.2);
        Aluno aluno2 = new Aluno("Ana", 6.1);
        Aluno aluno3 = new Aluno("Mandy", 9.4);
        Aluno aluno4 = new Aluno("Pedro", 8.0);
        Aluno aluno5 = new Aluno("Jheny", 7.5);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7.0;
        Function<Aluno, String> mensagemAprovado = aluno -> "Parabéns " + aluno.nome + ", você foi aprovado(a)!";

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);
//        Utilizar lambdas como argumento para filter e map
//        alunos.stream()
//                .filter(aluno -> aluno.nota >= 7.0)
//                .map(aluno -> "Parabéns " + aluno.nome + ", você foi aprovado(a)")
//                .forEach(System.out::println);
        alunos.stream()
                .filter(aprovado)
                .map(mensagemAprovado)
                .forEach(System.out::println);
    }
}
