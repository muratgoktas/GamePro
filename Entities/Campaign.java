
public class Campaign implements IEntity {
	private int id;
	private int gameId;
	private String campanyName;
	private int percentOfDiscount;

	public Campaign(int id, int gameId, String campanyName, int percentOfDiscount) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.campanyName = campanyName;
		this.percentOfDiscount = percentOfDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampanyName() {
		return campanyName;
	}

	public void setCampanyName(String campanyName) {
		this.campanyName = campanyName;
	}

	public int getGameId() {
		return gameId;
	}

	public int getPercentOfDiscount() {
		return percentOfDiscount;
	}

	public void setPercentOfDiscount(int percentOfDiscount) {
		this.percentOfDiscount = percentOfDiscount;
	}

}
