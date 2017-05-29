package kr.ac.cnu.pattern.ovserver.weather;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by rokim on 2017. 5. 28..
 */
@Slf4j
public class Television {
    public void display(WeatherData weatherData) {
        log.info("====================");
        log.info("화면에 보여줍니다.");
        log.info("{}", weatherData);
        log.info("====================");
    }
}
