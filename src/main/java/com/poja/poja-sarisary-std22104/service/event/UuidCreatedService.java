package com.poja.poja-sarisary-std22104.service.event;

import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.poja.poja-sarisary-std22104.PojaGenerated;
import com.poja.poja-sarisary-std22104.endpoint.event.gen.UuidCreated;
import com.poja.poja-sarisary-std22104.repository.DummyUuidRepository;
import com.poja.poja-sarisary-std22104.repository.model.DummyUuid;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class UuidCreatedService implements Consumer<UuidCreated> {

  private final DummyUuidRepository dummyUuidRepository;

  @Override
  public void accept(UuidCreated uuidCreated) {
    var dummyUuid = new DummyUuid();
    dummyUuid.setId(uuidCreated.getUuid());
    dummyUuidRepository.save(dummyUuid);
  }
}
