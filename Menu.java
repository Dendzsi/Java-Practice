
class Menu{
  //Drinks
  DrinkController.Cola myCola = new DrinkController.Cola();
  DrinkController.Water myWater = new DrinkController.Water();
  //Drinks
  
  //Foods
  FoodController.Gyros myGyros = new FoodController.Gyros();
  FoodController.Pizza myPizza = new FoodController.Pizza();
  FoodController.HotDog myHotDog = new FoodController.HotDog();
  //Foods
  
  //Desserts
  DessertController.CheeseCake myCheeseCake = new DessertController.CheeseCake();
  DessertController.Brownie myBrownie = new DessertController.Brownie();
  //Desserts
	
  
  public void DrinkMenuDisplay(){
    System.out.println("---------------");
    System.out.println("| Drink Menu: |");
    System.out.println("---------------");
    System.out.println();
    myCola.displayNumber();
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
