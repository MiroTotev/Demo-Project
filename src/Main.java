import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        String[] word = {"hi", "Hello", "Hello world", "My name is", " new branch"};

        String[] word1 = new String[args.length];
        word1 = word;
        System.out.println("Обърнат масив: " + Arrays.toString(word1)); // Danix comment


        System.out.println("word : " + word1.length);
        System.out.println("Name" + Arrays.toString(word)); // Danix comment 2
        System.out.print(" Name");
        // New Line 17
        // new line 18
		// Danix New Line 1
        System.out.print( " Name 1");
    }
}
