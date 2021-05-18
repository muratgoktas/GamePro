
import java.rmi.RemoteException;


//import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {


	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result = false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getBirthYear(customer.getBirthDate()));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return result;

	}

}