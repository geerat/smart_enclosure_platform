package com.mimosaplatform.demo.dao;

import com.mimosaplatform.demo.dto.EnclosureTargetUpdate;
import com.mimosaplatform.demo.models.Enclosure;

public interface EnclosureRepo {

    void updateSensorData(Enclosure newEnclosure);

    void updateTargetData(EnclosureTargetUpdate enclosureTargetUpdate, String enclosureId);


}
