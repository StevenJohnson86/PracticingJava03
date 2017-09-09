public interface ObjectStore{
    public void add(Todo t);
    public void remove(Todo t);
    public String objectAtIndex(int index);
    public int numberOfObjects();
    public Todo[] allTodos();
}
