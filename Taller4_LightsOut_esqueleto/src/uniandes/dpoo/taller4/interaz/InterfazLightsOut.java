package uniandes.dpoo.taller4.interaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Ventana principal de la aplicaci�n.
 */
public class InterfazLightsOut extends JFrame
{
	
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Clase principal del mundo.
     */
    private LighstOut LighstOut;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Panel con las opciones.
     */
    private PanelLuces PanelLuces;

    /**
     * Panel con la imagen del encabezado.
     */
    private PanelOpciones PanelOpciones;

    /**
     * Panel con la lista de espacios del centro de convenciones.
     */
    private PanelDificultad PanelDificultad;

    /**
     * Panel con la informaci�n detalla de un espacio.
     */
    private PanelPuntuaciones PanelPuntuaciones;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye la interfaz e inicializa todos sus componentes.
     */
    
    public InterfazLightsOut( )
    {
        try
        {
           LightsOut = new LightsOut();
        }
        catch( PersistenciaException e )
        {
            JOptionPane.showMessageDialog( this, "Error al cargar el estado del mundo.", "Centro de convenciones", JOptionPane.ERROR_MESSAGE );
        }
        catch( FormatoArchivoException e )
        {
            JOptionPane.showMessageDialog( this, "Error en el formato del archivo.", "Centro de convenciones", JOptionPane.ERROR_MESSAGE );
        }

        setLayout( new BorderLayout( ) );
        setSize( 900, 580 );
        setResizable( true );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        setTitle( "LightsOut" );

        panelDificultad = new PanelDificultad( );
        add( panelDificultad, BorderLayout.NORTH );

        panelLightsOut = new PanelLightsOut( this );
        add( panelLightsOut, BorderLayout.WEST );

        panelOpciones = new PanelOpciones( this );
        add( panelOpciones, BorderLayout.EAST );
        
        panelPuntuaciones = new PanelPuntuaciones( this );
        add( panelOpciones, BorderLayout.SOUTH );

        JPanel aux = new JPanel( );
        aux.setLayout( new GridLayout( 2, 1 ) );

        setLocationRelativeTo( null );
        
        actualizarLista( );

    }

 // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Este m�todo se encarga de salvar la informaci�n del sistema, justo antes de cerrar la aplicaci�n.
     */
    
    
   

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------
    /**
     * Este m�todo ejecuta la aplicaci�n, creando una nueva interfaz.
     * @param pArgs No son necesarios.
     */
    public static void main( String[] pArgs )
    {

        InterfazLightsOut interfaz = new InterfazLightsOut( );
        interfaz.setVisible( true );
    }
}
