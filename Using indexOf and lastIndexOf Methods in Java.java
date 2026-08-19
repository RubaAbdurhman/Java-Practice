public class Main {
    public static void main(String[] args) {
        String str1 = "This is indexOf method";
        String str2 = "This is lastIndexOf method";
        
        char ch1 = 'i';
        int index1 = str1.indexOf(ch1);
        System.out.println("Task 1: indexOf('i'): " + index1);
        
        char ch2 = 'a';
        int index2 = str2.indexOf(ch2);
        System.out.println("Task 2: indexOf('a'): " + index2);
        
        int fromIndex = 3;
        int index3 = str1.indexOf(ch1, fromIndex);
        System.out.println("Task 3: indexOf('i', 3): " + index3);
        
        int substr4 = 10;
        int index4 = str2.lastIndexOf(ch1, substr4);
        System.out.println("Task 4: lastIndexOf('i', 10): " + index4);
        
        int ch5 = 5;
        int index5 = str1.lastIndexOf(ch1, ch5);
        System.out.println("Task 5: lastIndexOf('i', 5): " + index5);
        
        int ch6 = 6;
        int index6 = str2.lastIndexOf(ch1, ch6);
        System.out.println("Task 6: lastIndexOf('i', 6): " + index6);
        
        int substr7 = 3;
        int index7 = str1.lastIndexOf(ch1, substr7);
        System.out.println("Task 7: lastIndexOf('i', 3): " + index7);
        
        int substr8 = 12;
        int index8 = str2.lastIndexOf(ch1, substr8);
        System.out.println("Task 8: lastIndexOf('i', 12): " + index8);
    }
}