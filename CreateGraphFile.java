import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CreateGraphFile {
//data fiels for the CreateGraph File
	private int[][] edges;
	private int numberOfVerticies;
	//data field for tree map to make the graph file from
	private Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
//constructor for the CreateGraphFile class
	public CreateGraphFile(int[][] edges, int numberOfVerticies) {
		//set the paramters passed to equal this. instance of parameters.
		this.edges = edges;
		this.numberOfVerticies = numberOfVerticies;
	}
	//method to create graph file 
	public void createGraphFile() {
		//loops through the edges array
		for (int i = 0; i < edges.length; i++) {
			//takes the first entry in each row as a key for the graph file;
			int key = edges[i][0];
			//takes a key entry and sees if it is in map if not in map add it as a key and increase numberOfVerticies by one
			if (!map.containsKey(key)) {
				numberOfVerticies++;
				//adds the new key to the map and instantiates a new Array List of type integer for the values entries to be held in map
				map.put(key, new ArrayList<Integer>());
				//add the initial edge found for the given key
				map.get(key).add(edges[i][1]);
				//if map already contains key add the corresponding edge vertices to the map
			} else if (map.containsKey(key)) {
				map.get(key).add(edges[i][1]);
			}

		}
		try {
			// creates a file and writes the keys and corresponding edges to a new file called MyGraphEdges.txt
			PrintWriter myWriter = new PrintWriter("MyGraphEdges.txt", "UTF-8");
			//writes the numberOfVerticies at the top of text fiel
			myWriter.println(numberOfVerticies);
			//goes through each key value pair and writes them to the file removing unnecessary characters that dont fit the specified format 
			map.forEach((k, v) -> {
				String removeCharacters = v.toString()
				.replace(",", "")
			    .replace("[", "")
			    .replace("]", "")
			    .trim();
				
				myWriter.write(k + " " + removeCharacters + '\n');
			});
			myWriter.close();
			//catches Exceptio
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		//Prints if the files was creates succesfully
		System.out.println("Succesfully created File");
	
	}
}
