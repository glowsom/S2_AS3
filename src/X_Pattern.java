
public class X_Pattern {

	//TO DO: Print out the X-pattern Using Nested loops  
	public static void main (String [] args){
		
		int xCount=0;
		for(int i=1; i<=5; i++){				//Iterates the lines to be Printed
			
			for(int j=1; j<=5; j++){			//Iterates for every character to be printed per line
				
				if((i+j==6)||(i==j)){			//Determines when * should be printed
					System.out.print("*");
					xCount++;					//Tracks frequency of * printed per line
					if((xCount==2)||(i==3))		//and stops printing when correct pattern in reached
						break;
				}
				else 
					System.out.print("_");		//Place holder for non *marked spots.
			}
			xCount = 0;							//Reset * tracker
			System.out.println();				//Go to Next line
		}
	}
}
