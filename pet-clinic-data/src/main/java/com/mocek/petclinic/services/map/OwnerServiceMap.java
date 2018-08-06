package com.mocek.petclinic.services.map;

import com.mocek.petclinic.model.Owner;
import com.mocek.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
