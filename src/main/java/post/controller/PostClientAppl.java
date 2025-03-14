package post.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import post.dto.PostDto;

import java.net.URI;
import java.net.URISyntaxException;

public class PostClientAppl {
    public static void main(String[] args) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        RequestEntity<String> request = new RequestEntity<>(HttpMethod.GET,
                new URI("https://jsonplaceholder.typicode.com/todos"));
        ResponseEntity<PostDto[]> response = restTemplate.exchange(request, PostDto[].class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        PostDto[] posts = response.getBody();
        for (PostDto post : posts) {
            System.out.println(post);
        }
    }
}
