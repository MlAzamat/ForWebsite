package server_rest;


public class Main {
    public static void main(String[] args) {
        new Server((req, resp) -> {
            return "<html><body><h1>Hello, Client</h1>IT IS HTTP REST SERVER</body></html>";
        }).bootstrap();
    }
}

// accepts any request, any method
// its logic can be nested in the server class
