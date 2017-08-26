package addressbook.app;

import lib.Address;

public class AddressBook {

	public static void main(String[] args) {

		Address myAddress = new Address("3040", "Sherbrooke");
		System.out.println(myAddress.getAddress());


	}

}
