package code;


@annotation.MyAnnotation(myAttribute = "Class")
public class TestClass extends java.lang.Object {
    int i;
    
    public TestClass() {
    }
    
    public void foo() {
        bar();
    }
    
    @annotation.MyAnnotation(myAttribute = "Method")
    private int bar() {
        (this.i)++;
        return this.i;
    }
    
}

