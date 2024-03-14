public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("See you again", "Nhac hay", "MP3-123", 200, 180);

        Book book = new Book("Hoc them tieng anh", "Sach hay", "123K", 100, "Namne", 300, "dayhoc");

        System.out.println("MP3 Information:");
        mp3.showInfo();
        System.out.println();

        System.out.println("Book Information:");
        book.showInfo();
    }
}
