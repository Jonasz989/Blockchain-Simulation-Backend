package com.example.blockchainsimulation.domain.mapper;

import com.example.blockchainsimulation.persistence.exception.MapperException;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

@Component
public final class Mapper {

    public static <S, T> T map(S source, Class<T> destinationType) throws MapperException {
        try {
            T destination = destinationType.getDeclaredConstructor().newInstance();

            List<Field> fields = new ArrayList<>();
            fields.addAll(List.of(destinationType.getSuperclass().getDeclaredFields()));
            fields.addAll(List.of(destinationType.getDeclaredFields()));

            for (Field field : fields) {
                if (Modifier.isFinal(field.getModifiers())) {
                    continue;
                }
                Object object = new PropertyDescriptor(field.getName(), source.getClass()).getReadMethod().invoke(source);

                new PropertyDescriptor(field.getName(), destination.getClass()).getWriteMethod().invoke(destination, object);
            }
            return destination;
        } catch (Exception e) {
            e.printStackTrace();
            throw new MapperException(source.getClass(), destinationType);
        }
    }
}
