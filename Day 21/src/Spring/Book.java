package Spring;

public class Book {
	
	private int Bid;
	private String Bname;
	private int Bprice;
	private String Bauthor;
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public int getBprice() {
		return Bprice;
	}
	public void setBprice(int bprice) {
		Bprice = bprice;
	}
	public String getBauthor() {
		return Bauthor;
	}
	public void setBauthor(String bauthor) {
		Bauthor = bauthor;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int bid, String bname, int bprice, String bauthor) {
		super();
		Bid = bid;
		Bname = bname;
		Bprice = bprice;
		Bauthor = bauthor;
	}
	@Override
	public String toString() {
		return "Book [Bid=" + Bid + ", Bname=" + Bname + ", Bprice=" + Bprice + ", Bauthor=" + Bauthor + "]";
	}
	
	

}
