import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server is running on port 8080...");

            while (true) {
                // Wait for a client to connect
                Socket clientSocket = serverSocket.accept();

                // Send a basic HTTP response
                OutputStream output = clientSocket.getOutputStream();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" +
                                      "<h1>Welcome to My Java Web Server!</h1>";
                output.write(httpResponse.getBytes("UTF-8"));
                output.flush();
                clientSocket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
