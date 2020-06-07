
public class OS {
	
	private String operatingSys;
	private int version;
	
	public OS (String operatingSys, int version) {
		this.setOperatingSys(operatingSys);
		this.setVersion(version);
	}

	public String getOperatingSys() {
		return operatingSys;
	}

	public void setOperatingSys(String operatingSys) {
		this.operatingSys = operatingSys;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
