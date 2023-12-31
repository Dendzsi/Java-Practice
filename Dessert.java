
class Dessert {
  CheeseCake myCheeseCake = new CheeseCake();
  Brownie myBrownie = new Brownie();
  
  static class CheeseCake{
    String ID = "DE1";
    String Name = "Cheese Cake";
    double Price = 6.5;
    String Description = "Cheese Cake from delecious Mascarpone.";
    public void display(){
        System.out.println("#1: "+Name+ " " +"\nPrice: "+Price+"$");
      	System.out.println(Description);
        System.out.println();
    }
  }
  static class Brownie{
    String ID = "DE2";
    String Name = "Brownie";
    double Price = 5.5;
    String Description = "Brownie from the best Lindt chocolate.";
    public void display(){
        System.out.println("#2: "+Name+ " " +"\nPrice: "+Price+"$");
        System.out.println(Description);
        System.out.println();
    }
  }
  public double getPrice(String name){
      if(name == "Cheese Cake"){
      return myCheeseCake.Price;
      }
      if(name == "Brownie"){
      return myBrownie.Price;
      }
      return 0;
    }
}
