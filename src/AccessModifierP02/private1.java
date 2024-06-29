package AccessModifierP02;

public class private1 {
    void method1(){
        System.out.println("This is a private access modifier");
    }

    public static void main(String[] args) {
        private1 obj = new private1();
        obj.method1();
    }
}
