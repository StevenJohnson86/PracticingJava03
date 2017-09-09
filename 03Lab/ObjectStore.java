public interface ObjectStore{
    public void add(Todo o);
    public void remove(Todo o);
    public String objectAtIndex(int index);
    public int numberOfObjects();
    public Todo[] allTodos();
}
