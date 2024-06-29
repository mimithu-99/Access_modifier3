package AccessModifierP03;

public class protected1 {
    protected void method2(){
        System.out.println("This is a protected access modifier");
    }

    public static void main(String[] args) {
        protected1 ob = new protected1();
        ob.method2();
    }
}
