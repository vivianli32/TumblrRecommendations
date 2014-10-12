import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SecDegRecommendation_Controller {
	private static final int NUM_POSTS = 100;
	private static final int NUM_REBLOGEES_TO_GET = 3;
	private TumblrAPI_Model myTumblrAPIModel;
	
	private ArrayList<String> sorted1DReblogees; 
	private ArrayList<ArrayList<String>> sorted2DReblogees;
	
	public SecDegRecommendation_Controller(String clientName) {
		sorted1DReblogees = myTumblrAPIModel.getSortedReblogees(clientName);
		
		for (int i = 0; i < 3; i++) {
			if (sorted1DReblogees.size() <= NUM_REBLOGEES_TO_GET) {
				System.out.println("Your tumblr saturation has not reached a threshold value, so"
						+ "we are not able to provide accurate recomendations for you.");
			}
			sorted1DReblogees = myTumblrAPIModel.getSortedReblogees(sorted1DReblogees.get(i));
		}
	}
	

}
