// Abdalla Fadl Shehata
// 20190305
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {  
        
        
        Scanner input = new Scanner (System.in);
        vector v = new vector();
        v.originalImage = v.readImage("dog.jpg");
        System.out.println("Enter width and hight of vector ");
        v.vectorWidth = input.nextInt();
        v.vectorHeight = input.nextInt(); 
        System.out.println("Enter number of vectors ");
        v.nVectors = input.nextInt(); 
        v.compression();
        v.writeToFile("compressed.txt");
        v.readFromFile("compressed.txt");
        v.decompression();
        v.writeImage(v.reconstructedImage, "out.jpg");
        
        
        
    }
    
}
