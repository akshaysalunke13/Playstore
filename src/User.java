import java.util.ArrayList;

public class User {

	private String ID;
	private String name;
	private String phoneNo;
	private float balance;
	private OS os;
	private ArrayList<Content> content = new ArrayList<Content>();
	public boolean isPremium = false;
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User (String ID, String name, String phoneNo, int balance, OS os) {
		this.ID = ID;
		this.name = name;
		this.phoneNo = phoneNo;
		this.balance = balance;
		this.os = os;
	}

	public void buyContent(Content c) throws insufficientFundException {
		// TODO
		if(this.isPremium? ( (0.8*c.getPrice())<=this.balance  ) : (c.getPrice() <= this.balance) ) {
			
			this.balance -= this.isPremium? (0.8*c.getPrice()) : c.getPrice();
			c.setNoOfDownloads(c.getNoOfDownloads() + 1);
			content.add(c);
			System.out.println(this.name + " has enough balance and content has been purchased.Current Balance:" + this.balance);
		} else {
			Throwable t = new Throwable("Content price more than user balance");
			throw new insufficientFundException (t);
		}
		
	}
	
	public void buyContent(Game g) throws OSMismatchException, OSVersionException, insufficientFundException {
		// TODO
		if(this.os.getOperatingSys() == g.getOs().getOperatingSys()) {
			
			if(this.os.getVersion() >= g.getOs().getVersion()) {
				buyContent((Content)g);
				
			} else {
				Throwable t = new Throwable("User's OS version(" +this.os.getVersion()+ ") less than required version " + g.getOs().getVersion());
				throw new OSVersionException (t);
			}
			
		} else {
			Throwable t = new Throwable("User's OS (" +this.os.getOperatingSys()+ ") does NOT match required OS " + g.getOs().getOperatingSys());
			throw new OSMismatchException (t);
		}

	}

	
	public void becomePremium() {
		// TODO Auto-generated method stub
		this.isPremium = true;
		System.out.println(this.name + "is now a premium user");
		
	}

	public void showContentBought() {
		// TODO Auto-generated method stub
		System.out.println( this.name + " has bought following content:");
		for (Content content2 : this.content) {
			System.out.println(content2.getAppName());
		}
		
	}

	
	
}
