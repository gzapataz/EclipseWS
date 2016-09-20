package code;


public class InterfazBiblioteca {
    /** 
     * Constante para la serializaci�n.
     */
    private static final long serialVersionUID = 1L;
    
    /** 
     * Login del usuario que est� utilizando la aplicaci�n.
     */
    private java.lang.String loginUsuario;
    
    /** 
     * Panel principal.
     */
    private javax.swing.JPanel panelPrincipal;
    
    /** 
     * Constructor de interfaz principal de la aplicaci�n.
     */
    public InterfazBiblioteca() {
        java.awt.GridBagConstraints gridBagConstraints12 = new java.awt.GridBagConstraints();
        gridBagConstraints12.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints12.gridy = 1;
        gridBagConstraints12.weightx = 1.0;
        gridBagConstraints12.weighty = 1.0;
        gridBagConstraints12.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints12.gridx = 1;
        java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridy = 0;
        java.awt.GridBagConstraints gridBagConstraints1 = new java.awt.GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints1.gridwidth = 1;
        gridBagConstraints1.gridy = 1;
        panelPrincipal = new javax.swing.JPanel();
    }
    
    /** 
     * M�todo para la autenticaci�n del usuario.
     * @param login Login del usuario.
     * @param contrasenia Contrase�a de usuario.
     */
    public void autenticar(java.lang.String login, java.lang.String contrasenia) {
        if (true) {
            loginUsuario = login;
        } else {
        }
    }
    
    /** 
     * Main de la aplicaci�n.
     * @param args Lista de argumentos con las que corre la aplicaci�n.
     */
    public static void main(java.lang.String[] args) {
        javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
            public void run() {
                code.InterfazBiblioteca thisClass = new code.InterfazBiblioteca();
            }
            
        });
    }
    
}

