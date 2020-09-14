package com.mimosaplatform.demo.models;

import com.mimosaplatform.demo.dto.EnclosureSensorUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enclosures")
public class Enclosure {

    @Id
    @Column(name="enclosure_id")
    private String enclosureId;

    @Column(name="temperature_top")
    private String temperatureTop;

    @Column(name="temperature_bottom")
    private String temperatureBottom;

    @Column(name="humidity_top")
    private String humidityTop;

    @Column(name="humidity_bottom")
    private String humidityBottom;

    @Column(name="soil_moisture")
    private String soilMoisture;



    @Column(name="temperature_top_target")
    private String temperatureTopTarget;

    @Column(name="temperature_bottom_target")
    private String temperatureBottomTarget;

    @Column(name="humidity_top_target")
    private String humidityTopTarget;

    @Column(name="humidity_bottom_target")
    private String humidityBottomTarget;

    @Column(name="soil_moisture_target")
    private String soilMoistureTarget;

    public Enclosure(String enclosureId, EnclosureSensorUpdate sensorData) {
        this.enclosureId = enclosureId;
        this.temperatureTop = sensorData.getTemperatureTop();
        this.temperatureBottom = sensorData.getHumidityBottom();
        this.humidityTop = sensorData.getHumidityTop();
        this.humidityBottom = sensorData.getHumidityBottom();
        this.soilMoisture = sensorData.getSoilMoisture();
    }

    public Enclosure() {
    }

    public String getEnclosureId() {
        return enclosureId;
    }

    public void setEnclosureId(String enclosureId) {
        this.enclosureId = enclosureId;
    }

    public String getTemperatureTop() {
        return temperatureTop;
    }

    public void setTemperatureTop(String temperatureTop) {
        this.temperatureTop = temperatureTop;
    }

    public String getTemperatureBottom() {
        return temperatureBottom;
    }

    public void setTemperatureBottom(String temperatureBottom) {
        this.temperatureBottom = temperatureBottom;
    }

    public String getHumidityTop() {
        return humidityTop;
    }

    public void setHumidityTop(String humidityTop) {
        this.humidityTop = humidityTop;
    }

    public String getHumidityBottom() {
        return humidityBottom;
    }

    public void setHumidityBottom(String humidityBottom) {
        this.humidityBottom = humidityBottom;
    }

    public String getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(String soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public String getTemperatureTopTarget() {
        return temperatureTopTarget;
    }

    public void setTemperatureTopTarget(String temperatureTopTarget) {
        this.temperatureTopTarget = temperatureTopTarget;
    }

    public String getTemperatureBottomTarget() {
        return temperatureBottomTarget;
    }

    public void setTemperatureBottomTarget(String temperatureBottomTarget) {
        this.temperatureBottomTarget = temperatureBottomTarget;
    }

    public String getHumidityTopTarget() {
        return humidityTopTarget;
    }

    public void setHumidityTopTarget(String humidityTopTarget) {
        this.humidityTopTarget = humidityTopTarget;
    }

    public String getHumidityBottomTarget() {
        return humidityBottomTarget;
    }

    public void setHumidityBottomTarget(String humidityBottomTarget) {
        this.humidityBottomTarget = humidityBottomTarget;
    }

    public String getSoilMoistureTarget() {
        return soilMoistureTarget;
    }

    public void setSoilMoistureTarget(String soilMoistureTarget) {
        this.soilMoistureTarget = soilMoistureTarget;
    }
}
