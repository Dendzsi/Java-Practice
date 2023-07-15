
class Menu{
  //Drinks
  Drink.Cola myCola = new Drink.Cola();
  Drink.Water myWater = new Drink.Water();
  //Drinks
  
  //Foods
  Food.Gyros myGyros = new Food.Gyros();
  Food.Pizza myPizza = new Food.Pizza();
  Food.HotDog myHotDog = new Food.HotDog();
  //Foods
  
  //Desserts
  Dessert.CheeseCake myCheeseCake = new Dessert.CheeseCake();
  Dessert.Brownie myBrownie = new Dessert.Brownie();
  //Desserts
	
  
  public void DrinkMenuDisplay(){
    System.out.println("---------------");
    System.out.println("| Drink Menu: |");
    System.out.println("---------------");
    System.out.println();
    myCola.display();
    myWater.display();
  }
  
  public void FoodMenuDisplay(){
    System.out.println("--------------");
    System.out.println("| Food Menu: |");
    System.out.println("--------------");
    System.out.println();
    myGyros.display();
    myPizza.display();
    myHotDog.display();
  }
  
  public void DessertMenuDisplay(){
    System.out.println("-----------------");
    System.out.println("| Dessert Menu: |");
    System.out.println("-----------------");
    System.out.println();
    myCheeseCake.display();
    myBrownie.display();
  }
}
