package com.sample.demo.todos.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({"title","done"})
class Todo{
    @JsonProperty("title")
    private  String title;

    @JsonProperty("done")
    private Boolean done;

}