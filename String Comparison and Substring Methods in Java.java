public class Main {
    public static void main(String[] args) {
        String str1 = "Mountain";
        String str2 = "Mountain";
        boolean equalsResult = str1.equals(str2);
        System.out.println("equals() result: " + equalsResult);

        String str3 = "COMPUTER";
        String str4 = "computer";
        boolean equalsIgnoreCaseResult = str3.equalsIgnoreCase(str4);
        System.out.println("equalsIgnoreCase() result: " + equalsIgnoreCaseResult);

        String str5 = "Java Programming";
        String str6 = "Java Programming";
        int compareToResult = str5.compareTo(str6);
        System.out.println("compareTo() result: " + compareToResult);

        String str7 = "JAVA programming";
        String str8 = "java programming";
        int compareToIgnoreCaseResult = str7.compareToIgnoreCase(str8);
        System.out.println("compareToIgnoreCase() result: " + compareToIgnoreCaseResult);

        String str9 = "Java Programming";
        boolean startsWithResult = str9.startsWith("Java");
        System.out.println("startsWith() result: " + startsWithResult);

        String str10 = "Hello, World!";
        boolean endsWithResult = str10.endsWith("World!");
        System.out.println("endsWith() result: " + endsWithResult);

        String str11 = "Hello, World!";
        String subStr = str11.substring(0, 5);
        System.out.println("substring() result: " + subStr);

        String str12 = "Hello, World!";
        boolean containsResult = str12.contains("World");
        System.out.println("contains() result: " + containsResult);
    }
}