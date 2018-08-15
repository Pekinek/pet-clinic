package com.mocek.petclinic.services.map;

import com.mocek.petclinic.model.Vet;
import com.mocek.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
