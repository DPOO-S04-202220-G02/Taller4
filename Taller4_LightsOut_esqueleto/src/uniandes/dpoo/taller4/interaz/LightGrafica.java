package uniandes.dpoo.taller4.interaz;

import java.awt.*;

import javax.swing.*;


import uniandes.dpoo.taller4.modelo.Light;
import uniandes.dpoo.taller4.modelo.Light.Clase;

/**
 * Representación gráfica de una silla del avión.
 */
@SuppressWarnings("serial")
public class LightGrafica extends JPanel
{
    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------
    /**
     * Imagen de la silla.
     */
    private ImageIcon imagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la representación gráfica de la silla. <br>
     * <b>post: </b> La imagen de la silla distingue si está libre u ocupada.
     * @param pSilla Silla a representar. pSilla != null.
     */
    public LightGrafica( Light pLight )
    {
        super( new BorderLayout( ) );
        JLabel lLight = new JLabel( );
        if( pLight.darClase( ) == Clase.PRENDIDA)
        {
            imagen = new ImageIcon( "data/imagenes/silla-ejec-asig.png" );
            lLight.setForeground( Color.yellow );
        }
        else if( pLight.darClase( ) == Clase.APAGADA)
        {
            imagen = new ImageIcon( "data/imagenes/silla-ejec-libre.png" );
            lLight.setForeground( Color.black );
        }
      
        setPreferredSize( new Dimension( imagen.getIconWidth( ), imagen.getIconHeight( ) ) );
        setOpaque( false );
        lLight.setPreferredSize( new Dimension( imagen.getIconWidth( ), imagen.getIconHeight( ) ) );
        lLight.setText( "" + pLight.darNumero( ) );
        lLight.setHorizontalAlignment( SwingConstants.CENTER );
        lLight.setVerticalAlignment( SwingConstants.CENTER );
        add( lLight );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    /**
     * Dibuja la imagen de la silla.
     * @param pGrafica Gráfica de la silla.
     */
    public void paint( Graphics pGrafica )
    {
        pGrafica.drawImage( imagen.getImage( ), 0, 0, null, null );
        super.paint( pGrafica );
    }
}