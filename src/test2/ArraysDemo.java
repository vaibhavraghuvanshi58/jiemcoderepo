package test2;

public class ArraysDemo {
	public static void main(String[] args) {
		// Array index starts from 0

		int[] stduent2 = new int[] {20,67,45,23};

		int[] student1  = {10,20,30,40};

		// When we create any array, we must give size of that array
		int[] student3 = new int[4]; // 4 byte * 4 = 16 byte
		student3[0] = 190;
		student3[1] = 130;
		student3[2] = 110;
		student3[3] = 180;
		
		// 100 104 108 112
		// in Java , Array is the fastest available collection 
		
		for(int i = 0; i < student3.length; i++) {
			System.out.println(student3[i]);
		}

		// Type of arrays
		// 1 dimentional
		// 2 dim array = 
		
		int[][] hj = new int[2][2];
		hj[0][0] = 10;
		hj[0][1] = 10;
		hj[1][0] = 10;
		hj[1][1] = 10;
		
		hj[4][1] = 10;
		
		int[][] hj1 = null;
		
		//      memory location
		// R1 - 134 , 234
		// R2 - 234 , 238
		// R3 - 238 , 546
		// R4 - 546 , 

		//		student1[2] = 120;
		//		System.out.println(student1[0]);
		//		System.out.println(student1[1]);
		//		System.out.println(student1[2]);
		//		System.out.println(student1[3]);
		//		
		//		
		//		
		//		int[] student2  = {50,60,70,80};
		//		System.out.println(student2[0]);
		//		System.out.println(student2[1]);
		//		System.out.println(student2[2]);
		//		System.out.println(student2[3]);

	}
}
