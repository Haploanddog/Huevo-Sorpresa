package huevoSorpresa;

/**
 * Clase HuevoSorpresaQuesadaGarciaDavid2122
 * Contiene los constructores, variables y métodos para crear y modificar las
 * características de un huevo sorpresa.
 * @author David Quesada García / 1º DAM7
 * @version 1.0
 */
public class HuevoSorpresaQuesadaGarciaDavid2122 {

    // Variables de la clase

    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_maxQuesadaGarciaDavid2122;//precio máximo que puede tener un huevo sorpresa

    /*Constructor por defecto*/

    /**
     * Crea un huevo sorpresa
     */

    public HuevoSorpresaQuesadaGarciaDavid2122() {
    }


    /*Constructor por parámetros*/

    /**
     * Crea un huevo sorpresa a partir de los siguientes parámetros:
     * @param unidades
     * @param precio
     * @param sorpresa
     * @param precio_max
     */

    public HuevoSorpresaQuesadaGarciaDavid2122(int unidades, double precio, String sorpresa, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.sorpresa = sorpresa;
        this.precio_maxQuesadaGarciaDavid2122 = precio_max;
    }

     /**
     * Método getPrecio
     * Devuelve el precio de un huevo sorpresa
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método setPrecio
     * Establece el precio de un huevo sopresa a partir del siguiente parámetro:
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método getPrecio_maxQuesadaGarciaDavid2122
     * Devuelve el precio máximo de un huevo sorpresa
     * @return the precio_maxQuesadaGarciaDavid2122
     */
    public double getPrecio_maxQuesadaGarciaDavid2122() {
        return precio_maxQuesadaGarciaDavid2122;
    }

    /**
     * Método setPrecio_maxQuesadaGarciaDavid2122
     * Establece el precio máximo de un huevo sopresa a partir del siguiente parámetro:
     * @param precio_maxQuesadaGarciaDavid2122 the precio_maxQuesadaGarciaDavid2122 to set
     */
    public void setPrecio_maxQuesadaGarciaDavid2122(double precio_maxQuesadaGarciaDavid2122) {
        this.precio_maxQuesadaGarciaDavid2122 = precio_maxQuesadaGarciaDavid2122;
    }
    /*Método que devuelve el número de huevos sorpresa que tiene la tienda*/

    /**
     * Método Obtener Unidades
     * @return unidades
     */

    public int obtenerUnidades() {
        return this.unidades;
    }

    /*Método que devuelve el precio que tiene cada huevo sorpresa*/

    /**
     * Método Obtener Precio
     * @return getPrecio()
     */

    public double obtenerPrecio() {
        return this.getPrecio();
    }


    /* Método que devuelve la sorpresa que tiene el huevo*/

    /**
     * Método Obtener Sorpresa
     * @return sorpresa
     */

    public String obtenerSorpresa() {
        return sorpresa;
    }

    /* Método que permite modificar la sorpresa del huevo*/

    /**
     * Método Modificar Sorpresa a partir del parámetro:
     * @param sorpresa
     */

    public void modificarSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }


    /*Método que permite modificar el número de huevos sorpresa que tiene la tienda*/

    /**
     * Método Modificar Unidades a partir del parámetro:
     * @param unidades
     */

    public void modificarUnidades(int unidades) {
        this.unidades = unidades;
    }


    /*Método que permite sacar huevos sorpresa si se tiene suficiente dinero y hay 
suficientes unidades en la tienda*/

    /**
     * Método Sacar Huevos Sorpresa
     * Para comprobar si podemos sacar huevos sorpresa a partir de los siguientes parámetros:
     * @param unidades
     * @param dinero
     * @param sorpresaQuesadaGarciaDavid2122
     * @throws Exception si no hay dinero suficiente o no hay suficientes unidades en la tienda
     */

    public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresaQuesadaGarciaDavid2122) throws Exception {
        if (dinero <= 0) {
            throw new Exception("Se necesita una cantidad de dinero positiva");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
        }
        if (this.unidades <= unidades) {
            throw new Exception("No hay suficientes huevos sorpresa en la tienda");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }


    /*Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual 
    el aumento que se indica siempre que no se sobrepase el precio máximo de venta*/

    /**
     * Método Aumentar Precio a partir del parámetro:
     * @param aumento
     * @throws Exception si se sobrepasa el precio máximo de venta
     */

    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxQuesadaGarciaDavid2122() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }
}
