package uniandes.dpoo.taller4.modelo;

//import uniandes.cupi2.avion.mundo.Pasajero;
import uniandes.dpoo.taller4.modelo.Light.Clase;
import uniandes.dpoo.taller4.modelo.Light.Ubicacion;

/**
 * Silla del avión.
 */
public class Light
{
    // -----------------------------------------------------------------
    // Enumeraciones
    // -----------------------------------------------------------------

    /**
     * Enumeradores para las clases a las que pertenece una silla.
     */
    public enum Clase {
        /**
         * Representa la clase ejecutiva.
         */
        PRENDIDA,

        /**
         * Representa la clase económica.
         */
        APAGADA
    }

    /**
     * Enumeradores para las ubicaciones de las sillas.
     */
    public enum Ubicacion {
        /**
         * Representa la ubicación ventana.
         */
        VENTANA,

        /**
         * Representa la ubicación centro.
         */
        CENTRAL,

        /**
         * Representa la ubicación pasillo.
         */
        PASILLO
    }

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Número de la silla.
     */
    private int numero;

    /**
     * Clase de la silla.
     */
    private Clase clase;

    /**
     * Ubicación de la silla.
     */
    private Ubicacion ubicacion;


    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la silla con su número identificador. <br>
     * <b>post: </b> El objeto silla tiene sus datos básicos número, clase y ubicación asignados. El pasajero no está asignado y tiene valor null.
     * @param pNumero Número de silla. pNumero > 0.
     * @param pClase Clase de silla. pClase pertenece {EJECUTIVA,ECONOMICA}.
     * @param pUbicacion Ubicación de la silla. pUbicacion pertenece {VENTANA, CENTRAL, PASILLO}.
     */
    public Light( int pNumero, Clase pClase  )
    {
        numero = pNumero;
        clase = pClase;

    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------


    /**
     * Retorna el número de la silla.
     * @return Número de la silla.
     */
    public int darNumero( )
    {
        return numero;
    }

    /**
     * Retorna la clase de la silla.
     * @return Clase de la silla.
     */
    public Clase darClase( )
    {
        return clase;
    }

    /**
     * Retorna la ubicación de la silla.
     * @return Ubicación de la silla.
     */
    public Ubicacion darUbicacion( )
    {
        return ubicacion;
    }
}