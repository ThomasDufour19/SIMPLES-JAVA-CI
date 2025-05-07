public class Calculator {
    public static int add(int a, int b) {
        return (a + b);
    }

    public static int remove(int a, int b) {
        return (a - b);
    }
    public static void main(String[] args) {
        System.out.println("Somme : " + add(4, 6));
        System.out.println("Soustraction : " + remove(4, 6));
    }

}