package Assignmentno3;

	import java.util.*;

	public class Q5 {
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>(Arrays.asList("red", "blue", "yellow", "orange"));

	        System.out.println("Original List using Iterator:");
	        Iterator<String> it = colors.iterator();
	        while (it.hasNext()) {
	            System.out.print(it.next() + " ");
	        }

	        System.out.println("\n\nReverse List using ListIterator:");
	        ListIterator<String> lit = colors.listIterator(colors.size());
	        while (lit.hasPrevious()) {
	            System.out.print(lit.previous() + " ");
	        }

	        List<String> newColors = Arrays.asList("pink", "green");
	        int index = colors.indexOf("yellow");
	        colors.addAll(index, newColors);

	        System.out.println("\n\nList after insertion: " + colors);
	    }
	}
