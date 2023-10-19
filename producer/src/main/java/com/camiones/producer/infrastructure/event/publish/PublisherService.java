package com.camiones.producer.infrastructure.event.publish;

import java.util.Map;

public interface PublisherService {

  void publishEvent(Map<String, Object> body);
}
