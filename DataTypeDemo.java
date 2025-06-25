import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Creating variables of different primitive types
        byte byteVal = 127;                          // 8-bit signed integer
        short shortVal = 32767;                     // 16-bit signed integer
        int intVal = 2147483647;                    // 32-bit signed integer
        long longVal = 9223372036854775807L;        // 64-bit signed integer (note L suffix)
        float floatVal = 3.4028235E38f;             // 32-bit floating point (note f suffix)
        double doubleVal = 1.7976931348623157E308;  // 64-bit floating point
        char charVal = 'A';                         // 16-bit Unicode character
        boolean boolVal = true;                     // true or false
        
        // Creating reference type variables
        String stringVal = "Hello Java";            // String object
        int[] arrayVal = {1, 2, 3};                 // Array object

        // Display initial values
        System.out.println("--- Initial Values ---");
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal); 
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + boolVal);
        System.out.println("String: " + stringVal);
        System.out.print("Array: ");
        for(int n : arrayVal) System.out.print(n + " ");
        System.out.println("\n");

        // Implicit casting (widening conversion)
        System.out.println("--- Implicit Casting ---");
        short shortFromByte = byteVal;
        int intFromShort = shortVal;
        long longFromInt = intVal;
        float floatFromLong = longVal;
        double doubleFromFloat = floatVal;
        
        System.out.println("short from byte: " + shortFromByte);
        System.out.println("int from short: " + intFromShort);
        System.out.println("long from int: " + longFromInt);
        System.out.println("float from long: " + floatFromLong);
        System.out.println("double from float: " + doubleFromFloat + "\n");

        // Explicit casting (narrowing conversion)
        System.out.println("--- Explicit Casting ---");
        byte byteFromShort = (byte)shortVal;
        short shortFromInt = (short)intVal;
        int intFromLong = (int)longVal;
        long longFromFloat = (long)floatVal;
        float floatFromDouble = (float)doubleVal;
        
        System.out.println("byte from short: " + byteFromShort); 
        System.out.println("short from int: " + shortFromInt);
        System.out.println("int from long: " + intFromLong);
        System.out.println("long from float: " + longFromFloat);
        System.out.println("float from double: " + floatFromDouble + "\n");

        // Character and number conversions
        System.out.println("--- Character Conversions ---");
        System.out.println("char to int: " + (int)charVal);
        System.out.println("int to char: " + (char)65 + "\n");

        // User input with parsing
        System.out.println("--- Getting User Input ---");
        System.out.print("Enter a number (0-255): ");
        byte inputByte = Byte.parseByte(reader.readLine());
        System.out.print("Enter a decimal number: ");
        double inputDouble = Double.parseDouble(reader.readLine());
        
        System.out.println("\nYou entered byte: " + inputByte);
        System.out.println("You entered double: " + inputDouble);
        System.out.println("Their sum: " + (inputByte + inputDouble));
    }
}
