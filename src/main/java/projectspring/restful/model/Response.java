package projectspring.restful.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Response<T> {
    private T data;
    private String error;
}
