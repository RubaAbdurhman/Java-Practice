public class Main {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original string: " + str);

        String substring = str.substring(4);
        System.out.println("Substring(beginIndex): " + substring);

        String substring2 = str.substring(4, 19);
        System.out.println("Substring(beginIndex, endIndex): " + substring2);
    }
}
