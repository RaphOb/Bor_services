package com.devoteam.presales.testspringsecu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevoService {

    @Autowired
    public DevoRepository devorepo;


    public DevoService(DevoRepository devorepo) {
        this.devorepo = devorepo;
    }
    public Iterable<Devo> list() {
        return devorepo.findAll();
    }
    public Iterable<Devo> list1() {return devorepo.findAllEntity();}
    public Iterable<Devo> list2() {return devorepo.findAllSecteur();}
    public Devo save(Devo devo ) {
        return devorepo.save(devo);
    }
    public Iterable<Devo> save(List<Devo> devos) {
        return devorepo.saveAll(devos);
    }
}
