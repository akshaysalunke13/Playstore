import java.util.ArrayList;

abstract public class Content {
	
	private String ID;
	private String appName;
	private int noOfDownloads = 0;
	private float price;
	// collection of reviews="";//
	private ArrayList<Comment> reviews = new ArrayList<Comment>();
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public int getNoOfDownloads() {
		return noOfDownloads;
	}

	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ArrayList<Comment> getReviews() {
		return reviews;
	}

	public void setReviews(ArrayList<Comment> reviews) {
		this.reviews = reviews;
	}

	public void addReview(Comment c) {
		reviews.add(c);
	}
	
	public void showReviews() {
		//SHow all comments
		System.out.println("\n***Comments for " + this.appName);
		for(int i = 0; i < reviews.size(); i ++)
			reviews.get(i).print(0);
		

	}

}