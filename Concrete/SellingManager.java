import java.lang.reflect.Field;

public class SellingManager implements ISelling {

	private Customer customer;
	private Game[] games;
	private Campaign campaigns;
	// private IEntity entity;

	public SellingManager(Customer customer, Game[] games/* ,IEntity entity */) {
		this.customer = customer;
		this.games = games;
		// this.entity=entity;

	}

	public SellingManager(Customer customer, Game[] games, Campaign campaigns) {
		this.customer = customer;
		this.games = games;
		this.campaigns = campaigns;
	}

	@Override
	public void normalSelling() {
		// entities[0].getClass();
		System.out.println(customer.getCode() + "-" + customer.getFullName() + " sipariþi :");
		double total = 0;
		for (Game game : games) {
			System.out.println(game.getId() + "." + game.getCode() + " " + game.getName() + " " + game.getPrice());
			total = total + game.getPrice();
		}

		System.out.println("Toplam :" + total);
		System.out.println("KdvDahilToplam (%18) :" + (total * 1.18));

		/*
		 * Class c = entity.getClass(); for (Field f : c.getDeclaredFields()) {
		 * f.setAccessible(true); try { System.out.println(f.getName() + " = " +
		 * f.get(entity)); } catch (Exception e) { e.printStackTrace(); }
		 * 
		 * }
		 */
	}

	@Override
	public void campaingSelling() {
		System.out.println(customer.getCode() + "-" + customer.getFullName() + " sipariþi :");
		double total = 0;
		double dicountTotal=0;
		for (Game game : games) {
			System.out.println(game.getId() + "." + game.getCode() + " " + game.getName() + " " + game.getPrice());
			total = total + game.getPrice();
		}
		dicountTotal=(total-(total*campaigns.getPercentOfDiscount())/100);
		System.out.println("Toplam :" + total);
		System.out.println("%"+campaigns.getPercentOfDiscount()+" "+campaigns.getCampanyName()+" Kampanyalý Fiyatý :"+dicountTotal);
		System.out.println("KdvDahilToplam (%18) :" + (total * 1.18));

	}
	// TODO Auto-generated method stub

}
