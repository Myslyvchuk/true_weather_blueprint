package com.myslyv4uk.weather.impl;

import java.util.concurrent.ThreadLocalRandom;

import com.myslyv4uk.weather.api.WeatherService;


public class WeatherServiceImpl implements WeatherService {

  @Override
  public int getCurrentTemperature(int from, int to) {
    return ThreadLocalRandom.current().nextInt(from, to + 1);
  }

  public synchronized void start() {
    System.out.println("Service WeatherServiceImpl activated");
  }

  public synchronized void stop() {
    System.out.println("Service WeatherServiceImpl deactivated");
  }
}
