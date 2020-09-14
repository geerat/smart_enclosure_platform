package com.mimosaplatform.demo.dao.impl;

import com.mimosaplatform.demo.dao.EnclosureRepo;
import com.mimosaplatform.demo.dto.EnclosureTargetUpdate;
import com.mimosaplatform.demo.models.Enclosure;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class EnclosureRepoImpl implements EnclosureRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void updateSensorData(Enclosure newEnclosure) {
        Enclosure oldEnclosure = em.find(Enclosure.class, newEnclosure.getEnclosureId());
        oldEnclosure.setTemperatureTop(newEnclosure.getTemperatureTop());
        oldEnclosure.setTemperatureBottom(newEnclosure.getTemperatureBottom());
        oldEnclosure.setHumidityTop(newEnclosure.getHumidityTop());
        oldEnclosure.setHumidityBottom(newEnclosure.getHumidityBottom());
        oldEnclosure.setSoilMoisture(newEnclosure.getSoilMoisture());

        em.persist(oldEnclosure);
    }

    @Override
    @Transactional
    public void updateTargetData(EnclosureTargetUpdate enclosureTargetUpdate, String enclosureId){
        Enclosure oldEnclosure = em.find(Enclosure.class,enclosureId);
        oldEnclosure.setTemperatureTopTarget(enclosureTargetUpdate.getTemperatureTopTarget());
        oldEnclosure.setTemperatureBottomTarget(enclosureTargetUpdate.getTemperatureBottomTarget());
        oldEnclosure.setHumidityTopTarget(enclosureTargetUpdate.getHumidityTopTarget());
        oldEnclosure.setHumidityBottomTarget(enclosureTargetUpdate.getHumidityBottomTarget());
        oldEnclosure.setSoilMoistureTarget(enclosureTargetUpdate.getSoilMoistureTarget());

        em.persist(oldEnclosure);
    }





}
