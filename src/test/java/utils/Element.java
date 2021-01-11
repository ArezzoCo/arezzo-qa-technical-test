package utils;

import models.BaseGeneric;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element extends Browser {

	public static WebElement element(BaseGeneric generic) {
		waitElement(generic);
		switch (generic.getType()) {
		case "ID":
			return driver.findElement(By.id(generic.getValue()));
		case "CLASS":
			return driver.findElement(By.className(generic.getValue()));
		case "CSS":
			return driver.findElement(By.cssSelector(generic.getValue()));
		case "XPATH":
			return driver.findElement(By.xpath(generic.getValue()));
		case "NAME":
			return driver.findElement(By.name(generic.getValue()));
		default:
			return null;
		}
	}

	public static boolean exist(BaseGeneric generic) {
		switch (generic.getType()) {
		case "ID":
			try{
				driver.findElement(By.id(generic.getValue()));
				return true;
			}catch(Exception e){
				return false;
			}
		case "CLASS":
			try{
				driver.findElement(By.className(generic.getValue()));
				return true;
			}catch(Exception e){
				return false;
			}
		case "CSS":
			try{
				driver.findElement(By.cssSelector(generic.getValue()));
				return true;
			}catch(Exception e){
				return false;
			}
		case "XPATH":
			try{
				driver.findElement(By.xpath(generic.getValue()));
				return true;
			}catch(Exception e){
				return false;
			}
		case "NAME":
			try{
				driver.findElement(By.name(generic.getValue()));
				return true;
			}catch(Exception e){
				return false;
			}
		default:
			return false;
		}
	}

	public static boolean waitElement(BaseGeneric generic, Integer... temp) {
		boolean validate = false;
		int tempo = 350;

		if (temp.length >= 1) {
			tempo = temp[0];
			tempo = tempo * 10;
		}

		for (int i = 0; i < tempo; i++) {
			if (!validate) {
				staticWait(100);
				validate = exist(generic);
				i++;
			}
		}
		return validate;
	}

	public static boolean waitForElementVisible(BaseGeneric generic) {
		switch (generic.getType()) {
			case "ID":
				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(generic.getValue())));
					return true;
				} catch (Exception e) {
					return false;
				}
			case "CLASS":
				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(generic.getValue())));
					return true;
				} catch (Exception e) {
					return false;
				}
			case "CSS":
				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(generic.getValue())));
					return true;
				} catch (Exception e) {
					return false;
				}
			case "XPATH":
				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(generic.getValue())));
					return true;
				} catch (Exception e) {
					return false;
				}
			case "NAME":
				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(generic.getValue())));
					return true;
				} catch (Exception e) {
					return false;
				}
		}
		return false;
	}

	public static void staticWait(int timeout){
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
