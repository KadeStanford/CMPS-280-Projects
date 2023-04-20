public class ParkTycoonStanfordJames {

  public static void main(String[] args) {
    //Start of SL
    AmusementParkStanfordJames SpaceLand = new AmusementParkStanfordJames(
      "SpaceLand"
    );

    //Start of GSAP
    AmusementParkStanfordJames GroceryStoreAdventurePark = new AmusementParkStanfordJames(
      "Grocery Store Adventure Park"
    );

    //Start of TTT
    AmusementParkStanfordJames TimeTravelTopia = new AmusementParkStanfordJames(
      "Time Travel-Topia"
    );

    SpaceLand.definePark(SpaceLand);
    SpaceLand.printComprehensiveLists(SpaceLand);

    GroceryStoreAdventurePark.definePark(GroceryStoreAdventurePark);
    GroceryStoreAdventurePark.printComprehensiveLists(
      GroceryStoreAdventurePark
    );

    TimeTravelTopia.definePark(TimeTravelTopia);
    TimeTravelTopia.printComprehensiveLists(TimeTravelTopia);

    System.out.println(" This Concludes the list!");
  }
}
