package RunnerFolder.Services;
import RunnerFolder.Model.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Service
public class ProjectService {



    @Autowired
    ObjectMapper objectMapper;

    public ResponseEntity<List<String>> getAllAccounts() {

        List<String> all = new ArrayList<>();
        all.add("dfdf");
        all.add("fff");
        all.add("ddd");
        all.add("fffffgfgf");
        return new ResponseEntity<>(all, HttpStatus.OK);
    }



    public ResponseEntity<List<Person>> getAllPerson() {

        List<Person> all = new ArrayList<>();
        all.add(Person.builder()
                .name("name 1")
                .id(1).build());
        all.add(Person.builder()
                .name("name 2")
                .id(2).build());
        String s = "fdgfg";
        try {
            s = objectMapper.writeValueAsString(all);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(s, HttpStatus.OK);
    }

}