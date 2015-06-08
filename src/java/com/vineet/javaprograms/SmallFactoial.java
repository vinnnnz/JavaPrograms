/**
 * 
 */
package com.vineet.javaprograms;

/**
 * @author Vineet Kumar
 *
 */
import java.math.*;
import java.io.*;
public class SmallFactoial {
	
	    public static void main(String[] args)throws IOException
	    {
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        BigInteger factorial;
	            int n;
	            n=Integer.parseInt(br.readLine());
	            factorial=new BigInteger("1");
	            for(int counter=2;counter<=n;counter++)
	            factorial=factorial.multiply(new BigInteger(""+counter));
	            System.out.println(factorial);
	    }
	}
