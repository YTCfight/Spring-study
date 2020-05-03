package frank.ioc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Duck {
    private String name;

    private Integer age;

    public Duck() {
    }

    public Duck(String name) {
        this.name = name;
    }

    public Duck(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


}
