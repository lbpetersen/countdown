class countdown {
	public static void main(String[] args){
	System.out.println();
	  int x = 99;
	  int s = 0;
	  countdown();
     }
	public static void countdown(int x, int s){
	  if (s<0){
	    System.out.println(0);
	 } else { 
	  System.out.print(x-1);
	  countdown(x-1);
     }
   }
}
