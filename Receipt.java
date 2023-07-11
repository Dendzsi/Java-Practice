import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Receipt {
  int qty;
  String Item;
  double Price;
  public static ArrayList<String> Items = new ArrayList<String>();
  HashMap<String,Integer> hs=new HashMap<String,Integer>();
  Drink myDrink = new Drink();
  Dessert myDessert = new Dessert();
  Food myFood = new Food();
  
  
  public void displayReceipt(){
    /*for (int i = 0; i < Items.size(); i++) {
      //System.out.println(Items.get(i)+" "+myDrink.getPrice(Items.get(i))+"$");
      int count = 0;
      for (int j = 0; j < Items.size(); j++) {
        if(Items.get(j).equals(Items.get(i))){
          count = count++;
        }
      }
      for (int k = 0; k < Items.size(); k++){
        if(Items.get(k).equals(Items.get(i))){
        }
        else{
          System.out.println(Items.get(i) + count);
        }
      }
    }
  }*/
  
 
        int i=0;
    	double bill = 0;
  
        while(i < Items.size())
        {
            String word=Items.get(i);
            if(hs.containsKey(word))   // check if word repeated
            {
               hs.put(word, hs.get(word)+1); //if repeated increase the count
               Items.remove(i); // remove the word

            }
            else
            {
               hs.put(word, 1);  //not repeated
               i++;
            }

       }
    	System.out.printf("%s \t\t %15s \t\t %s\n","Qty","Item Name","Price($)");
       for (String h : hs.keySet()) {
        if(myDrink.getPrice(h) > 0){
          System.out.printf("%d \t\t %15s \t\t $%.1000s\n", hs.get(h) , h ,(hs.get(h)*myDrink.getPrice(h)));
          bill = bill + hs.get(h)*myDrink.getPrice(h);
        }
         if(myFood.getPrice(h) > 0){
          System.out.printf("%d \t\t %15s \t\t $%.1000s\n", hs.get(h) , h ,(hs.get(h)*myFood.getPrice(h)));
           bill = bill + hs.get(h)*myFood.getPrice(h);
        }
         if(myDessert.getPrice(h) > 0){
          System.out.printf("%d \t\t %15s \t\t $%.1000s\n", hs.get(h) , h ,(hs.get(h)*myDessert.getPrice(h)));
           bill = bill + hs.get(h)*myDessert.getPrice(h);
        }
       }
    
    	
      /* Iterator it = hs.entrySet().iterator();
       while(it.hasNext())
        {
          HashMap.Entry pair = (HashMap.Entry)it.next();
           System.out.println(pair.getKey() + " = " + pair.getValue());
        }
        /*for(String word: Items)
        {
           System.out.println(word);
        }*/
  	System.out.println("Your total will be: "+bill+"$");
}
  public void printReceipt(HashMap<String, Integer> hs){
 
        int i=0;
    	double bill = 0;
  
        while(i < Items.size())
        {
            String word=Items.get(i);
            if(hs.containsKey(word))   // check if word repeated
            {
               hs.put(word, hs.get(word)+1); //if repeated increase the count
               Items.remove(i); // remove the word

            }
            else
            {
               hs.put(word, 1);  //not repeated
               i++;
            }

       }
    	System.out.printf("%s \t\t %15s \t\t %s\n","Qty","Item Name","Price($)");
       for (String h : hs.keySet()) {
        if(myDrink.getPrice(h) > 0){
          System.out.printf("%d \t\t %15s \t\t $%.1000s\n", hs.get(h) , h ,(hs.get(h)*myDrink.getPrice(h)));
          bill = bill + hs.get(h)*myDrink.getPrice(h);
        }
         if(myFood.getPrice(h) > 0){
          System.out.printf("%d \t\t %15s \t\t $%.1000s\n", hs.get(h) , h ,(hs.get(h)*myFood.getPrice(h)));
           bill = bill + hs.get(h)*myFood.getPrice(h);
        }
         if(myDessert.getPrice(h) > 0){
          System.out.printf("%d \t\t %15s \t\t $%.1000s\n", hs.get(h) , h ,(hs.get(h)*myDessert.getPrice(h)));
           bill = bill + hs.get(h)*myDessert.getPrice(h);
        }
       }
    
    	
  	System.out.println("Your total will be: "+bill+"$");
}
}
