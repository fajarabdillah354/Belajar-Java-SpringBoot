package belajar.spring.boot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RajaongkirRequest {
    private String origin;
    private String destination;
    private int weight;
    private String courier;

}
