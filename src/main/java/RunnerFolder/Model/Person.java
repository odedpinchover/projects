package RunnerFolder.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Builder
@ToString
@Getter
@Setter
public class Person {
    private String name;
    private int id;

}