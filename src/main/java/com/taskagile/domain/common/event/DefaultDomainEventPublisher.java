package com.taskagile.domain.common.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


/**
 * DefaultDomainEventPublisher
 */
@Component
public class DefaultDomainEventPublisher implements DomainEventPublisher{

    @Autowired
    private ApplicationEventPublisher actualPublisher;

    public DefaultDomainEventPublisher(ApplicationEventPublisher actualPublisher) {
      this.actualPublisher = actualPublisher;
    }
  
    @Override
    public void publish(DomainEvent event) {
      actualPublisher.publishEvent(event);
    }
}