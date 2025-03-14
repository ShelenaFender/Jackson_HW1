package post.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import post.dto.TodoDto;

import java.net.URI;
import java.net.URISyntaxException;

public class TodoClientAppl {
    public static void main(String[] args) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        RequestEntity<String> request = new RequestEntity<>(HttpMethod.GET,
                new URI("https://jsonplaceholder.typicode.com/todos"));
        ResponseEntity<TodoDto[]> response = restTemplate.exchange(request, TodoDto[].class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        TodoDto[] todos = response.getBody();
        for (TodoDto todo : todos) {
            System.out.println(todo);
        }
    }
}
