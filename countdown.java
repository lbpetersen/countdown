class countdown {
	public static void main(String[] args){
	System.out.println();
	  int n = 99;
	  countdown(99);
     }
	public static void countdown(int n){
	  if (n == 0){
	    System.out.println(0);
	 } else{
	  System.out.println(n);
	  countdown(n-1);
     }
   }
}
