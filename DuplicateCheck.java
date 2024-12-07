import java.io.*;
import java.util.*;

public class DuplicateCheck {

    public static void main(String[] args) throws IOException {
        // wehere we read the file
        BufferedReader reader = new BufferedReader(new FileReader("duplicate.txt"));
        int numWords = Integer.parseInt(reader.readLine()); 
        
        // creating an array to store words from lists
        String[] list1 = new String[numWords];
        String[] list2 = new String[numWords];
        
        
        for (int i = 0; i < numWords; i++) {
            String[] line = reader.readLine().split(" ");
            list1[i] = line[0]; 
            list2[i] = line[1]; 
        }

        reader.close();
        
        
        if (isIdentical(list1, list2)) {
            System.out.println("The lists are identical.");
        } else {
            System.out.println("The lists are not identical.");
        }
    }

    
    public static boolean isIdentical(String[] list1, String[] list2) {
        
        Arrays.sort(list1);
        Arrays.sort(list2);

        
        return Arrays.equals(list1, list2); 
    }
}
