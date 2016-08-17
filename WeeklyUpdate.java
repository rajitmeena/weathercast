package com.example.admin.weatherforecast;

/**
 * Created by Admin on 8/7/2016.
 */
public class WeeklyUpdate {

    public String summary;
    public String icon;
    public String temperatureMax;
    public String temperatureMin;
    public String apparentTemperatureMax;
    public String apparentTemperatureMin;
    public String humidity;
    public String windSpeed;
    public String pressure;
    public String ozone;

    public WeeklyUpdate(String summary, String icon, String temperatureMax, String temperatureMin, String apparentTemperatureMax, String apparentTemperatureMin,
                        String humidity, String windSpeed, String pressure, String ozone) {
        this.summary = summary;
        this.icon = icon;
        this.temperatureMax = temperatureMax;
        this.temperatureMin = temperatureMin;
        this.apparentTemperatureMax = apparentTemperatureMax;
        this.apparentTemperatureMin = apparentTemperatureMin;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.ozone = ozone;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(String temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public String getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(String temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public String getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    public void setApparentTemperatureMax(String apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    public String getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    public void setApparentTemperatureMin(String apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getOzone() {
        return ozone;
    }

    public void setOzone(String ozone) {
        this.ozone = ozone;
    }
}