import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class BookService {
    public static void main(String[] args) {
        String jsonResponse = BookAPI.getBooks();
        ObjectMapper mapper = new ObjectMapper();
        try {
            BookResponse response = mapper.readValue(jsonResponse, BookResponse.class);
            List<Book> books = response.getResults();
            books.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
