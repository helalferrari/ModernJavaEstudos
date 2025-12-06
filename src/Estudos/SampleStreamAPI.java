package Estudos;

import java.util.List;
import java.util.stream.Collectors;


public class SampleStreamAPI {

    // O record (classe de dados) deve ser definido fora do método main.
    // Ele pode ser definido aqui dentro da classe principal ou em um arquivo separado.
    record Funcionario(String nome, double salario, String cargo) {}

    public static void main(String[] args) {

        // CORREÇÃO: A variável 'equipe' é declarada DENTRO do método main,
        // onde 'var' é permitido (variável local).
        var equipe = List.of(
                new Funcionario("Ana", 5000, "Dev"),
                new Funcionario("Carlos", 2500, "Estagiario"),
                new Funcionario("Beatriz", 8000, "Gerente"),
                new Funcionario("Daniel", 4500, "Dev")
        );


        List<String> devsRicos = equipe.stream()
                .filter(f -> f.cargo().equals("Dev"))
                .filter(f -> f.salario() > 4000)
                .map(f -> f.nome().toUpperCase())
                .sorted()
                .toList();

        System.out.println(devsRicos); // Resultado: [ANA, DANIEL]
    }
}