package hyrtutorials;

public class WhatisOutput {

	public WhatisOutput(byte a, byte b) {
		System.out.println("a = "+a+" b = "+b);   //a = 10 b = 15
	}
		 
		WhatisOutput(int a, float b)   // float is there 
		{  
			System.out.println("a = "+a+" b = "+b);  
		}  
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			byte a = 10;   
			byte b = 15;  
			WhatisOutput ob = new WhatisOutput(a,b); //10,15 
			WhatisOutput ob1 = new WhatisOutput(a, b); // 10, 15 
			//Becaz , value initiated as byte not float so , 10 and 15 

		}


	}
