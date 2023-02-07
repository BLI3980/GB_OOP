package Adapter.meteo;

import java.time.LocalDateTime;

public class AdaptorST500 implements MeteoSensor{
    private SensorTemperature stemp;

    public AdaptorST500(SensorTemperature stemp) {
        this.stemp = stemp;
    }


    @Override
    public int getId() {
        return stemp.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)stemp.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(stemp.year(),
                1,1,0,0,0);
        dateTime.plusDays((long)stemp.day());
        dateTime.plusSeconds((long)stemp.second());
        return dateTime;
    }
}
