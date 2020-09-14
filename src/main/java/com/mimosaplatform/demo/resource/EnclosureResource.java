package com.mimosaplatform.demo.resource;

import com.mimosaplatform.demo.dao.EnclosureDao;
import com.mimosaplatform.demo.dao.EnclosureRepo;
import com.mimosaplatform.demo.dto.EnclosureSensorUpdate;
import com.mimosaplatform.demo.dto.EnclosureTargetUpdate;
import com.mimosaplatform.demo.models.Enclosure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EnclosureResource {

    @Autowired
    private EnclosureDao enclosureDao;

    @Autowired
    private EnclosureRepo enclosureRepo;

    public Enclosure getEnclosure(String enclosureId) {
        Optional<Enclosure> enclosure = enclosureDao.findById(enclosureId);
        return enclosure.get();
    }

    public Boolean updateSensorData(Enclosure enclosure) {
        enclosureRepo.updateSensorData(enclosure);
        return true;
    }

    public Boolean updateTargetData(EnclosureTargetUpdate enclosureTargetUpdate, String enclosureId) {
        enclosureRepo.updateTargetData(enclosureTargetUpdate, enclosureId);
        return true;
    }
}
