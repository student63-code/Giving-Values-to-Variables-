import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Reading {
    public static void main(String args[]) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int intNumber = 0;
        float floatNumber = 0.0f;

        try {
            System.out.println("Enter an Integer: ");
            intNumber = Integer.parseInt(reader.readLine());
            System.out.println("Enter a float number: ");
            floatNumber = Float.parseFloat(reader.readLine());
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } finally {
            System.out.println("intNumber = " + intNumber);
            System.out.println("floatNumber = " + floatNumber);
        }
    }
}
