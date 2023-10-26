/**
 * Clase Rectangulo que hereda de FiguraGeometrica.
 */
class Rectangulo extends FiguraGeometrica {
    /**
     *Atributos
     */
    private double lado1;
    private double lado2;

    /**
     * Constructor de la clase Rectangulo.
     * @param nombre nombre del rectangulo.
     * @param color color del rectangulo.
     * @param lado1 base del rectangulo.
     * @param lado2 altura del rectangulo.
     * Complejidad Temporal: O(1) Tiempo constante.
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Método que calcula el área del Rectangulo utilizando la fórmula base * altura.
     * @return retorna el area del Rectangulo.
     * Redefine el método obtenerArea de la clase FiguraGeometrica.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }

    /**
     * Método que calcula el perímetro del Rectangulo utilizando la fórmula 2 * (lado1 + lado2).
     * @return retorna el perímetro del Rectangulo.
     * Redefine el método obtenerPerimetro de la clase FiguraGeometrica.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}





