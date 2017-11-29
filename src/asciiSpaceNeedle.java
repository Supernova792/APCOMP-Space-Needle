public class asciiSpaceNeedle {   

//VARIABLE DECLARATION-----------------------------------------------------------------------------------------
    static int needle = 0; static int colonCounter = 0; static int discTopCounter = 0;
    static int clnAmt = 0; static int spaceAmt = 0; static int quote = 0; static boolean isLeft = true;
    static int spaceInput = 0; static int spaceInc = 0; static int slashAmt = 0;
	
//MAIN METHOD--------------------------------------------------------------------------------------------------
		public static void main(String args[]){
		  
		  //Calls needlyThing() method and places "||" on the top of the Space Needle
		  needlyThing();
		  
		  //Sets Variables and calls discTop() method and places the disc *Below* under the top needle
	      spaceInc = 3; clnAmt = 0; spaceAmt = 9; discTop();
	      
	      //Sets Variables and calls downyBitLoop() method which loops downyBit()
	      spaceInc = 2; slashAmt = 11; spaceAmt = 0; downyBitLoop();
	      
	      //Calls needlyThing() method and places "||" in the center of the Space Needle
	      needlyThing();
	      
	      //Loops "|%%||%%|" 16 times under the second needle
	      for (needle = 0; needle < 16 ; needle++){
	    	  System.out.println("         " + "|%%||%%|");
		  }
	      
	      //Sets Variables and calls discTop() method and places the disc at the bottom of the Space Needle
	      spaceInc = 3; clnAmt = 0; spaceAmt = 9; discTop();
		}
		
//downyBitLoop() | LOOPS downyBit(); with values---------------------------------------------------------------
	   public static void downyBitLoop() {
		   for(discTopCounter = 0; discTopCounter < 4; discTopCounter++){
			   isLeft = true; downyBit(); spaceAmt = spaceAmt + 2;
		   }
	   }
//downyBit() | Places the bottom part of the discTop()---------------------------------------------------------
	   public static void downyBit() {
		   spaceInput(); downySlashyBit();
		   for(colonCounter = 0; colonCounter < slashAmt; colonCounter++) {
			   System.out.print("/\\");
		   }
		   slashAmt = slashAmt - 2; isLeft = false; downySlashyBit();
	   }
//downySlashyBit() | Places the beginning "\_" and ending "_/" on the downyBit() lines-------------------------
	   public static void downySlashyBit() {
		   if (isLeft == true) {
			   System.out.print("\\_");
		   }else {
			   System.out.println("_/");
		   }
	   }
//needlyThing() | Places "||" on the top of the Space Needle---------------------------------------------------
	   public static void needlyThing(){
		   for (needle = 0; needle < 4 ; needle++){
			   spaceAmt = 12; spaceInput(); System.out.println("||");
		   }  
	   }
//underSlashyLeft() | Places the ending "_/" on the discTop() lines--------------------------------------------
	   public static void underSlashyLeft(){
	      System.out.print("__/");   
	   }
//underSlashyRight() | Places the beginning "\_" on the discTop() lines----------------------------------------
	   public static void underSlashyRight(){
	      System.out.println("\\__");   
	   }
//colonThing() | Places colon ":::" within discTop()-----------------------------------------------------------
	   public static void colonThing(){
	      for(colonCounter = 0; colonCounter < clnAmt; colonCounter++){
		      System.out.print(":");
	      }
	   }
//spaceInput() | Places Spaces "   "---------------------------------------------------------------------------
	   public static void spaceInput(){
	      for(colonCounter = 0; colonCounter < spaceAmt; colonCounter++){
		      System.out.print(" ");
	      }
	   }
//discTop() | uses spaceInput(), underSlashyLeft(), underSlashyRight(), and colonThing() to place the top disc-
	   public static void discTop(){
	      for(discTopCounter = 0; discTopCounter < 4; discTopCounter++){
	         spaceInput(); underSlashyLeft(); colonThing(); System.out.print("||"); colonThing(); underSlashyRight();
	         spaceAmt = spaceAmt - spaceInc; clnAmt = clnAmt + 3;
	      }
	      System.out.print("|");
	      for(quote = 0; quote < 24; quote++){
	         System.out.print("\"");
	      }
	     System.out.println("|");
	   }
}