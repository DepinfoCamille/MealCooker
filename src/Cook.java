
public class Cook {
	
	MealBuilder mealBuilder;
	
	public Cook(MealBuilder _mealBuilder) {
		this.mealBuilder = _mealBuilder ; 
	}
		
		
    Meal constructVegMeal(){
    	
    	Meal meal = this.mealBuilder.prepareVegMeal();
    	
    	return meal;
    }
    
    Meal constructNonVegMeal(){
    	
    	Meal meal = this.mealBuilder.prepareNonVegMeal();
    	
    	return meal;
    }
    
    

}
