package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() { 
	  System.out.println("this is grapes");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is apple");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is mango");
  }

}
