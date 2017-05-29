package kr.ac.cnu.pattern.ovserver.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rokim on 2017. 5. 26..
 */
public class WeatherDataCenter {

//    List<WeatherObserver> observerList = new ArrayList();


    private Radio radio;
    private Television television;
    private IPhone iPhone;

    public void setiPhone(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }

    public void notifyWeatherData(WeatherData weatherData) {
        radio.sound(weatherData);
        television.display(weatherData);
        iPhone.receiveData(weatherData);
    }
}
