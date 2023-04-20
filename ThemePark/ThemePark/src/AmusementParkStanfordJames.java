import java.util.ArrayList;

public class AmusementParkStanfordJames {

  static int openTime;
  static int closeTime;
  static String parkName;
  static String parkLocation;
  static String parkSlogan;

  public AmusementParkStanfordJames(String parkName) {
    AmusementParkStanfordJames.parkName = parkName;
  }

  public static int getOpenTime() {
    return openTime;
  }

  public static int getCloseTime() {
    return closeTime;
  }

  public static String getParkName() {
    return parkName;
  }

  public static String getParkLocation() {
    return parkLocation;
  }

  public static String getParkSlogan() {
    return parkSlogan;
  }

  static ArrayList<RideStanfordJames> SLRides = new ArrayList<RideStanfordJames>();
  static ArrayList<RideStanfordJames> GSAPRides = new ArrayList<RideStanfordJames>();
  static ArrayList<RideStanfordJames> TTTRides = new ArrayList<RideStanfordJames>();

  public static void addRide(RideStanfordJames ride) {
    if (ride.inPark.equals("SL")) {
      SLRides.add(ride);
    } else if (ride.inPark.equals("GSAP")) {
      GSAPRides.add(ride);
    } else if (ride.inPark.equals("TTT")) {
      TTTRides.add(ride);
    }
  }

  static ArrayList<FoodStallStanfordJames> SLFoodStalls = new ArrayList<FoodStallStanfordJames>();
  static ArrayList<FoodStallStanfordJames> GSAPFoodStalls = new ArrayList<FoodStallStanfordJames>();
  static ArrayList<FoodStallStanfordJames> TTTFoodStalls = new ArrayList<FoodStallStanfordJames>();

  public static void addFoodStall(FoodStallStanfordJames foodStall) {
    if (foodStall.inPark.equals("SL")) {
      SLFoodStalls.add(foodStall);
    } else if (foodStall.inPark.equals("GSAP")) {
      GSAPFoodStalls.add(foodStall);
    } else if (foodStall.inPark.equals("TTT")) {
      TTTFoodStalls.add(foodStall);
    }
  }

  static ArrayList<AttractionStanfordJames> SLAttractions = new ArrayList<AttractionStanfordJames>();
  static ArrayList<AttractionStanfordJames> GSAPAttractions = new ArrayList<AttractionStanfordJames>();
  static ArrayList<AttractionStanfordJames> TTTAttractions = new ArrayList<AttractionStanfordJames>();

  public static void addAttraction(AttractionStanfordJames attraction) {
    if (attraction.inPark.equals("SL")) {
      SLAttractions.add(attraction);
    } else if (attraction.inPark.equals("GSAP")) {
      GSAPAttractions.add(attraction);
    } else if (attraction.inPark.equals("TTT")) {
      TTTAttractions.add(attraction);
    }
  }

  public void definePark(AmusementParkStanfordJames park) {
    if (AmusementParkStanfordJames.parkName.equals("SpaceLand")) {
      openTime = 10;
      closeTime = 22;
      parkLocation = "Cleveland";
      parkSlogan = "The stars are closer than you think";

      RideStanfordJames GalacticGlider = new RollerCoasterStanfordJames( //Defining Rides
        "Galactic Glider",
        "SL",
        9,
        "A thrilling ride through the stars!"
      );
      addRide(GalacticGlider);

      RideStanfordJames SpaceSplash = new WaterSlideStanfordJames(
        "Space Splash",
        "SL",
        7,
        "A wet and wild ride through the stars!"
      );
      AmusementParkStanfordJames.addRide(SpaceSplash);

      RideStanfordJames StarSpinner = new CarouselStanfordJames(
        "Star Spinner",
        "SL",
        6,
        "A exciting ride through the stars!" //End of defining rides
      );
      addRide(StarSpinner);

      FoodStallStanfordJames AstroBites = new MainFoodStallStanfordJames( //Defining Food Stalls
        "Astro Bites",
        "SL",
        "A tasty bite to eat in space!",
        "Culture Mash-ups"
      );
      addFoodStall(AstroBites);

      FoodStallStanfordJames SpaceSweets = new DessertStandStanfordJames(
        "Space Sweets",
        "SL",
        "A sweet treat in space!",
        "Galaxy themed desserts like colorful swirled ice cream, cosmic cupcakes, and more!"
      );
      AmusementParkStanfordJames.addFoodStall(SpaceSweets);

      FoodStallStanfordJames GalacticGulp = new DrinkStandStanfordJames(
        "Galactic Gulp",
        "SL",
        "A refreshing drink in space!",
        "Galaxy Specialties like starry milkshakes, cosmic cocktails, and more!"
      );
      addFoodStall(GalacticGulp); //End of defining food stalls

      AttractionStanfordJames SpaceMuseum = new MuseumAttractionStanfordJames( //Defining Museum Attractions
        "Space Museum",
        "SL",
        "A museum of space!",
        "Space themed exhibits like a space shuttle, a moon rock, and more!"
      );
      addAttraction(SpaceMuseum);

      AttractionStanfordJames SpaceLandBand = new LiveMusicAttractionStanfordJames(
        "The Stardust Voyagers",
        "SL",
        "A band of space crusaders!",
        "Sci-fi Rock",
        "Cosmic Crusaders",
        "Gravity's Embrace",
        "SuperNova Nights"
      );
      addAttraction(SpaceLandBand);

      AttractionStanfordJames SpaceShop = new GiftShopAttractionStanfordJames(
        "Space Shop",
        "SL",
        "A shop of space related goods!",
        "Space themed merchandise like space themed t-shirts, space themed toys, and more!"
      );
      addAttraction(SpaceShop); //End of defining attractions

      System.out.println("Welcome to the Amusement Park Database!");
      System.out.println("Here is a brief advertisement from each park:\n");

      System.out.printf(
        "%s at %s!%n" +
        "Located in beautiful %s, %s is a park that is out of this world!%n" +
        "Our hours are from %d AM to %d PM. We have the best variety of rides, food, and attractions in the galaxy!%n" +
        "Including: The %s, %s%n" +
        "Look out for our of this world Water Slide, The %s. It has a thrill rating of %d!%n" +
        "We also have a variety of food stalls, including: %s, %s%n" +
        "and for a limited time only we have %s performing one of their top hits, %s live at the park!%n" +
        "Experience space from the comfort of %s%n\n",
        getParkSlogan(),
        getParkName(),
        getParkLocation(),
        getParkName(),
        getOpenTime(),
        getCloseTime(),
        GalacticGlider.getName(),
        GalacticGlider.getDescription(),
        SpaceSplash.getName(),
        SpaceSplash.getThrillLevel(),
        AstroBites.getName(),
        AstroBites.getDescription(),
        SpaceLandBand.getName(),
        ((LiveMusicAttractionStanfordJames) SpaceLandBand).getTopSong3(),
        getParkLocation()
      );
    }

    if (parkName.equals("Grocery Store Adventure Park")) {
      openTime = 8;
      closeTime = 22;
      parkLocation = "Cleveland";
      parkSlogan = "Go on a shopping spree of fun";

      RollerCoasterStanfordJames AisleRider = new RollerCoasterStanfordJames( //Defining Rides
        "Aisle Rider",
        "GSAP",
        8,
        "A thrilling ride through the aisles!"
      );
      addRide(AisleRider);

      WaterSlideStanfordJames SodaSplashdown = new WaterSlideStanfordJames(
        "Soda Splashdown",
        "GSAP",
        4,
        "A slippery ride through the soda aisle!"
      );
      addRide(SodaSplashdown);

      CarouselStanfordJames CandyCarousel = new CarouselStanfordJames(
        "Candy Carousel",
        "GSAP",
        3,
        "A sweet ride through the candy aisle!" //End of defining rides
      );
      addRide(CandyCarousel);

      MainFoodStallStanfordJames TheFoodieMarket = new MainFoodStallStanfordJames( //Defining Food Stalls
        "The Foodie Market",
        "GSAP",
        "Tasty dishes made from your grocery store favorites!",
        "Grocery Store Food"
      );
      addFoodStall(TheFoodieMarket);

      DessertStandStanfordJames TheSweetShop = new DessertStandStanfordJames(
        "The Sweet Shop",
        "GSAP",
        "A sweet treat from your grocery store favorites!",
        "Grocery Store Desserts"
      );
      addFoodStall(TheSweetShop);

      DrinkStandStanfordJames TheBeverageBarn = new DrinkStandStanfordJames(
        "The Beverage Barn",
        "GSAP",
        "A refreshing drink from your grocery store favorites!",
        "Grocery Store Drinks"
      );
      addFoodStall(TheBeverageBarn); //End of defining food stalls

      MuseumAttractionStanfordJames TheMuseumOfGroceryStoreHistory = new MuseumAttractionStanfordJames( //Defining Attractions
        "The Museum of Grocery Store History",
        "GSAP",
        "A museum of grocery store history!",
        "Grocery Store History"
      );
      addAttraction(TheMuseumOfGroceryStoreHistory);

      LiveMusicAttractionStanfordJames TheGroceryStoreBand = new LiveMusicAttractionStanfordJames(
        "The Aisle Surfurers",
        "GSAP",
        "The Aisle Surfers combines catchy pop-funk tunes and grocery store-inspired lyrics with lively stage presence and audience interaction, creating an unforgettable experience for all ages.",
        "Grocery Pop-Funk",
        "Fresh Produce Boogie",
        "Checkout Line Shuffle",
        "Grocery Getaway (Extended Version: feat. Broccoli Bob and the Carrot Crew)"
      );
      addAttraction(TheGroceryStoreBand);

      GiftShopAttractionStanfordJames TheGroceryStoreGiftShop = new GiftShopAttractionStanfordJames(
        "The Grocery Store Gift Shop",
        "GSAP",
        "The experience of going through the checkout isle, but as a whole store!",
        "Checkout lane exclusives!"
      );
      addAttraction(TheGroceryStoreGiftShop); //End of defining attractions

      System.out.printf(
        "%s at %s!%n" +
        "Located in %s, %s transforms your grocery shopping experience into a world of adventure!%n" +
        "Our hours are from %d AM to %d PM. We have an incredible variety of rides, food, and attractions for everyone!%n" +
        "Including: The %s, %s.%n" +
        "Hop on our delightful Carousel, The %s. Experience the joy of riding through the candy aisle with a thrill rating of %d! So it is perfect for the whole family!%n" +
        "We also have a variety of food stalls, including: %s, %s.%n" +
        "And for dessert, visit %s, where we specialize in %s.%n" +
        "For a limited time only, catch the %s performing one of their top hits, %s live at the park!%n" +
        "Experience the thrills of the Grocery Store in %s!%n\n",
        getParkSlogan(),
        getParkName(),
        getParkLocation(),
        getParkName(),
        getOpenTime(),
        getCloseTime(),
        AisleRider.getName(),
        AisleRider.getDescription(),
        CandyCarousel.getName(),
        CandyCarousel.getThrillLevel(),
        TheFoodieMarket.getName(),
        TheFoodieMarket.getDescription(),
        TheSweetShop.getName(),
        TheSweetShop.getFoodType(),
        TheGroceryStoreBand.getName(),
        TheGroceryStoreBand.getTopSong3(),
        getParkLocation()
      );
    }
    if (parkName.equals("Time Travel-Topia")) {
      openTime = 8;
      closeTime = 9;
      parkLocation = "Cleveland";
      parkSlogan = "Experience the past, present, and future all in one day";
      RollerCoasterStanfordJames ChronoCoaster = new RollerCoasterStanfordJames( //Defining Rides
        "Chrono Coaster",
        "TTT",
        10,
        "A thrilling ride through time!"
      );
      addRide(ChronoCoaster);

      WaterSlideStanfordJames TimeSplash = new WaterSlideStanfordJames(
        "Time Splash",
        "TTT",
        8,
        "Slide through the eras on this amazing Water Slide!"
      );
      addRide(TimeSplash);

      CarouselStanfordJames TimeCarousel = new CarouselStanfordJames(
        "Time Carousel",
        "TTT",
        2,
        "A ride through the ages on this amazing Carousel!" //End of defining rides
      );
      addRide(TimeCarousel);

      MainFoodStallStanfordJames EpochEats = new MainFoodStallStanfordJames( //Defining Food Stalls
        "Time Treats",
        "TTT",
        "A tasty bite to eat from the past, present, and future!",
        "Dishes from the past, present, and future"
      );
      addFoodStall(EpochEats);

      DessertStandStanfordJames TimelessTreats = new DessertStandStanfordJames(
        "Time Sweets",
        "TTT",
        "A sweet treat from the past, present, and future!",
        "Desserts from the past, present, and future"
      );
      addFoodStall(TimelessTreats);

      DrinkStandStanfordJames TravellersLounge = new DrinkStandStanfordJames(
        "Traveller's Lounge",
        "TTT",
        "A futuristic bar with liquor from across the decades!",
        "Drinks from the past, present, and future"
      );
      addFoodStall(TravellersLounge); //End of defining food stalls

      MuseumAttractionStanfordJames TheMuseumOfTimeTravel = new MuseumAttractionStanfordJames( //Defining Attractions
        "The Museum of Time Travel",
        "TTT",
        "A museum of all things time!",
        "Relics from across the ages"
      );
      addAttraction(TheMuseumOfTimeTravel);

      LiveMusicAttractionStanfordJames TimeTravelBand = new LiveMusicAttractionStanfordJames(
        "The Chrononauts",
        "TTT",
        "The Chrononauts explore the rich tapestry of history through their unique blend of folk-rock, transporting audiences on a captivating musical journey across different eras and cultures",
        "Time Travel Folk-Rock",
        "Sands of Time",
        "Clockwork Dreams",
        "Temporal Tides"
      );
      addAttraction(TimeTravelBand);

      GiftShopAttractionStanfordJames TimeTravelGiftShop = new GiftShopAttractionStanfordJames(
        "The Time Travel Gift Shop",
        "TTT",
        "A gift shop with items from the past, present, and future!",
        "Replicas of historys most famous items!"
      );
      addAttraction(TimeTravelGiftShop); //End of defining attractions

      System.out.printf(
        "%s at %s!%n" +
        "Located in %s, %s is a park that takes you on a journey through time!%n" +
        "Our hours are from %d AM to %d PM. We have the best variety of rides, food, and attractions in the timeline!%n" +
        "Including: The %s, %s.%n" +
        "Look out for our amazing Carousel, The %s. It has a thrill rating of %d to carefully new time travellers into their first time travel experience.%n" +
        "We also have a variety of food stalls, including: %s, %s.%n" +
        "And don't forget to visit our Traveler's Lounge, %s, where you can relax and enjoy our time-themed menu.%n" +
        "For a limited time only, we have the %s performing one of their top hits, %s live at the park!%n" +
        "Before you leave, check out our gift shop, %s, where you can find unique souvenirs from different eras.%n" +
        "Experience Time Travel, only in %s!%n",
        getParkSlogan(),
        getParkName(),
        getParkLocation(),
        getParkName(),
        getOpenTime(),
        getCloseTime(),
        ChronoCoaster.getName(),
        ChronoCoaster.getDescription(),
        TimeCarousel.getName(),
        TimeCarousel.getThrillLevel(),
        EpochEats.getName(),
        EpochEats.getDescription(),
        TravellersLounge.getName(),
        TimeTravelBand.getName(),
        TimeTravelBand.getTopSong3(),
        TimeTravelGiftShop.getName(),
        getParkLocation()
      );
    }
  }

  void printComprehensiveLists(AmusementParkStanfordJames park) {
    System.out.println("Park: " + getParkName() + " at " + getParkLocation());
    if (parkName.equals("SpaceLand")) {
      System.out.println("Rides:");
      for (RideStanfordJames r : SLRides) {
        System.out.printf("%s: %s%n\n", r.getName(), r.getDescription());
      }
      System.out.println("Food Stalls:");
      for (FoodStallStanfordJames f : SLFoodStalls) {
        System.out.printf("%s: %s%n\n", f.getName(), f.getDescription());
      }
      System.out.println("Attractions:");
      for (AttractionStanfordJames s : SLAttractions) {
        System.out.printf("%s: %s%n\n", s.getName(), s.getDescription());
        if (s instanceof LiveMusicAttractionStanfordJames) {
          System.out.printf(
            "Description: %s%n Genre: %s%n Top Songs: %s, %s, %s%n\n",
            ((LiveMusicAttractionStanfordJames) s).getDescription(),
            ((LiveMusicAttractionStanfordJames) s).getGenre(),
            ((LiveMusicAttractionStanfordJames) s).getTopSong1(),
            ((LiveMusicAttractionStanfordJames) s).getTopSong2(),
            ((LiveMusicAttractionStanfordJames) s).getTopSong3()
          );
        }
      }
    }
    if (parkName.equals("Grocery Store Adventure Park")) {
      System.out.println("Rides:");
      for (RideStanfordJames r : GSAPRides) {
        System.out.printf("%s: %s%n\n", r.getName(), r.getDescription());
      }
      System.out.println("Food Stalls:");
      for (FoodStallStanfordJames f : GSAPFoodStalls) {
        System.out.printf("%s: %s%n\n", f.getName(), f.getDescription());
      }
      System.out.println("Attractions:");
      for (AttractionStanfordJames s : GSAPAttractions) {
        System.out.printf("%s: %s%n\n", s.getName(), s.getDescription());
        if (s instanceof LiveMusicAttractionStanfordJames) {
          System.out.printf(
            "Description: %s%n Genre: %s%n Top Songs: %s, %s, %s%n\n",
            ((LiveMusicAttractionStanfordJames) s).getDescription(),
            ((LiveMusicAttractionStanfordJames) s).getGenre(),
            ((LiveMusicAttractionStanfordJames) s).getTopSong1(),
            ((LiveMusicAttractionStanfordJames) s).getTopSong2(),
            ((LiveMusicAttractionStanfordJames) s).getTopSong3()
          );
        }
      }
    }
    if (parkName.equals("Time Travel-Topia")) {
      System.out.println("Rides:");
      for (RideStanfordJames r : TTTRides) {
        System.out.printf("%s: %s%n\n", r.getName(), r.getDescription());
      }
      System.out.println("Food Stalls:");
      for (FoodStallStanfordJames f : TTTFoodStalls) {
        System.out.printf("%s: %s%n\n", f.getName(), f.getDescription());
      }
      System.out.println("Attractions:");
      for (AttractionStanfordJames s : TTTAttractions) {
        System.out.printf("%s: %s%n\n", s.getName(), s.getDescription());
        if (s instanceof LiveMusicAttractionStanfordJames) {
          System.out.printf(
            "Description: %s%n Genre: %s%n Top Songs: %s, %s, %s%n\n",
            ((LiveMusicAttractionStanfordJames) s).getDescription(),
            ((LiveMusicAttractionStanfordJames) s).getGenre(),
            ((LiveMusicAttractionStanfordJames) s).getTopSong1(),
            ((LiveMusicAttractionStanfordJames) s).getTopSong2(),
            ((LiveMusicAttractionStanfordJames) s).getTopSong3()
          );
        }
      }
    }
  }
}
