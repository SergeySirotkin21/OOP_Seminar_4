import java.util.ArrayList;
import java.util.List;

/**
 * ДЗ. Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. 
Каждая книга должна содержать параметр типа T для ее названия.
Создайте обобщенный класс LibraryCard<K, V>, который представляет
библиотечную карточку 
для определенной книги. Каждая карточка должна содержать параметры типов 
K для номера карточки и V для информации о книге.
Создайте класс Library, который будет представлять библиотеку. 
У этого класса должны быть методы для добавления книг и выдачи 
библиотечных карточек.
Добавьте метод для вывода информации о всех выданных книгах с их
библиотечными карточками.
 */
public class Main {

    public static void main(String[] args) {

       
        Library library = new Library();
        List<String> listBooks = new ArrayList<>();
       
            // Kниги в библиотеке
        Book<String> book1 = new Book<>("Вишневый сад А.Чехов");
        Book<String> book2 = new Book<>("Тихий Дон М. Шолохов");
        listBooks.add(book1.getTitle());
        listBooks.add(book2.getTitle());
        System.out.println("Список книг: " + listBooks);

        library.addBook(126, "Град обреченных, Братья Стругацкие ");
        library.addBook(237, "Игра престолов, Дж Мартин ");
        library.addBook(832, "Игрок, Ф. Достоевский ");
        library.showLendBooks();

        

        // LibraryCard<Integer, String> card1 = library.getCard(126);
        // LibraryCard<Integer, String> card2 = library.getCard(237);
   
    }
    
} 
    
