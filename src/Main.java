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
    }
}
