public abstract class FoodStallStanfordJames {

  String name;
  String inPark;
  String description;
  String foodType;

  public FoodStallStanfordJames(
    String name,
    String inPark,
    String description,
    String foodType
  ) {
    this.name = name;
    this.inPark = inPark;
    this.description = description;
    this.foodType = foodType;
  }

  //make get methods for every variable
  public String getName() {
    return name;
  }

  public String getInPark() {
    return inPark;
  }

  public String getDescription() {
    return description;
  }

  public String getFoodType() {
    return foodType;
  }
}
