import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TodoBusinessLogicTest {

    @Test
    public void getEmptyListForTodayWhenNoTodos() {
        TodoBusinessLogic logic = new TodoBusinessLogic(new EmptyFakeTodoService());
        List<Todo> actual = logic.getAllTodosForToday();
        assertEquals(actual.size(), 0);
    }

    @Test
    public void getAllTodosForToday() {
        TodoBusinessLogic logic = new TodoBusinessLogic(new FakeTodoService());
        List<Todo> expected = new ArrayList<>();
        expected.add(new Todo("Göra labb", false, "Idag"));
        expected.add(new Todo("Göra labb 2", false, "Idag"));
        List<Todo> actual = logic.getAllTodosForToday();
        for (int i = 0; i < expected.size(); i++) {
            Todo expectedTodo = expected.get(i);
            Assert.assertEquals(expectedTodo, actual.get(i));
        }
    }

    @Test
    public void getAllTodosForTomorrow() {
        TodoBusinessLogic logic = new TodoBusinessLogic(new FakeTodoService());
        List<Todo> expected = new ArrayList<>();
        expected.add(new Todo("Göra annat", false, "Imorgon"));
        List<Todo> actual = logic.getAllTodosForTomorrow();
        for (int i = 0; i < expected.size(); i++) {
            Todo expectedTodo = expected.get(i);
            Assert.assertEquals(expectedTodo, actual.get(i));
        }
    }
}