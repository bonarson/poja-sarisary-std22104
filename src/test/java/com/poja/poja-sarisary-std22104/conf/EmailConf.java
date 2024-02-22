package com.poja.poja-sarisary-std22104.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.poja-sarisary-std22104.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
