package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.github.dockerjava.api.model.Driver;

public class BaseTest {

	@BeforeSuite
	public void init() {
	
	}
	
	@AfterSuite
	public void TearDown() {
	
	}
	
}
