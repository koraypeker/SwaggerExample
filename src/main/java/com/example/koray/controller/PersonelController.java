package com.example.koray.controller;

import com.example.koray.model.Personel;
import com.example.koray.service.PersonelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Personel Controller", description = "API's for personel process")
@RestController
public class PersonelController {

    @Autowired
    PersonelService personelService;

    @RequestMapping(value = "/findByName", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Find personel by name", notes = "return all personels by name",
        response = Personel.class)
    public List<Personel> findAllPersonelByName(@RequestParam(value="name") String name) {

        return personelService.findAllPersonelByName(name);
    }

    @RequestMapping(value = "/getPersonels", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Get all personel list", notes = "Returns all personels", response = Personel.class)
    public List<Personel> findAllPersonel(){

        return personelService.getPersonels();
    }

    @RequestMapping(value = "/insertPersonel", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Insert personel", notes = "Insert personel")
    public void insertPersonel(@ModelAttribute("personel") Personel personel){

        personelService.savePersonel(personel);
    }

}
