//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Estudos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListLinkedList {
    public static void main(String[] args) {
        List<String> compras = new ArrayList();
        compras.add("ovos");
        compras.add("pao");
        compras.add("maça");
        System.out.println((String)compras.get(2));
        Map<String, String> capitais = new HashMap();
        capitais.put("BR", "Brasilia");
        capitais.put("JP", "Tóquio");
        System.out.println((String)capitais.get("BR"));
        Set<String> navegadores = new LinkedHashSet();
        navegadores.add("Chrome");
        navegadores.add("Firefox");
        navegadores.add("Edge");
        navegadores.add("Chrome");

        for(String navegador : navegadores) {
            System.out.println(navegador);
        }

    }
}
