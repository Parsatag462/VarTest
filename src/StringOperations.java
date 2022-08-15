public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Justin";
        String str3 = "You are " + str2;

        System.out.println("Welcome: " + str3 + "\n" + str1.length() + "\n"+ str3.substring(0, 5)+"\n"+ str2.toUpperCase());

        System.out.println("\nComparison: " + str1.compareTo(str2) + "\nEquals: " + str1.equals(str2));
    }
}
