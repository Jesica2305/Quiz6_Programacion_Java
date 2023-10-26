/**
 * Clase Rectangulo que hereda de FiguraGeometrica.
 */
class Triangulo extends FiguraGeometrica {
    /**
     *Atributos.
     */
    private double base;
    private double altura;
    private double hipotenusa;

    /**
     * Constructor de la clase Triangulo.
     * @param nombre
     * @param color
     * @param base
     * @param altura
     * Complejidad Temporal: O(1) Tiempo constante.
     */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
        this.hipotenusa = Math.sqrt(base * base + altura * altura);
    }

    /**
     * Método que calcula el área del Triangulo utilizando la fórmula 0.5 * base * altura.
     * @return retorna el area del Triangulo.
     * Redefine el método obtenerArea de la clase FiguraGeometrica.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return 0.5 * base * altura;
    }

    /**
     * Método que calcula el área del Triangulo utilizando la fórmula base + altura + hipotenusa.
     * @return retorna el area del Triangulo.
     * Redefine el método obtenerArea de la clase FiguraGeometrica.
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return base + altura + hipotenusa;
    }
}

