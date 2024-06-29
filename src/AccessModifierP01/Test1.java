package AccessModifierP01;

public class Test1 {
    public static void main(String[] args) {
        public1 ob = new public1();

        ob.publicAccess();
//        ob.name();
//        ob.number(10,20);
        System.out.println(ob.number(20, 30));
        System.out.println(ob.name());


    }

}
