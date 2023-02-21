package example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ToyCar extends Toy {

    private String color;

    @Override
    public Object get(String name) {
        return null;
    }
}
