package employee.employeelist.Controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class employeelist {
    @CrossOrigin
    @GetMapping("/employees")
    public ArrayList employees(){
        EmployeeModel employee =  new EmployeeModel(1, "nhon", "bach", 20000000);
        EmployeeModel employee1 =  new EmployeeModel(2 , "mamh", "hung", 1200000);
        EmployeeModel employee2 =  new EmployeeModel(3 , "duy", "thai", 23000000);
        System.out.println(employee.toString());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        ArrayList<EmployeeModel> array = new ArrayList<>();
        array.add(employee);
        array.add(employee1);
        array.add(employee2);
        return array;
    }
}