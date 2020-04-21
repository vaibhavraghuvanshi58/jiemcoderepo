package solutionpack;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		String country = "pak";
			
		switch(country) {
		case "india":
		case "IND":
		case "IN":
		case "Hindustan":
			System.out.println("India");break;

		case "china":System.out.println("china");break;
		
		case "pakistan":
		case "pak":
			System.out.println("pakistan");break;
		
		case "USA":System.out.println("USA");break;
		default: System.out.println("nothing is found");break;
		}
	}
}
