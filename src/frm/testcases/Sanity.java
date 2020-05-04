package frm.testcases;

import frm.modules.Application;
import frm.modules.SearchModule;

public class Sanity {
	
	public void tstcs_open_google_browser() {
		Application.openApp();
		Application.closeApp();
	}
	

	public void tstcs_search_term_in_google_page() {
		Application.openApp();
		SearchModule.search("Sachin");
		SearchModule.validateSearch("Sachin");
		Application.closeApp();
	}
	
}
