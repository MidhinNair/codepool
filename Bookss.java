package work.out.hm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookss {
	
	List<String> favouriteBook = new ArrayList<String>();
	
	// Define an `addFavoriteBook(..)` function that receives a single parameter, called `bookName`.
		
public  void addFavoriteBook (String bookName) {
	
		 if(! bookName.contains ("Great"))
		 {
			 // If the provided `bookName` string does *NOT* have the word "Great" in it, add it to the `favoriteBooks` array
			
			 favouriteBook.add(bookName);
				
			}
			 
		 }
	 //Define a `printFavoriteBooks()` function that receives no parameters
	void printFavoriteBooks() {
		
	
		//Define a `printFavoriteBooks()` function that receives no parameters
		System.out.println( favouriteBook.size());
		//, `printFavoriteBooks()` should loop through the `favoriteBooks` array and print out each value
		for(String i : favouriteBook) {
		System.out.println(i);
		
		}
		
		
	}	
		
	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);

String bookName=sc.nextLine();
Bookss b=new Bookss();
		
b.addFavoriteBook(bookName);
b.printFavoriteBooks();
			
		}

	}

/*
 
i/p= the book
o/p=
favouriteBook
1
the book

 
i/p=  the Great
o/p= 0

 */

