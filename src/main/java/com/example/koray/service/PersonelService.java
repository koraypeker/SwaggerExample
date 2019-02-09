package com.example.koray.service;

import com.example.koray.model.Personel;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonelService {

    private List<Personel> personelList;

    @PostConstruct
    public void init(){
        personelList = new ArrayList<>();
        personelList.add(new Personel(1L, "Koray", "PEKER"));
        personelList.add(new Personel(2L, "Halit", "CAN"));
        personelList.add(new Personel(3L, "Taner", "YILDIRIM"));
        personelList.add(new Personel(4L, "Gizem", "ŞEN"));
        personelList.add(new Personel(5L, "Tuba", "DİNÇ"));
    }

    public List<Personel> findAllPersonelByName(String name){

        List<Personel> personelListByName = personelList.stream().
                filter(personel -> personel.getName().equalsIgnoreCase(name)).collect(Collectors.toList());

        return personelListByName;
    }

    public List<Personel> getPersonels(){
        return personelList;
    }

    public void savePersonel(Personel personel){
        personelList.add(personel);
    }
}
