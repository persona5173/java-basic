package kr.ac.cnu.pattern.ovserver.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rokim on 2017. 5. 26..
 */
public class WeatherDataCenter {

    List<WeatherObserver> observerList = new ArrayList();

    public void addObserver(WeatherObserver observer) {
        observerList.add(observer);
    }

    public void notifyWeatherData(WeatherData weatherData) {
        for (WeatherObserver observer : observerList) {
            observer.receive(weatherData);
        }
    }
}
