package com.sportplatform.util;


import org.modelmapper.ModelMapper;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

public class ModelMapperUtils{

    public static <S, C> S convert(Class<S> superClass, C childObject) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(childObject, superClass);
    }

    public static <S, C> S convert( S superObject, C childObject) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(childObject, superObject);
        return superObject;
    }

}
