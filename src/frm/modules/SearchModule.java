package frm.modules;

import org.openqa.selenium.Keys;

import frm.pages.SearchFormPage;
import frm.pages.SearchResultPage;

public class SearchModule {
	public static void search(String term) {
		SearchFormPage.enterSearchTerm(term, Keys.ENTER);
	}
	
	public static void validateSearch(String term) {
		String actualTitle = SearchResultPage.getTitle();
		String expectedTitle = term + " - Google Search";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}
	
}
