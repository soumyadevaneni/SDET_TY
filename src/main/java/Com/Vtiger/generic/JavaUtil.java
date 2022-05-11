package Com.Vtiger.generic;
import java.sql.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtil {
@Test
public int createRandomnumber() {
	Random random=new Random();
	int number=random.nextInt(1000);
	return number;
	
}

public String getDate() {
	
	   Date date = new Date(0);
	
	return date.toString();
}
}
