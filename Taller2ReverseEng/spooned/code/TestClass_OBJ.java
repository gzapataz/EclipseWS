package code;


@annotation.MyAnnotation(myAttribute = "Class")
public class TestClass_OBJ {
    int i;
    
    public TestClass_OBJ() {
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

