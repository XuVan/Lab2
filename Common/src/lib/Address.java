/**
 *  Defines an Address type.
 */

package lib;

/**
 * @author Your name
 */

public class Address {
	private String city = "";
	private String civicNumber = "";
	private String province = "";
	private String code = "";
	private String streetName = "";

	public Address() {
	}

	public Address(String civicNumber, String streetName) {
		this.civicNumber = civicNumber;
		this.streetName = streetName;
	}

	/**
	 * Returns a String representation of the address.
	 * 
	 * @return address a formatted address.
	 */
	public String getAddress() {
		String address = civicNumber + " " + streetName;

		return address;
	}

}
