package matrix133.carrental133.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "CarModel_name", length=50 , nullable = false ,unique = false)
    @NotBlank(message = "Name is mandatory")
    private String name;

    @Column(name = "Car_price", length=50 , nullable = false ,unique = false)
    @NotNull(message = "Price is mandatory")
    private Double price;
}
