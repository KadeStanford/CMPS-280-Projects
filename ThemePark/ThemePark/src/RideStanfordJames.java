public abstract class RideStanfordJames {

  String name;
  String inPark;
  int thrillLevel;
  String description;

  public RideStanfordJames(
    String name,
    String inPark,
    int thrillLevel,
    String description
  ) {
    this.name = name;
    this.inPark = inPark;
    this.thrillLevel = thrillLevel;
    this.description = description;
  }

  //make get methods for every variable
  public String getName() {
    return name;
  }

  public String getInPark() {
    return inPark;
  }

  public int getThrillLevel() {
    return thrillLevel;
  }

  public String getDescription() {
    return description;
  }
}
