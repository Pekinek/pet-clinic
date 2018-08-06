package com.mocek.petclinic.services.map;

import com.mocek.petclinic.model.Vet;
import com.mocek.petclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
