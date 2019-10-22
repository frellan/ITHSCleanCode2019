import java.util.ArrayList;
import java.util.List;

public class TodoService implements ITodoService {

    @Override
    public List<Todo> getAllTodos() {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb", false, "Idag"));
        todos.add(new Todo("Göra labb 2", false, "Idag"));
        todos.add(new Todo("Göra annat", false, "Imorgon"));
        return todos;
    }
}
