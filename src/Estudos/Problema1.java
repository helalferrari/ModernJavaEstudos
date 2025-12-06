package Estudos;

import java.util.List;

public class Problema1 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .sum();

        System.out.println(resultado);
    }

}
