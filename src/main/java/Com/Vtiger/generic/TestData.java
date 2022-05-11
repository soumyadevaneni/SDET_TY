package Com.Vtiger.generic;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class TestData {
/**
 * @author Soumya
 * this method gonna create fake data for firstname
 * 
 
 * @return String firstname
 */
	public String getFirstName() {
     Faker faker=new Faker();
     String firstname=faker.name().firstName();
     return firstname;   
	}                                                         
	public String getLastName() {
		Faker faker=new Faker();                                                            
	     String lastName =faker.name().lastName();                  
	     return lastName;
	}
	
	public String getOrgname()
	{
		Faker faker=new Faker();
			String name = faker.company().industry();
				return name;
	}
	  public String getPhoneNumber()
  {
	  Faker faker=new Faker();
	  String phonenumber = faker.phoneNumber().cellPhone();
	  return phonenumber;
  }
  	public String getEmail()
	{
	Faker faker=new Faker();
	String email = faker.internet().emailAddress();
	return email;
}
	
public String getAddress()
{
Faker faker=new Faker();
String add = faker.address().fullAddress();
return add;

}




}
