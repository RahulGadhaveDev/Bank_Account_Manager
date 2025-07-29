package com.Bank;

import java.util.Scanner;

import com.Bank.repository.RepoBank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	RepoBank repo = new RepoBank();
    	
    	System.out.println("1. post data");
    	System.out.println("2. Enter id to get account ");
    	Scanner sc = new Scanner(System.in);
    	
    	int opration = sc.nextInt();
    	
    	switch (opration) {
    	case 1:
    		repo.postData();
    		break;
    	case 2: 
    		repo.getData();
    		break;
    	}
    	
    	
    }
}
