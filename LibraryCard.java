// Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку 
// для определенной книги. Каждая карточка должна содержать параметры типов 
// K для номера карточки и V для информации о книге.


public class LibraryCard<K, V>{

    public LibraryCard(K cardNumber, V bookInfo) {
        this.cardNumber = cardNumber;
        this.bookInfo = bookInfo;
    }
    protected K cardNumber;
    protected V bookInfo;

    public K getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(K cardNumber) {
        this.cardNumber = cardNumber;
    }
    public V getBookInfo() {
        return bookInfo;
    }
    public void setBookInfo(V bookInfo) {
        this.bookInfo = bookInfo;
    }
       
}

