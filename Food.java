
class Food {
  	protected String ID;
    protected String Name;
    protected double Price;
    protected String Description;
  
  	public Food(String ID, String Name, double Price, String Description){
      this.ID = ID;
      this.Name = Name;
      this.Price = Price;
      this.Description = Description;
    }
  
  	public void displayNumber(){
       System.out.println("#"+ID+": "+Name+ " " +"\nPrice: "+Price+"$");
       System.out.println(Description);
       System.out.println();
    }
}
