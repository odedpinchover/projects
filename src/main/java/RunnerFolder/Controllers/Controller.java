package RunnerFolder.Controllers;


import RunnerFolder.Model.Person;
import RunnerFolder.Services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ProjectService service;

    @RequestMapping(value = "oded/getStrings", method = RequestMethod.GET)
    public ResponseEntity<List<String>> getAllStrings() {
        return service.getAllAccounts();
    }

    @RequestMapping(value = "oded/getPersons", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> getAllPersons() {
        return service.getAllPerson();
    }
}
