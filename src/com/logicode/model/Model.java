package com.logicode.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjenkins on 10/12/2016.
 */
public class Model {
    public List getVals (String color){
        List vals = new ArrayList<>();
        if (color.equals("amber")){
            vals.add("Amber 1");
            vals.add("Amber 2");

        }else{
            vals.add("Not Amber1");
            vals.add("Not Amber2");
        }
        return vals;
    }
}
