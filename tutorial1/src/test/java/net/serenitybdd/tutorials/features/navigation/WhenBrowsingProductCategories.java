package net.serenitybdd.tutorials.features.navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.tutorials.model.Category;
import net.serenitybdd.tutorials.steps.NavigatingUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;



/**
 * 
 * @author The Bad Coder 
 * Date 09/09/2019
 *
 */
@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {
	@Steps
	NavigatingUser mark;
	
	@Managed
	WebDriver browser;
	
	@Test
	public void shouldBeAbleToNavigateToTheMotorsCategory() {
		// Given
		mark.isOnTheHomePage();
		
		// When
		mark.wantsToNavigateToCategory(Category.Coupons);
		
		// Then
		mark.shouldSeePageTitleContaining("Amazon Coupons: Checkout Latest Amazon Discount Coupons Online Across Categories from Top Brands at Amazon.in");
	}

}
