package com.mocek.petclinic.services.map;

import com.mocek.petclinic.model.PetType;
import com.mocek.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
}
