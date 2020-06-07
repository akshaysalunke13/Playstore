public class Magazine extends Reading

{
	private String mainTitle;
	
	public Magazine(String ID, String appName, float price, String publisher, String genre, int noOfPages, String mainTitle) {
		super.setID(ID);
		super.setAppName(appName);
		super.setPrice(price);
		super.setPublisher(publisher);
		super.setGenre(genre);
		super.setNoOfPages(noOfPages);
		this.mainTitle = mainTitle;
	}

	
}
