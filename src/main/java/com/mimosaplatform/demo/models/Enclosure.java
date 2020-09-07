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
}
