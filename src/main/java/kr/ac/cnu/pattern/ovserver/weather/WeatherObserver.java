package kr.ac.cnu.pattern.ovserver.weather;

/**
 * Created by rokim on 2017. 5. 29..
 */
public interface WeatherObserver {
    public abstract void receive(WeatherData weatherData);
}
