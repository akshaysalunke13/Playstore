public class Book extends Reading 
{
	private String authName[];
	
	public Book(String ID, String bookTitle, float bookPrice, String publisher,String genre, int noOfPages,String[] authName) 
	{
		super.setID(ID);
		super.setAppName(bookTitle);
		super.setPrice(bookPrice);
		super.setPublisher(publisher);
		super.setGenre(genre);
		super.setNoOfPages(noOfPages);
		this.authName = authName;
	}

	/*public String getID() {
		
		return super.getID();
		
	}*/

}
