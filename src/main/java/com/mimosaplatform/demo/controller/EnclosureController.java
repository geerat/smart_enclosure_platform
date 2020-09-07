package com.mimosaplatform.demo.controller;

import com.mimosaplatform.demo.dto.EnclosureSensorUpdate;
import com.mimosaplatform.demo.models.Enclosure;
import com.mimosaplatform.demo.resource.EnclosureResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("api/")
public class EnclosureController {

    @Autowired
    private EnclosureResource enclosureResource;

    @RequestMapping(value="/enclosures/{enclosureId}/sensors", method = RequestMethod.GET, produces = "application/json", consumes="application/json")
    public ResponseEntity<Enclosure> getSensorData(@PathVariable(value = "enclosureId") String enclosureId) {

        Enclosure enclosure = enclosureResource.getEnclosure(enclosureId);

        return new ResponseEntity<>(enclosure, HttpStatus.OK);

    }

    @RequestMapping(value="/enclosures/{enclosureId}/sensors/", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity<String> updateSensorData(@PathVariable(value = "enclosureId") String enclosureId, @RequestBody EnclosureSensorUpdate enclosureSensorData) {

        Enclosure enclosureUpdated = new Enclosure(enclosureId, enclosureSensorData);

        if(enclosureResource.updateSensorData(enclosureUpdated)){
            return new ResponseEntity<>("Sensor data updated", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Oops! That's an error!", HttpStatus.BAD_REQUEST);
        }

    }
}
