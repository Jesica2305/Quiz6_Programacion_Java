/**
 * clase para las figuras geometricas.
 */
class FiguraGeometrica {
    /**
     * Atributos.
     */
    private String nombre;
    private String color;

    /**
     *
     * @param nombre nombre de la figura.
     * @param color color de la figura.
     * Complejidad Temporal: O(1) Tiempo constante.
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public double obtenerArea() {
        return 0.0;
    }

    public double obtenerPerimetro() {
        return 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }
}
