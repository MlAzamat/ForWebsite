package server_rest;

public interface HttpHandler {
    String handle(HttpRequest request, HttpResponse response);
}
