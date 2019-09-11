package net.serenitybdd.tutorials.steps;

import net.serenitybdd.tutorials.model.Category;
import net.serenitybdd.tutorials.ui.AmazonHomePage;
import net.serenitybdd.tutorials.ui.CategoryNavigationBar;
import net.serenitybdd.tutorials.ui.CurrentPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * 
 * @author The Bad Coder
 * Date : 10/09/2019
 *
 */

public class NavigatingUser {

	AmazonHomePage amazonHomePage;
	CurrentPage currentPage;
	CategoryNavigationBar categoryNavigationBar;
	
	@Step
	public void isOnTheHomePage() {
		// TODO Auto-generated method stub
		amazonHomePage.open();
	}
	
	@Step
	public void shouldSeePageTitleContaining(String expectedTitle) {
		// TODO Auto-generated method stub
//		String titleOfThePage;
//		titleOfThePage = currenPage.getTitle();
		assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
	}

	@Step		
	public void wantsToNavigateToCategory(Category categoryValue) {
		
		// TODO Auto-generated method stub
		categoryNavigationBar.selectCategory(categoryValue);
	}

}
