import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;

public class PlayStore {
	
	// whatever variables you need here.
	// They must all be marked as private
	
	// Declare a private variable (array or similar) to store your Content objects here
	
	// Declare a private variable (array or similar) to store your User objects here
	
	private HashMap<String, Content> content = new HashMap<String, Content>();
	private ArrayList<User> users = new ArrayList<User>();
	
	public PlayStore() {
		// any code you need here
	}
	
	public void add(String id, Content c) {
		// add the content into your content list
		content.putIfAbsent(id, c);
	}
	
	public void add(User u) {
		// add the user to your list of users
		if(this.users.contains(u))
			System.out.println("User exists");
		else
			users.add(u);
	}
	
	
	public void showReadingOfGenre(String genre) {
		// add your code here
		for(HashMap.Entry<String, Content> c: content.entrySet()) {
			
			if(c.getValue().getClass().getSuperclass().getSimpleName().equals("Reading")) {
				Reading r = (Reading)c.getValue();
				if(r.getGenre().equals(genre))
					System.out.println(r.getAppName());
			}
		}
	}
	
	
	public void showContent() {
		
		System.out.println("Name\t\tType");
		
		for(HashMap.Entry<String, Content> c: content.entrySet()) {
			System.out.println(c.getValue().getAppName() +"\t\t"+ c.getValue().getClass().getSimpleName());
		}
	}
	
	public void showContent(Content c) {
		
		System.out.println("Name\t\tType");
		
		for(HashMap.Entry<String, Content> temp: content.entrySet()) {
			
			if(c.getClass().equals(temp.getValue().getClass()))
				
			System.out.println(temp.getValue().getAppName() +"\t\t"+ temp.getValue().getClass().getSimpleName());
		}
	}
	
}