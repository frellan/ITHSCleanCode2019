import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessLogicTest {

    @Test
    public void test() {

    }

    @Test
    public void getEmptyListForTodayWhenNoTodos() {
        TodoService mockTodoService = mock(TodoService.class);
        TodoBusinessLogic logic = new TodoBusinessLogic(mockTodoService);
        List<Todo> actual = logic.getAllTodosForToday();
        assertEquals(actual.size(), 0);
    }

    @Test
    public void getAllTodosForToday() {
        TodoService mockTodoService = mock(TodoService.class);
        List<Todo> mockedList = new ArrayList<>();
        mockedList.add(new Todo("Göra labb", false, "Idag"));
        mockedList.add(new Todo("Göra labb 2", false, "Idag"));
        mockedList.add(new Todo("Göra annat", false, "Imorgon"));
        when(mockTodoService.getAllTodos()).thenReturn(mockedList);

        TodoBusinessLogic logic = new TodoBusinessLogic(mockTodoService);
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
    @Ignore
    public void getAllTodosForTomorrow() {
        TodoService mockTodoService = mock(TodoService.class);
        TodoBusinessLogic logic = new TodoBusinessLogic(mockTodoService);
        List<Todo> expected = new ArrayList<>();
        expected.add(new Todo("Göra annat", false, "Imorgon"));
        List<Todo> actual = logic.getAllTodosForTomorrow();
        for (int i = 0; i < expected.size(); i++) {
            Todo expectedTodo = expected.get(i);
            Assert.assertEquals(expectedTodo, actual.get(i));
        }
    }
}