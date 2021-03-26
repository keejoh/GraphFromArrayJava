/*KeeJoh O'Hearon
 * Data Structures
 * Project 3 Task 1
 * 
 */
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.io.PrintWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		//counter for the number of verticies in the graph
		int numberOfVerticies = 0;
		//array of edges for the graph
		int[][] edges = { { 0, 1 }, { 0, 3 }, { 0, 5 }, { 1, 0 }, { 1, 2 }, { 1, 3 }, { 2, 1 }, { 2, 3 }, { 2, 4 },
				{ 2, 10 }, { 3, 0 }, { 3, 1 }, { 3, 2 }, { 3, 4 }, { 3, 5 }, { 4, 2 }, { 4, 3 }, { 4, 5 }, { 4, 7 },
				{ 4, 8 }, { 4, 10 }, { 5, 0 }, { 5, 3 }, { 5, 4 }, { 5, 6 }, { 5, 7 }, { 6, 5 }, { 6, 7 }, { 7, 4 },
				{ 7, 5 }, { 7, 6 }, { 7, 8 }, { 8, 4 }, { 8, 7 }, { 8, 9 }, { 8, 10 }, { 8, 11 }, { 9, 8 }, { 9, 11 },
				{ 10, 2 }, { 10, 4 }, { 10, 8 }, { 10, 11 }, { 11, 8 }, { 11, 9 }, { 11, 10 } };
		//welcome message for the program
		System.out.println(
				"Welcome and thank you for using our program. \n A graph file will be created from the provided two dimensional array and follow the specified format. "
						+ " \n The file will be placed in the folder for this program.");
		//creates an instance of CreateGraph class passing the array of edges and the intial number of verticies
		CreateGraphFile myGraphFile = new CreateGraphFile(edges, numberOfVerticies);
		//creates graph files from myGraphFile Object
		myGraphFile.createGraphFile();
	}

}
