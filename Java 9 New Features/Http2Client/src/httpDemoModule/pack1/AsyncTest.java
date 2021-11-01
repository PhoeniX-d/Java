package pack1;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.List;

public class AsyncTest{
	public static void main(String[] args) throws Exception{	
		String url = "https://hero-wars.com";
		sendGetSyncRequest(url);
	}
	
	public static void sendGetSyncRequest(String url) throws Exception{			
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest req = HttpRequest.newBuilder(new URI(url)).GET().build();		
		CompletableFuture<HttpResponse<String>> resp = client
  .sendAsync(req, HttpResponse.BodyHandlers.ofString());
		int count = 0;
		while(!resp.isDone()){
			System.out.println("Processing not done and doing other activity : " + ++count);
		}
		processResponse(resp.get());
	}
	
	public static void processResponse(HttpResponse resp){
		System.out.println("Status Code : " + resp.statusCode());
		System.out.println("------------------------------------------------------");
		//System.out.println("Body" + resp.body());	

		System.out.println("------------------------------------------------------");
		
		HttpHeaders header = resp.headers();
		Map<String, List<String>> map = header.map();
		System.out.println("Response Headers");
		map.forEach((k, v) -> System.out.println("\t" + k + " : " + v));	
	}
}
