
class Drink {
  Cola myCola = new Cola();
  Water myWater = new Water();
  
    static class Cola {
      String ID = "DR1";
      String Name = "Coca-Cola";
      double Price = 3;
      String Description = "Ice cold Coca-Cola.";
      public void display(){
        System.out.println("#1: "+Name+ " " +"\nPrice: "+Price+"$");
        System.out.println(Description);
        System.out.println();
      }
    }
  	
  	static class Water {
      String ID = "DR2";
      String Name = "Water";
      double Price = 1.5;
      String Description = "Clean and fresh water.";
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
      return myCola.Price;
      }
      return 0;
    }
}
