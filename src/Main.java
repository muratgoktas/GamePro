import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws Exception {
		Calendar date = new GregorianCalendar(1974, 12, 01);

		Customer customer1 = new Customer(1, "Murat", "", "GÖKTAÞ", date, "12345678912");
		CustomerCheckService checkService = new CustomerCheckService();
		checkService.checkIfRealPerson(customer1);
		CustomerManager customerManager1 = new CustomerManager(new MernisServiceAdapter());
		customerManager1.add(customer1);

		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("Kayra");
		customer2.setMiddleName("Deniz");
		customer2.setLastName("GÖKTAÞ");
		customer2.getBirthYear(new GregorianCalendar(2013, 07, 05));
		customer2.setNationalityId("1234567892");

		Game Monopoly = new Game(1, "Monopoly Ödüllü Bankacýlýk Kutu Oyunu", "Hasbro Gaming", 248.86, 30);

		Game game2 = new Game(2, "AgeofEmpairs", "EA game", 19.90, 14);
		Game game3 = new Game(3, "Brawl Stars 3. Seri Kutu Oyunu 360 Adet Kart", "Brawl Stars", 49.90, 13);
		Game game4 = new Game(4, "Zula", "MadByte Games", 9.90, 10);
		Game game5 = new Game(5, "Kabus 22", "GameStore", 49.90, 13);

		Campaign campaign = new Campaign(1, 2, "Pandemi indirimi", 20);

		IEntity[] entities = { customer1, game3, game4, game5, campaign };
		// **********************************************************************
		IEntity entity = customer2;
		// Class c = me.getClass();

		/*
		 * IEntity referansý ile tamýmlanan Custumer,Game ve Camping gibi farklý
		 * yapýlarý tanýmlayýp çaðýrabiliyorsun. getClass() kullanýmý. Class c =
		 * customer1.getClass(); for (Field f : c.getDeclaredFields()) {
		 * f.setAccessible(true); try { System.out.println(f.getName() + " = " +
		 * f.get(customer1)); } catch (Exception e) { e.printStackTrace(); }
		 * 
		 * }
		 */

		// **********************************************************************

		System.out.println(campaign.getCampanyName());
		System.out.println(game2.getPrice());
		System.out.println(customer1.getBirthDate());
		System.out.println(customer1.getFullName());

		Game[] games = { Monopoly, game2 };

		SellingManager normalSellingManager = new SellingManager(customer1, games);
		normalSellingManager.normalSelling();

		Cart cart = new Cart(games);
		
		cart.addToBasket();
		
		cart.takeOutOfCart();
		SellingManager campaingsellingManager = new SellingManager(customer2, games, campaign);
		campaingsellingManager.campaingSelling();
	}

}
