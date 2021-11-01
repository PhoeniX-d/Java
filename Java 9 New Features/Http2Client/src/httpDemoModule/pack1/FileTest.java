package pack1;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.nio.file.Paths;
import java.net.URI;
import java.util.Map;
import java.util.List;

public class FileTest{
	public static void main(String[] args) throws Exception{
		
		HttpClient client = HttpClient.newHttpClient();
		
		String url = "https://hero-wars.com";
		
		HttpRequest req = HttpRequest.newBuilder(new URI(url)).GET().build();
		
		HttpResponse resp = client.send(req, HttpResponse.BodyHandlers.ofFile(Paths.get("Resp.html")));
		
		System.out.println("Status Code : " + resp.statusCode());
	}
}
