import java.util.ArrayList;

public class Comment {

	private User user;
	private String comment;
	private ArrayList<Comment> reply = new ArrayList<Comment>();
	
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Comment(User u, String comment) {
	this.user = u;
	this.comment = comment;
 }

	public void addReply(Comment r) {

		// TODO Auto-generated method stub
		this.reply.add(r);
	}

	public ArrayList<Comment> getReply(){
		return this.reply;
	}
	
	public void print(int indent) {
		String tab = "";
		for(int i = 0; i < indent; i++) {
			tab = tab + "\t";
		}
		System.out.println(tab + "" + this.user.getName() + "(" + this.user.getID() + "): " + this.comment);
		for(int i = 0; i < this.reply.size(); i++) {
			this.reply.get(i).print(indent + 1);
		}
	}
}
