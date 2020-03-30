package King_problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	public Integer wordCounter;
	//stores the word counts from dataFIle
	private Map<String,Integer>m;
	//used to count how many times each word appears in dataFile
	
	public DuplicateCounter(){
		this.wordCounter = 0;
		this.m = new HashMap<>();
	}
	/*
	  takes a single parameter called outputFIle and writes the 
	  contents of wordCounter to the file pointed to by outputFile
	 */
	public void write(String outputFile) {
		FileWriter filewriter;
		PrintWriter printwriter;
		try {
			filewriter = new FileWriter(outputFile);
			printwriter = new PrintWriter(filewriter);
			for(Map.Entry<String,Integer>entry:m.entrySet()) {
				printwriter.write(entry.getKey() + "was read " + 
			entry.getValue() + "times" + System.lineSeparator());
			}
			
			System.out.println("Counts printed to " + outputFile);
			printwriter.flush();
			printwriter.close();
			filewriter.close();	
		}catch(IOException e) {
			System.out.println("Cannot print to " + outputFile);
		}
	}
/*
 count method takes a single parameter called dataFIle of type String
 and uses a map of strings to count how many times each word occurs 
 in dataFile
 */
public void count(String dataFile) {
	Scanner sc;
	try {sc = new Scanner(new File(dataFile));
	while(sc.hasNextLine());{
		String line = sc.nextLine().trim();
		String[] count = line.split("[^\\W)+");
		for(int i = 0; i < count.length; i++) {
            String upper = count[i].toUpperCase();
            Integer count2 = m.get(upper);

            // Check whether to add to existing count variable or make a new one
            if(count2 == null) {
                count2 = 1;
            } else {
                count2 += 1;
            }
            m.put(upper,count2);
		}
		for(String w : count) {
			this.wordCounter = m.get(w);
			if(this.wordCounter == null) {
				this.wordCounter = 1;
			}
			else {
				this.wordCounter++;
			}
			m.put(w, this.wordCounter);
		}
	}
	sc.close();
	}catch(FileNotFoundException e) {
		System.out.println("dataFile not found.");
	}
}
}