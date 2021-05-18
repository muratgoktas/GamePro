
public class Game implements IEntity {

	// hepsiburadadan oyuncak kýsmýna bak
	private int id;
	private String name;
	private String saller;
	private String code;
	private double price;
	private int stock;

	public Game() {
	}

	public Game(int id, String name, String saller,  double price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.saller = saller;
		
		this.price = price;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public String getSaller() {
		return saller;
	}

	public void setSaller(String saller) {
		this.saller = saller;
	}

	public String getCode() {
		return this.name.substring(0, 1)+"-"+Integer.toString(this.id);
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
