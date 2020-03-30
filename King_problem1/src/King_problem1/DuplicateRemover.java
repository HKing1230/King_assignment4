package King_problem1;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class DuplicateRemover {
	
	private Set<String>uniqueWords;
	public DuplicateRemover() {
		uniqueWords = new HashSet<>();
	}
	
	public void write(String outputFile) {
		try {
			PrintWriter printwriter = new PrintWriter(new File(outputFile));
			for (String string : uniqueWords) {
				printwriter.println(string);
			}
			printwriter.flush();
			printwriter.close();
		}catch(FileNotFoundException e) {
			System.out.println("unique_words.txt not found");
		}
	}
	
	public void remove(String dataFile) {
		try {
			Scanner sc = new Scanner(new File(dataFile));
			while (sc.hasNext()) {
				uniqueWords.add(sc.next());
			}
			sc.close();
		}catch (FileNotFoundException e) {
			System.out.println("problem1.txt not found.");
		}
	}
}
