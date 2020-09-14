package com.mimosaplatform.demo.dto;

public class EnclosureTargetUpdate {

    private String temperatureTopTarget;

    private String temperatureBottomTarget;

    private String humidityTopTarget;

    private String humidityBottomTarget;

    private String soilMoistureTarget;

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
