package com.ironyard.services;

import com.ironyard.entities.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by illladell on 6/23/16.
 */
public interface EventRepository extends CrudRepository<Event, Integer> {
}
