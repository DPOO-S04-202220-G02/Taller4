package uniandes.dpoo.taller4.interaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel con los opciones.
 */
public class PanelOpciones extends JPanel implements ActionListener
{

	/**
     * Constante que representa el comando Ordenar.
     */
    private final static String NUEVO = "Nuevo";

    private final static String REINICIAR = "Reiniciar";
    
    private final static String TOP10 = "Top-10";
    
    private final static String CAMBIARJ = "Cambiar Jugador";
	
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicaci�n.
     */
    private InterfazLightsOut principal;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Bot�n Opci�n 1.
     */
    private JButton btnNuevo;

    /**
     * Bot�n Opci�n 2.
     */
    private JButton btnReiniciar;
    
    /**
     * Bot�n Opci�n 1.
     */
    private JButton btnTop;

    /**
     * Bot�n Opci�n 2.
     */
    private JButton btnCambiarJ;


    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel.
     * @param pPrincipal Ventana principal. pPrincipal != null.
     */
    public PanelOpciones( InterfazLightsOut pPrincipal )
    {
        principal = pPrincipal;

        setBorder( new TitledBorder( "Opciones" ) );
        setLayout( new GridLayout( 1, 3 ) );

        // Bot�n opci�n 1
        btnNuevo = new JButton( "NUEVO" );
        btnNuevo.setActionCommand( NUEVO );
        btnNuevo.addActionListener( this );
        add( btnNuevo );

        // Bot�n opci�n 2
        btnReiniciar = new JButton( "REINICIAR" );
        btnReiniciar.setActionCommand( REINICIAR );
        btnReiniciar.addActionListener( this );
        add( btnReiniciar );
        
        btnTop = new JButton( "TOP-10" );
        btnTop.setActionCommand( TOP10 );
        btnTop.addActionListener( this );
        add( btnTop );

        // Bot�n opci�n 2
        btnCambiarJ = new JButton( "CAMBIAR JUGADOR" );
        btnCambiarJ.setActionCommand( CAMBIARJ );
        btnCambiarJ.addActionListener( this );
        add( btnCambiarJ );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Manejo de los eventos de los botones
     * @param pEvento Acci�n que gener� el evento. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        if( NUEVO.equals( pEvento.getActionCommand( ) ) )
        {
            principal.nuevo( );
        }
        else if( REINICIAR.equals( pEvento.getActionCommand( ) ) )
        {
            principal.reiniciar( );
        }
        else if( TOP10.equals( pEvento.getActionCommand( ) ) )
        {
            principal.top10( );
        }
        else if( CAMBIARJ.equals( pEvento.getActionCommand( ) ) )
        {
           principal.cambiarj( );
        }
    }

}
