public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String result = "Hello, ";
            for (String name : args) {
                result = result + name + ", ";
            }
            // Remove last comma and space, add exclamation
            result = result.substring(0, result.length() - 2) + "!";
            System.out.println(result);
        } else {
            System.out.println("Hello, World!");
        }
    }
}