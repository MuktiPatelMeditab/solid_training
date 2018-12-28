package com.meditab.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
	
    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    
}
