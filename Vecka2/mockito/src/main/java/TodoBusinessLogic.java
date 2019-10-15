import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TodoBusinessLogic {

    private ITodoService todoService;

    public TodoBusinessLogic(ITodoService todoService) {
        this.todoService = todoService;
    }

    public List<Todo> getAllTodosForToday() {
        return todoService.getAllTodos().stream()
                .filter(todo -> todo.getDate().equals("Idag"))
                .collect(Collectors.toList());
    }

    public List<Todo> getAllTodosForTomorrow() {
        return Collections.emptyList();
    }
}
