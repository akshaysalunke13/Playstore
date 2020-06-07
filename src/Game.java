
public class Game extends Content {
	
	private boolean isMultiPlayer;
	private OS os;
	
		Game(String ID, String appName, float price, boolean isMultiPlayer, OS os) {
		super.setID(ID);
		super.setAppName(appName);
		super.setPrice(price);
		this.isMultiPlayer= isMultiPlayer;
		this.setOs(os);
	}

		public OS getOs() {
			return os;
		}

		public void setOs(OS os) {
			this.os = os;
		}

		/*public String getID() {
			
			return super.getID();
		}*/

}
