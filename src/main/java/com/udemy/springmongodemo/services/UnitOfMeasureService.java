package com.udemy.springmongodemo.services;

import com.udemy.springmongodemo.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
