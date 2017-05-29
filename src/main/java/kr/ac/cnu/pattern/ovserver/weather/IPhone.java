package kr.ac.cnu.pattern.ovserver.weather;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by rokim on 2017. 5. 29..
 */
@Slf4j
public class IPhone {
    public void receiveData(WeatherData data) {
        log.info("----------");
        log.info("아이폰 알림");
        log.info("{}", data);
        log.info("----------");
    }
}
