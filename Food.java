
class Food {
  Gyros myGyros = new Gyros();
  Pizza myPizza = new Pizza();
  HotDog myHotdDog = new HotDog();

	  static class Gyros {
        String ID = "FO1";
        String Name = "Gyros";
        double Price = 11.5;
        String Description = "Gyros with premium meat and fresh vegetables.";
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
      return myPizza.Price;
      }
      return 0;
    }
}
