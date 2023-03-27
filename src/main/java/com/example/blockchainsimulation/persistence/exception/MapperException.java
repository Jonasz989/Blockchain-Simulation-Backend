package com.example.blockchainsimulation.persistence.exception;

public class MapperException extends RuntimeException {
    public <T, S> MapperException(Class<T> source, Class<S> destination) {
        super("Mapping exception from " + source.getName() + " to " + destination.getName());
    }
}
