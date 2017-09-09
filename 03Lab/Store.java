import java.util.*;

public class Store implements ObjectStore{
  private Todo[] goals = new Todo[10];

  public Store(){

  }

  public Store(int i){
    goals = new Todo[i];
  }
  //O(n)
  public void add(Todo t){
    for(int i = 0; i < goals.length; i++){
      if(goals[i] == null){
        goals[i] = t;
        return;
      }
    }
    //Growing array if full, then recursively adding the Todo
    goals = Arrays.copyOf(goals, goals.length + 10);
    System.out.println("Store is full! Size increased by 10.");
    add(t);
  }
//O(n)
  public void remove(Todo t){
    for(int i = 0; i < goals.length; i++){
      if (goals[i] == t) goals[i] = null;
      return;
    }
    System.out.println("Specified Todo not found in Store.");
  }
//O(1)
  public String objectAtIndex(int index){
    return goals[index].text;
  }
//O(n)
  public int numberOfObjects(){
    int count = 0;
    for(int i = 0; i < goals.length; i++){
      if(goals[i] != null) count++;
    }
    return count;
  }
//O(n)
  public Todo[] allTodos(){
    return goals;
  }
}
