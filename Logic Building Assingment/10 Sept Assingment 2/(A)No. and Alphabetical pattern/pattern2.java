class pattern2{
//pattern type quetion
public static void main(String args[]){
	
	for(char i='A';i<='E';i++)
	{
		for(char j='E';j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
} 
}

/* output=
a
a b
a b c
a b c d
a b c d e*/

/*class Main {
	//taking of character in java
  public static void main(String[] args) {

    char c;

    for(c = 'A'; c <= 'Z'; ++c)
      System.out.print(c + " ");
    }
}*/