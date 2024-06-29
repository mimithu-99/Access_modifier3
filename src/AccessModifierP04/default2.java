package AccessModifierP04;

public class default2 {
    int id = 123;
    void display(){
        System.out.println("This is a default access modifier");
    }
}

class mainTest{
    public static void main(String[] args) {
        default2 n = new  default2();
        System.out.println(n.id);
        n.display();
    }

}

