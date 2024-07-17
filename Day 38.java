public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
            // Example of a checked exception (FileNotFoundException)
            readFile("nonexistentfile.txt");
            
            // Example of an unchecked exception (ArithmeticException)
            int result = divide(10, 0);
            System.out.println("Result: " + result);
            
        } catch (FileNotFoundException e) {
            System.out.println("Caught a FileNotFoundException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }

        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older to vote.");
        }
    }
}
