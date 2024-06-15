package com.sportplatform.util;


import org.modelmapper.ModelMapper;

public class MapperUtils {

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
