import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {
    ArrayList<Name> friends = new ArrayList<Name>();
    Random rand = new Random();
   // declare and initialize the ArrayList
   // declare and initialize the Random class
   
   // the constructor
   public Friends () {
        friends.add(new Name("Noga", "James", "Wallach"));
        friends.add(new Name("Caleb", "Chu", "Brunnchweiler"));
        friends.add(new Name("Abi", "May-Leng", "Bailey"));
       // add three names to the ArrayList
   }
   
   public void printRandomFriend(){
        System.out.print(friends.get(rand.nextInt(friends.size())));
        
       //return a random Name object from the List
    }
     
}