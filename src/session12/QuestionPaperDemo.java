package session12;

public class QuestionPaperDemo {
	public static void main(String[] args) {
		Question st1 = new Student1();
		
	}
}

class Question{
	public void question1() {
		System.out.println("answer1");
	}

	public void question2() {
		System.out.println("answer2");
	}

	public void question3() {
		System.out.println("answer3");
	}
}


class Student1 extends Question{
	public void question1() {
		System.out.println("my answer");
	}
	public void question2() {
		System.out.println("my answer");
	}
	public void question3() {
		System.out.println("my answer");
	}
	public void question4() {
		System.out.println("my answer");
	}
}
