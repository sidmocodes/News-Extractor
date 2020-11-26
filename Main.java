/***
import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.http.*;
import java.net.URL;
import java.net.URI;
import java.util.regex.*;

class Main {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        String query = in.nextLine();
        query = query.trim();
        query = query.replaceAll(" ", "%20");

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
                "https://newscatcher.p.rapidapi.com/v1/search?q=" + query + "&media=True&sort_by=relevancy&lang=en&page=1"))
                .header("x-rapidapi-key", "{}") //Add key
                .header("x-rapidapi-host", "newscatcher.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

	}

} ***/


//TO search for latest news
//Comment the previous code to use this
import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.http.*;
import java.net.URL;
import java.net.URI;
import java.util.regex.*;

class Main {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        String query = in.nextLine();
        query = query.trim();
        query = query.replaceAll(" ", "%20");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://newscatcher.p.rapidapi.com/v1/latest_headlines?topic=tech&lang=en&media=True"))
                .header("x-rapidapi-key", "{}") //Add token
                .header("x-rapidapi-host", "newscatcher.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

	}

}
