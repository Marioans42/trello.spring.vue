package com.taskagile.domain.model.user.event;

import com.taskagile.domain.common.event.DomainEvent;
import com.taskagile.domain.model.user.User;

import org.springframework.util.Assert;

/**
 * UserRegisteredEvent
 */
public class UserRegisteredEvent extends DomainEvent{

    private static final long serialVersionUID = 1L;

    private User user;

    public UserRegisteredEvent(Object source, User user) {
        super(source);
        Assert.notNull(user, "Parameter `user` must not be null");
        this.user = user;
    }
    
    public User getUser() {
        return this.user;
      }
    
      public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
    
        UserRegisteredEvent that = (UserRegisteredEvent) o;
        return that.user.equals(this.user);
      }
    
      public int hashCode() {
        return this.user.hashCode();
      }
    
      public String toString() {
        return "UserRegisteredEvent{" +
          "user='" + user + '\'' +
          "timestamp='" + getTimestamp() + '\'' +
          '}';
      }
}