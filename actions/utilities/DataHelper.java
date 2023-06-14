package utilities;

import java.util.Locale;

import com.github.javafaker.Faker;

public class DataHelper {
	private Locale local = new Locale("en");
	private Faker fake = new Faker(local);

	public static DataHelper getDataHelper() {
		return new DataHelper();
	}

	public String getFirstName() {
		return fake.address().firstName();
	}

	public String getLastName() {
		return fake.address().lastName();
	}

	public String getEmailAddress() {
		return fake.internet().emailAddress();
	}

	public String getCityName() {
		return fake.address().cityName();
	}

	public String getPhoneNumber() {
		return fake.phoneNumber().cellPhone();
	}

	public String getAddress() {
		return fake.address().streetAddress();
	}

	public String getPassword() {
		return fake.internet().password();
	}

}
