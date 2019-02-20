package StreamAssignment;

public class News 
{
	private int newsid;
	private String postedByUser;
	private String commentByUser;
	private String comment;
	public News(int newsid, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsid = newsid;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsid() {
		return newsid;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public String getComment() {
		return comment;
	}
	
}
