package recipeBook;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Recipe{
	
	// Name of recipe as a string
	private String name; 
	
	// Ingredients stored in an arraylist of strings 
	private List<String> ingredientsList;
	
	// store instructions as a long string separated by new line
	private String instructionList;

	// default constructor
	public Recipe() {
		this.name = "";
		this.ingredientsList = new ArrayList<String>();
		this.instructionList = "";
	}
	
	// constructor for recipe
	public Recipe(String name, String[] ingredientsList, String instructionList) {
		this.name = name;
		this.ingredientsList = Arrays.asList(ingredientsList);
		this.instructionList = instructionList;
	}
	
	// getter for name 
	public String getName() {
		return this.name;
	}
	
	// setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// getter for ingredientsList
	public List<String> getIngredientsList() {
		return ingredientsList;
	}

	public String getIngredientsString() {
		String result = "";
		for (String ingredient : this.ingredientsList) {
			result = result + ingredient + ", ";
		}
		return result;
	}
	
	// setter for ingredientsList
	public void setIngredientsList(String[] ingredientsList) {
		this.ingredientsList.clear();
		for (int i = 0; i < ingredientsList.length; i++) {
			this.ingredientsList.add(ingredientsList[i]);
		}
	}
	
	// getter for instructionList
	public String getInstructionList() {
		return instructionList.strip();
	}
	
	// setter for instructionList
	public void setInstructionList(String instructionList) {
		this.instructionList = instructionList;
	}

	public String toString() {
		String result = "";
		result += "NAME: " + this.getName() + "\n";
		result += "INGREDIENTS: " + this.getIngredientsList() + "\n";
		result += "INSTRUCTIONS:\n" + this.getInstructionList();
		return result;
	}
	
}

