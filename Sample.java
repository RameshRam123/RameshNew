package org.com;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.TestNGClassFinder;


public class Sample extends Baseclass {

	//public static void main(String[] args) throws InterruptedException {
	@BeforeClass
//		@BeforeClass
		private void BeforeClass() {
			
			getdriver();
			loadurl("https://blazedemo.com/");
		}
			@Test
			private void testMethod() {
				Baseclass base = new Baseclass();
			Pomclass pom= new Pomclass();		
			WebElement city1 = pom.getCity1();
			selectByindex(city1, 3);
			WebElement city2 = pom.getCity2();
			selectByindex(city2, 3);
	WebElement sumit = pom.getSumit();
	submit(sumit);
	WebElement element = driver.findElement(By.tagName("table"));
	List<Float> l= new ArrayList<Float>();
	List<Float> li= new ArrayList<Float>();
	List<WebElement> row = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < row.size(); i++) {
		WebElement element2 = row.get(i);
		String text = element2.getText();
		int length = text.length();
		String string = text.substring(length-6);
		float float1 = Float.parseFloat(string);
		l.add(float1);
	}
	
		
			}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
