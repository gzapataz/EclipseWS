package code;

import javax.swing.JFrame;
import javax.swing.text.GapContent;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActiveHelper;

import annotation.MyAnnotation;

@MyAnnotation(myAttribute="Class")
public class TestClass extends JFrame {

	int i;
	
	public TestClass(){}
	
	public void foo(){
		bar();
	}
	
	@MyAnnotation(myAttribute="Method")
	private int bar(){
		this.i++;
		return this.i;
	}
	
	

}

