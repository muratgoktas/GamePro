import java.lang.reflect.Field;

import org.apache.axis.types.Entities;

public class Cart {

	private IEntity[] entities;

	public Cart(IEntity[] entities) {
		this.entities = entities;
	}

	public void addToBasket() {
		
		for (IEntity entity : entities) {
			Class c = entity.getClass();
			for (Field f : c.getDeclaredFields()) {
				f.setAccessible(true);
				try {
					System.out.println(f.getName() + " = " + f.get(entity));
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		System.out.println("Sepete ekle.");

	}

	public static void takeOutOfCart() {
		
		System.out.println("Sepetten Çýkar.");

	}

}
