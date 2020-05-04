package frm.testcases;

public class TestRunner {
public static void main(String[] args) {
	Sanity sanity_object = new Sanity();
	sanity_object.tstcs_open_google_browser();
	sanity_object.tstcs_search_term_in_google_page();
}
}
