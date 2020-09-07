package com.mimosaplatform.demo.dto;

import javax.persistence.Column;

public class EnclosureSensorUpdate {

    private String temperatureTop;

    private String temperatureBottom;

    private String humidityTop;

    private String humidityBottom;

    private String soilMoisture;

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
