package com.udemy.springmongodemo.services;

import com.udemy.springmongodemo.commands.UnitOfMeasureCommand;
import reactor.core.publisher.Flux;

import java.util.Set;

public interface UnitOfMeasureService {

    Flux<UnitOfMeasureCommand> listAllUoms();
}
