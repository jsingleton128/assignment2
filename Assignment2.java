import java.util.ArrayList;

public class Assignment2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Blue");
		list.add("jean");
		list.add("baby");
		list.add("LA");
		list.add("lady");
		list.add("seamstress");
		list.add("for");
		list.add("the");
		list.add("band");
		list.add("Pretty");
		list.add("eyed");
		list.add("pirate");
		list.add("smile");
		list.add("You'll");
		list.add("marry");
		list.add("a");
		list.add("music");
		list.add("man");

		System.out.println(list);

		removeEvenLength(list);

		System.out.println(list);
	}

	public static void removeEvenLength(ArrayList list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			String word = (String) list.get(i);
			System.out.println(word + " " + word.length());
			if (word.length() % 2 == 0) {
				list.remove(i);
			}
		}
	}

}
