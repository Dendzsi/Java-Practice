
class DrinkController {
  Cola myCola = new Cola();
  Water myWater = new Water();
  
    static class Cola extends Drink{
      Cola(){
        super("DR1","Coca-Cola",3,"Ice cold Coca-Cola.");
      }
      public void display(){
        System.out.println("#1: "+Name+ " " +"\nPrice: "+Price+"$");
        System.out.println(Description);
        System.out.println();
      }
    }
  	
  	static class Water extends Drink {
      Water(){
        super("DR2","Water",1.5,"Clean and fresh water.");
      }
      public void display(){
        System.out.println("#2: "+Name+ " " +"\nPrice: "+Price+"$");
        System.out.println(Description);
        System.out.println();
      }
    }
  
	public double getPrice(String name){
      if(name == "Coca-Cola"){
      return myCola.Price;
      }
      if(name == "Water"){
      return myWater.Price;
      }
      return 0;
    }
}
