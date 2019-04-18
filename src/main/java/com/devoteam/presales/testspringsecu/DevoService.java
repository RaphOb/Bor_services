package com.devoteam.presales.testspringsecu;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevoService {

    public DevoRepository devorepo;

    public DevoService(DevoRepository devorepo) {
        this.devorepo = devorepo;
    }
    public Iterable<Devo> list() {
        return devorepo.findAll();
    }
    public Devo save(Devo devos ) {
        return devorepo.save(devos);
    }
}
