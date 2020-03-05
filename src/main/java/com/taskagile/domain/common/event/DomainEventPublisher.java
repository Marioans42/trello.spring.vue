package com.taskagile.domain.common.event;

/**
 * DomainEventPublisher
 */
public interface DomainEventPublisher {

    void publish(DomainEvent event);
}