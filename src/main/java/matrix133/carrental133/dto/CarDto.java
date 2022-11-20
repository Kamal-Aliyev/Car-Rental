package matrix133.carrental133.dto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class CarDto {

    Long id;

    @NotNull
    String name;

    @NotNull
    Double price;
}
