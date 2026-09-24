
class FoodController {
  Gyros myGyros = new Gyros();
  Pizza myPizza = new Pizza();
  HotDog myHotDog = new HotDog();

	  static class Gyros extends Food{
        Gyros(){
        	super("FO1","Gyros",11.5,"Gyros with premium meat and fresh vegetables.");
      	}	
        public void display(){
        System.out.println("#1: "+Name+ " " +"\nPrice: "+Price+"$");
        System.out.println(Description);
        System.out.println();
      } 
      }
  	  static class Pizza{
        String ID = "FO2";
        String Name = "Pizza";
        double Price = 12;
        String Description = "Original Italian sytle pizza.";
        public void display(){
        System.out.println("#2: "+Name+ " " +"\nPrice: "+Price+"$");
        System.out.println(Description);
        System.out.println();
      }
      }
  	  static class HotDog{
        String ID = "FO3";
        String Name = "Hot-Dog";
        double Price = 6;
        String Description = "Hot-Dog with crunchy bun and Heinz ketchup.";
        public void display(){
        System.out.println("#3: "+Name+ " " +"\nPrice: "+Price+"$");
        System.out.println(Description);
        System.out.println();
      }
      }
  public double getPrice(String name){
      if(name == "Gyros"){
      return myGyros.Price;
      }
      if(name == "Pizza"){
      return myPizza.Price;
      }
      if(name == "Hot-Dog"){
      return myHotDog.Price;
      }
      return 0;
    }
}
