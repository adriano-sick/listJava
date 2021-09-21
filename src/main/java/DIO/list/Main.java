package DIO.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Carro> minhaList = new ArrayList<>();

        minhaList.add(new Carro("Ford"));
        minhaList.add(new Carro("Fiat"));
        minhaList.add(new Carro("Honda"));
        minhaList.add(new Carro("Chevrolet"));
        minhaList.add(new Carro("Volkswagen"));
        minhaList.add(new Carro("Renault"));

        System.out.println(minhaList.contains(new Carro("Ford")));

        System.out.println(minhaList.get(2));

        System.out.println(minhaList.indexOf(new Carro("Volkswagen")));

        System.out.println(minhaList.remove(1));
        System.out.println(minhaList);
    }
}
