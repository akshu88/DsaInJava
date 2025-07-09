public class Comparison {
    public static void main(String[] args) {
        String a = "Akshita";
        String b = "Akshita";
        String c = a;
        // System.out.println(c == a);
        // ==
        // System.out.println(a == b);

        String name1 = new String("Akshita");
        String name2 = new String("Akshita");
        // System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
    }
}
