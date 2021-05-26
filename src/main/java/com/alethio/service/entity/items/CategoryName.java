package com.alethio.service.entity.items;

import java.util.Arrays;

public enum CategoryName {
    food, clothes;

    public static CategoryName fineName(String str) {
        for (CategoryName cn : CategoryName.values()) {
            if (cn.name().equalsIgnoreCase(str))
                return cn;
        }
        return null;
    }

}
