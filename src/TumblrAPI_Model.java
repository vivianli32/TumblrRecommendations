import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TumblrAPI_Model {
	public String me = "petersblog"; // client
	//peter's top reblogs
	public String[] peter = new String[]{"pvilian", "ruijia", "eddie"};
	//peter's top 1's top reblogs (including extra in case peter already follows them
	public String[] pvilian = new String[]{"HAHAHAbob", "loljane", "feminismjulie"};
	//peter's top 2's top reblogs (including extra in case peter already follows them
	public String[] ruijia = new String[]{"environmentbeth", "climbingsasha", "randomclara"};
	//peter's top 3's top reblogs (including extra in case peter already follows them
	public String[] eddie = new String[]{"foodjohn", "tattooclyde", "dancebryan"};
	
	private final static int NUM_POSTS = 100; 
		
	public TumblrAPI_Model() {
		
	}
	/**
	 * Using tumblr API, gives us the first n reblogees from client's first n posts
	 * @param clientname
	 * @param numPosts
	 * @return a String Array of all of the client's post sources
	 */
	public String[] getAllPosts(String clientname, int numPosts) {
		return null;
	}
	
	/**
	 * Counts frequency of reblogees
	 * @param reblogees
	 * @return Map of reblogee username to frequency
	 */
	public Map<String, Integer> countFreq(String[] reblogees) {
		return null;
	}
	
	/**
	 * Sort reblogees by frequency
	 * @return sorted ArrayList
	 */
	public ArrayList<String> sortByFreq(Map<String, Integer> countedReblogees) {
		return null;
	}	
	
	public ArrayList<String> getSortedReblogees(String clientName) { 
		TumblrAPI_Model myTumblrAPIModel = new TumblrAPI_Model();
		String[] clientReblogees = myTumblrAPIModel.getAllPosts(clientName, NUM_POSTS);
		Map<String, Integer> clientReblogeesCounted = myTumblrAPIModel.countFreq(clientReblogees);
		ArrayList<String> clientSortedCountedReblogees= myTumblrAPIModel.sortByFreq(clientReblogeesCounted);
		return clientSortedCountedReblogees;
	}
	
}