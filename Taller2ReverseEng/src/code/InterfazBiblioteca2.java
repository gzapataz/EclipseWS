package code;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import annotation.MyAnnotation;

@MyAnnotation(myAttribute="Class")
public class InterfazBiblioteca2 extends JFrame
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante para la serializaci�n.
     */
    private static final long serialVersionUID = 1L;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * F�brica que construye la clase principal del mundo.
     */
    

    /**
     * Login del usuario que est� utilizando la aplicaci�n.
     */
    private String loginUsuario;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Panel principal.
     */
    private JPanel panelPrincipal;

    /**
     * Panel donde est� la imagen.
     */
       /**
     * Panel donde est�n ubicadas las acciones.
     */
    
    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    /**
     * Constructor de interfaz principal de la aplicaci�n.
     */
    public InterfazBiblioteca2( )
    {
        
        setSize( 779, 710 );
        setBackground( new Color( 238, 238, 179 ) );
        setResizable( true );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );

        GridBagConstraints gridBagConstraints12 = new GridBagConstraints( );
        gridBagConstraints12.fill = GridBagConstraints.BOTH;
        gridBagConstraints12.gridy = 1;
        gridBagConstraints12.weightx = 1.0;
        gridBagConstraints12.weighty = 1.0;
        gridBagConstraints12.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints12.gridx = 1;
        GridBagConstraints gridBagConstraints = new GridBagConstraints( );
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridy = 0;
        GridBagConstraints gridBagConstraints1 = new GridBagConstraints( );
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.fill = GridBagConstraints.BOTH;
        gridBagConstraints1.gridwidth = 1;
        gridBagConstraints1.gridy = 1;
        panelPrincipal = new JPanel( );
        panelPrincipal.setLayout( new GridBagLayout( ) );
        panelPrincipal.setMinimumSize( new Dimension( 700, 478 ) );

  

        setTitle( "Biblioteca" );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Registra un nuevo usuario en el sistemas de biblioteca.
     * @param login Login del usuario.
     * @param contrasenia Contrase�a del usuario.
     * @param nombre Nombre del usuario.
     * @throws UsuarioPreexistenteException Si ya existe un usuario con el login ingresado.
     */
   
    /**
     * M�todo para la autenticaci�n del usuario.
     * @param login Login del usuario.
     * @param contrasenia Contrase�a de usuario.
     */
    public void autenticar( String login, String contrasenia )
    {
        if(true )
        {
            loginUsuario = login;
        }
        else
        {
            JOptionPane.showMessageDialog( this, "Nombre de usuario o contrase�a incorrectos", "Error", JOptionPane.ERROR_MESSAGE );
        }
    }

    /**
     * Agrega una copia de un libro a la biblioteca.<br>
     * <b>post:</b> En caso que exista el libro aumenta en uno el n�mero de copias.
     * @param referencia Referencia del libro.
     * @throws LibroInexistenteException Se lanza esta excepci�n cuando se intenta ingresar la copia de un libro que no existe
     */
   

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Main de la aplicaci�n.
     * @param args Lista de argumentos con las que corre la aplicaci�n.
     */
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater( new Runnable( )
        {
            public void run( )
            {
                InterfazBiblioteca2 thisClass = new InterfazBiblioteca2( );
                thisClass.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
                thisClass.setVisible( true );
            }
        } );
    }

}
