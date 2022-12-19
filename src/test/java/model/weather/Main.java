package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
    private double temp;
    private int pressure;
    private int humidity;
    @JsonProperty("temp_min")
    private double temMin;
    @JsonProperty("temp_max")
    private double temMax;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemMin() {
        return temMin;
    }

    public void setTemMin(double temMin) {
        this.temMin = temMin;
    }

    public double getTemMax() {
        return temMax;
    }

    public void setTemMax(double temMax) {
        this.temMax = temMax;
    }
}
