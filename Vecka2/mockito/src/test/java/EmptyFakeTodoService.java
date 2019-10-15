import java.util.Collections;
import java.util.List;

public class EmptyFakeTodoService implements ITodoService {
    @Override
    public List<Todo> getAllTodos() {
        return Collections.emptyList();
    }
}
