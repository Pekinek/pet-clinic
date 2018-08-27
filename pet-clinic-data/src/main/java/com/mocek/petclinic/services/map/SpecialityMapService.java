package com.mocek.petclinic.services.map;

import com.mocek.petclinic.model.Speciality;
import com.mocek.petclinic.services.SpecialitiesService;
import org.springframework.stereotype.Service;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
}
