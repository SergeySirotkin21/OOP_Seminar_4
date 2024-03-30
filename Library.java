
// Создайте класс Library, который будет представлять библиотеку. 
// У этого класса должны быть методы для добавления книг и выдачи  библиотечных карточек.

import java.util.ArrayList;
import java.util.List;

public class Library {       

    protected List<LibraryCard<Integer, String>> givenBooks; // список выданных книг
    public Library() {
        this.givenBooks = new ArrayList<>();
    }
    
    // Метод для добавления книги в библиотеку
    public <T> void addBook(int cardNumber, String bookInfo) {
        LibraryCard<Integer, String> card = new LibraryCard<Integer,String>( cardNumber, bookInfo);
        givenBooks.add(card);
    }
    
        // Метод для выдачи книги и возврата библиотечной карточки
    public LibraryCard<Integer, String> getCard(int cardNumber) {
        for (LibraryCard<Integer, String> card : givenBooks) {
            if (card.getCardNumber() != cardNumber) {
                return null;
            }
         
            return card;
        }
        return null;
      
    }
    @Override
    public String toString(){
    
        return String.format("%d  %s, card.getCardNumber, card.getBookInfo");
    }
    
        // Метод для вывода информации о всех выданных книгах с их библиотечными карточками
    public void showLendBooks() {
        for (LibraryCard<Integer, String> card : givenBooks) {
            System.out.println("Выдано: Номер карты: " + card.getCardNumber()+", "+ "Книга: "+ card.getBookInfo());
            }
        
    }
}

