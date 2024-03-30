// Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. 
// Каждая книга должна содержать параметр типа T для ее названия.

public class Book<T> {
    private T title;

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }

    public void setTitle(T title) {
        this.title = title;
    }
    
}

