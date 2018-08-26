package com.mocek.petclinic.services.map;

import com.mocek.petclinic.model.Owner;
import com.mocek.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
