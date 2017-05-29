package kr.ac.cnu.pattern.ovserver.weather;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by rokim on 2017. 5. 28..
 */
@Slf4j
public class Radio {
    public void sound(WeatherData weatherData) {
        log.info("======================");
        log.info("라디오 채널로 방송합니다.");
        log.info("{}", weatherData);
        log.info("======================");
    }
}
