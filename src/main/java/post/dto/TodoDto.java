package post.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString

public class TodoDto {
        int userId;
        int id;
        String title;
        boolean completed;
}
