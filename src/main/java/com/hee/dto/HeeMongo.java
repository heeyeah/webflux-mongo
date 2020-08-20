package com.hee.dto;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "slcType")
public class HeeMongo {

    @Id
    private String id;
    private String rootType;

}
