import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int x;
        x = 4 + 6;
        // --------------------------------------------------
        String s = "test string";
        // --------------------------------------------------
        String y1 = "   123   ";
        int y2 = Integer.parseInt(y1.trim());
        // --------------------------------------------------
        char c = 'X'; // '
        String converted = "" + c; // converted to String
        // --------------------------------------------------
        System.out.println("Hello World");
        System.out.println("x=" + x);
        System.out.println("y2=" + y2);
        System.out.println("Charcode of 50 is " + (char) 50);
        // --------------------------------------------------

        int arr[] = new int[4];
        int arr2[] = new int[]{5, 6, 7, 8};
        System.out.println("Arr[2]=" + arr[2]);

        // TYPES:
        // primitives
        boolean b;
        byte bt;    // 1 byte
        char cc;    // 2
        short ss;   // 2
        int i;      // 4
        float f;    // 4
        long l;     // 8
        double d;   // 8

        // --------------------
        printPerson("Ivan", 24);

    }

    // read from console
    public static void main2(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt(); // get integer
        double d = scanner.nextDouble();
        System.out.println(q);

    }

    public static void printPerson(String name, int age) {
        System.out.println("Name " + name + ", Age " + age);
    }
}
