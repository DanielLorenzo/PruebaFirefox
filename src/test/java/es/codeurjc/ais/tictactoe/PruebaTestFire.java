package es.codeurjc.ais.tictactoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PruebaTestFire {
	 protected WebDriver driver;
	 @BeforeAll
	 public static void setupClass() {
		 WebDriverManager.firefoxdriver().setup();
		 WebApp.start();
	 }
	 @BeforeEach
	 public void setupTest() {
	 driver = new FirefoxDriver();
	 }
	 @AfterEach
	 public void teardown() {
	 if (driver != null) {
	 driver.quit();
	 }
	 }
	 @Test
	 public void test() {
		 driver.get("https://www.google.es/");
	 }
	}
