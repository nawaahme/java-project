package com.mkyong.hashing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	System.out.println( "Hello World!" );
    }

public boolean isPrime(int n){
boolean val = true;
for(int i=2;i<=n/2;i++){
	if (n%i == 0){
	val = false;
	break;
	}
	}
return val;
}
}