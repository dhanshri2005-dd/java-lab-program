package Assignmentno3;
import java.io.*;

	public class Q4 {
	    public static void main(String[] args) {
	        try {
	            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

	            int lines = 0, words = 0, chars = 0;
	            String line;

	            while ((line = br.readLine()) != null) {
	                lines++;
	                chars += line.length();
	                words += line.trim().split("\\s+").length;
	            }

	            br.close();

	            System.out.println("Lines: " + lines);
	            System.out.println("Words: " + words);
	            System.out.println("Characters: " + chars);

	        } catch (IOException e) {
	            System.out.println("File Error: " + e);
	        }
	    }
	}


