public class ClassesAndInterfaces{
  public static void main(String[] args){
    testStore();
  }

  public static void testStore(){
    Todo wakeUp = new Todo("Wake up early.");
    Todo coffee = new Todo("Drink lots of coffee.");
    Todo code = new Todo("Smash head against keyboard repeatedly.");
    Todo sleep = new Todo("Get to sleep before midnight.");
    Store dailySchedule = new Store();
    
    dailySchedule.add(wakeUp);
    dailySchedule.add(coffee);
    dailySchedule.add(code);
    dailySchedule.add(sleep);
    dailySchedule.remove(sleep);
    System.out.println("Todo at index 1: " + dailySchedule.objectAtIndex(1));
    System.out.println("Number of Todo objects: " + dailySchedule.numberOfObjects());
    System.out.println(dailySchedule.allTodos());
  }

}
