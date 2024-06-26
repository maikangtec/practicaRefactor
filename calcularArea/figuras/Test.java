package figuras;

/**
 * Clase Test de tipo main que crea 2 circulos
 * y los compara
 */

public class Test {
    public static void main(String[] args) {
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);

        if (c2.esIgual(c3, false))
            System.out.println("c2 y c3: iguales sin considerar decimales");

        if (c2.esIgual(c3, true))
            System.out.println("c2 y c3: iguales considerando decimales");
    }

}
