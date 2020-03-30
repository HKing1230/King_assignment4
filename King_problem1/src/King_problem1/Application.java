package King_problem1;

public class Application {
public static void main(String[] args) {
	DuplicateRemover duplicateremover = new DuplicateRemover();
	duplicateremover.remove("problem1.txt");
	duplicateremover.write("unique_words.txt");
}
}
