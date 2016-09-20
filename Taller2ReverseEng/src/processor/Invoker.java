package processor;

import spoon.Launcher;
/**
 * Main class, initializes and invokes a spoon processor
 * @author carlos
 */
public class Invoker {

	public static void main(String args[]){
		Invoker invoker = new Invoker();
		//Source code path, and processor to be executed
		//invoker.invokeSpoon("./src/code/alfa.java", "processor.Processor");
		//invoker.invokeSpoon("./src/code/InterfazBiblioteca.java", "processor.Processor");
		invoker.invokeSpoon("./src/code/TestClass.java", "processor.Processor");
		//invoker.invokeSpoon("./resources/n15_biblioteca/source/uniandes/cupi2/biblioteca/mundo/implementacion1/Biblioteca.java", "processor.Processor");
		//invoker.invokeSpoon("./resources/n15_biblioteca/source/uniandes/cupi2/biblioteca/mundo/AbstractBiblioteca.java", "processor.Processor");
		//invoker.invokeSpoon("./resources/n15_biblioteca/source/uniandes/cupi2/biblioteca/mundo/", "processor.Processor");
		//invoker.invokeSpoon("/Users/gabrielzapata/Documents/workspace/Cupi2-Biblio/src/uniandes/cupi2/biblioteca/mundo/", "processor.Processor");
		
		//invoker.invokeSpoon("/Users/gabrielzapata/Documents/workspace/Cupi2-Biblio/src/uniandes/cupi2/biblioteca/mundo/excepciones/CopiasInsuficientesException.java", "processor.Processor");
		//invoker.invokeSpoon("/Users/gabrielzapata/Documents/workspace/Cupi2-Biblio/src/uniandes/cupi2/biblioteca/mundo/ILibro.java", "processor.Processor");
		
		//invoker.invokeSpoon("/Users/gabrielzapata/Documents/workspace/Cupi2-Biblio/src/uniandes/cupi2/biblioteca/mundo/AbstractBiblioteca.java", "processor.Processor");
		
		//invoker.invokeSpoon("/Users/gabrielzapata/Documents/workspace/Cupi2-Biblio/src/uniandes/cupi2/biblioteca/mundo/IUsuario.java", "processor.Processor");
		//invoker.invokeSpoon("/Users/gabrielzapata/Documents/workspace/Cupi2-Biblio/src/uniandes/cupi2/biblioteca/mundo/IFabricaBiblioteca.java", "processor.Processor");
		
	}
	/**
	 * Invokes a spoon processor individually
	 * 
	 * @param source
	 *            sources to be processed by spoon
	 * @param processor
	 *            spoon processor to executeq
	 */
	protected void invokeSpoon(String source, String processor) {
		// Invoke spoon processor for methods
		String[] spoonArgs = new String[6];
		spoonArgs[0] = "-i";
		spoonArgs[1] = source;
		spoonArgs[2] = "-p";
		spoonArgs[3] = processor;
		spoonArgs[4] = "--compliance";
		spoonArgs[5] = "7";
		try {
			Launcher.main(spoonArgs);
		} catch (Exception e) {
			System.err.println("Error while executing spoon launcher "
					+ e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
	}
}
