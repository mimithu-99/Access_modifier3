package AccessModifierP01;

public class public1 {
    void publicAccess(){
        System.out.println("This a public modifier");
    }
    public boolean name(){
        String name = "Muntaha";
        return true;

    }
    public int number (int a, int b){
        return a + b;

    }
    public static void main(String[] args) {
        public1 n = new public1();
        n.publicAccess();
        System.out.println(n.name());
        System.out.println(n.number(25, 25));


    }
}
