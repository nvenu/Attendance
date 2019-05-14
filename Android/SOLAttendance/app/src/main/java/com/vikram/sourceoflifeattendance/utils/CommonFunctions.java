package com.vikram.sourceoflifeattendance.utils;

import android.content.Context;
import android.widget.Toast;

public class CommonFunctions {



    private Boolean isFormValid(String task, Context context) {
        if (task.isEmpty()) {
            Toast.makeText(context, "Field cannot be empty", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }


}
