package com.jiangren.javaee.datas;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by seabookchen on 26/08/2017.
 */
public class IdGenerator {

    public static Map<Class, Long> idGeneratorMap = new HashMap<>();

    public static long getId(Class clazz) {

        Long idNumber = idGeneratorMap.get(clazz);
        if (idNumber == null) {
            idGeneratorMap.put(clazz, 1l);
            return 1l;
        }

        idGeneratorMap.put(clazz, ++idNumber);

        return idNumber;
    }
}
