//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author[] author = new Author[2];
        author[0] = new Author("parsa",'m',"parsa20ataei@gmail.com");
        author[1] = new Author("amir",'m',"parsas@gmail.com");
        Book book = new Book("book",author,4400,3);
        System.out.println("\n"+book.toString()+"\n\n");
        System.out.println(book.getAuthorNames());
    }
}