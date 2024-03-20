package com.example.restapidemo.controllers;

import com.example.restapidemo.Dog;
import com.example.restapidemo.Owner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {

    // http://localhost:8080 /string (String)  /owner (Object)  /owners (List of objects)  /owner/id (Object from id)

    @RequestMapping("/string")
    @ResponseBody
    public String getString(){
        return "STRINGS ARE FUNNY";
    }

    @RequestMapping("/owner")
    @ResponseBody
    public Owner getOwner(){
        return new Owner(1, "Anna");
    }


    @RequestMapping("/owners")
    @ResponseBody
    public List<Owner> getOwners(){
        // listan illustrerar en databas
        List<Owner> ownerList = new ArrayList<>(List.of(new Owner(1, "Kalle", new Dog(3, "HundHund")), new Owner(2, "Knut"), new Owner(3, "Yelly", new Dog(2, "fido"))));
        return ownerList;
    }

    @RequestMapping("/owner/{id}")
    @ResponseBody
    public Owner getOwnerWithId(@PathVariable("id") int id){
        List<Owner> ownerList = new ArrayList<>(List.of(new Owner(1, "Kalle", new Dog(3, "HundHund")), new Owner(2, "Knut"), new Owner(3, "Yelly", new Dog(2, "fido"))));
        //"Hittepålösning" / "dummy"
        return ownerList.get(id-1);
    }
}
