package Estudos;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        record Funcionario(String nome, double salario, String cargo) {}

        var equipe = List.of(
                new Funcionario("Ana", 5000, "Dev"),
                new Funcionario("Carlos", 2500, "Estagiario"),
                new Funcionario("Beatriz", 8000, "Gerente"),
                new Funcionario("Daniel", 4500, "Dev")
        );

        // CENÁRIO: Quero o nome de todos os "Devs" que ganham mais de 4000, em caixa alta.

        // MODO ANTIGO (Mentalmente doloroso):
        // Teria que criar lista auxiliar, for, if, adicionar, converter string...

        // MODO MODERNO (Stream API):
        List<String> devsRicos = equipe.stream()
                .filter(f -> f.cargo().equals("Dev"))      // 1. Filtra só quem é Dev
                .filter(f -> f.salario() > 4000)           // 2. Filtra quem ganha > 4k
                .map(f -> f.nome().toUpperCase())          // 3. Transforma o objeto Funcionario apenas no Nome (String)
                .sorted()                                  // 4. Ordena alfabeticamente
                .toList();                                 // 5. Transforma o fluxo de volta em Lista (Java 16+)

        System.out.println(devsRicos);
        // Resultado esperado: [ANA, DANIEL]
    }
}
