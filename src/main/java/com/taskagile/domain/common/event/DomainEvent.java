package com.taskagile.domain.common.event;

import org.springframework.context.ApplicationEvent;

/**
 * DomainEvent
 */
public abstract class DomainEvent extends ApplicationEvent {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public DomainEvent(Object source) {
        super(source);
        // TODO Auto-generated constructor stub
    }

    public long occurredAt() {
        // Return the underlying implementation's timestamp
        return getTimestamp();
      }
}