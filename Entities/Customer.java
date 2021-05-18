import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Customer implements IEntity {

	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private Calendar birthDate;
	private String nationalityId;

	public Customer() {

	}

	public Customer(int id, String firstName, String middleName, String lastName, Calendar birthDate,
			String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		if (this.middleName != "" || !this.middleName.isEmpty()) {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
		return this.firstName + " " + this.lastName;
	}

	public String getCode() {
		return this.id + "-" + this.firstName.substring(0, 1) + this.lastName.substring(0, 1);
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public int getBirthYear(Calendar birthDate) {
		return birthDate.get(birthDate.YEAR);
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	
	/*
	 * public String toString() { Class c = getClass(); return "<" + c.getName() +
	 * ": firstName=" + this.firstName + ", lastName=" + this.lastName + ">"; }
	 */
}
