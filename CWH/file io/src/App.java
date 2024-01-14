// Java I/O (Input and Output) is used to process the input and produce the output.

// Java uses the concept of a stream to make I/O operation fast. The java.io package contains all the classes required for input and output operations.
// A stream is a sequence of data. In Java, a stream is composed of bytes. It's called a stream because it is like a stream of water that continues to flow.

import java.io.File;
// import java.io.FileWriter;
// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Creating a file object
        /*
        File f = new File("sample.txt");
        f.createNewFile();
        */

        // Writing to a file
        /*
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("This is a text file\n");
        fw.close(); // Just like how we close Scanner class object

        FileWriter fw2 = new FileWriter("sample2.txt"); // If a filename is provided that do not exist, then the file gets created
        fw2.write("This is also a text file\n");
        fw2.close();

        // Appending to an existing file
        // There's no separate method to append text to file
        // We need to create the file object in append mode

        FileWriter fw_a = new FileWriter("sample.txt",true);
        fw_a.write("This text is appended\n");
        fw_a.close();
        */

        // Reading a file
        /*
        File fr = new File("quantum mechanics.txt");

        try {
            Scanner sc = new Scanner(fr);   // The file may or may not exist, thus this is surrounded in try-catch block

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
                // This code translates to : 'As long as there are text lines in the file, keep printing them'
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        */

        // Deleting an existing file
        File f2 = new File("sample2.txt");
        f2.delete();

        // Even if the specified file doesn't exist, it won't throw an exception
    }
}
