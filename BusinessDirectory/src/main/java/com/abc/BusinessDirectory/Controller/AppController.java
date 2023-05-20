package com.abc.BusinessDirectory.Controller;


import com.abc.BusinessDirectory.Entities.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Objects;

@Controller
public class AppController {

    @RequestMapping(method =  RequestMethod.GET, path="/login")
    public ResponseEntity<String> doLogin( @RequestBody Employee bussiness , @RequestBody Employee other){


        return  ResponseEntity.ok(bussiness.getName() + "\n" +bussiness.getAddress()+"\n"+
                other.getLat()+"\n" + other.getLongs());



            }
}
