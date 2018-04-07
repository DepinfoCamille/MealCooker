public class BuildPatternDemo {
   public static void main(String[] args) {
	      
      MealBuilder mealBuilder = new MealBuilder();

      Cook cook = new Cook(mealBuilder) ; 
      
      
      Meal vegMeal = cook.constructVegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " + vegMeal.getCost());

      Meal nonVegMeal = cook.constructNonVegMeal();
      System.out.println("\n\nNon-Veg Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " + nonVegMeal.getCost());
   }
}