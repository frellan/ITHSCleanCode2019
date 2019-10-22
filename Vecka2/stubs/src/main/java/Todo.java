public class Todo {
    private String title;
    private boolean done;
    private String date;

    public Todo(String title, boolean done, String date) {
        this.title = title;
        this.done = done;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Todo todo = (Todo) o;

        if (done != todo.done) return false;
        if (title != null ? !title.equals(todo.title) : todo.title != null) return false;
        return date != null ? date.equals(todo.date) : todo.date == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (done ? 1 : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
