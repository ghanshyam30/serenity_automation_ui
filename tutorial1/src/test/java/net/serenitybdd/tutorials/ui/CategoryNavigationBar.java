package net.serenitybdd.tutorials.ui;

import org.openqa.selenium.By;
import org.w3c.dom.Document;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.tutorials.model.Category;

public class CategoryNavigationBar extends PageObject{

	public void selectCategory(Category categoryValue) {
		// TODO Auto-generated method stub
//		Document document;
//		document = document.getElementById("nav-xshop").children;
//		$("*[id=nav-xshop]").children.find(By.linkText(categoryValue.name())).click();
		$("//div[@id='nav-xshop-container']//a[@class='nav-a' and text()='"+categoryValue+"']").click();

	}

}
