package com.mocek.petclinic.services.map;

import com.mocek.petclinic.model.Pet;
import com.mocek.petclinic.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
