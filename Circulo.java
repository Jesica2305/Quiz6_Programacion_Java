/**
 * Clase circulo que hereda de FiguraGeometrica.
 */
class Circulo extends FiguraGeometrica {
    /**
     *Atributo.
     */
    private double radio;

    /**
     * Constructor de la clase Circulo.
     * @param nombre
     * @param color
     * @param radio
     * Complejidad Temporal: O(1) Tiempo constante.
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Método que calcula el área del círculo utilizando la fórmula π * radio^2.
     * @return retorna el area del círculo
     * Redefine el método obtenerArea de la clase FiguraGeometrica.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     *Método que calcula el perímetro del círculo utilizando la formula 2 * π * radio
     * @return retorna el perímetro del círculo
     * Redefine el método obtenerPerimetro de la clase FiguraGeometrica.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
