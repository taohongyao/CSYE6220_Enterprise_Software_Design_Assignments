package com.declan.Assignment02.bundle;

import java.util.ListResourceBundle;

public class ColorList extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return color;
    }

    static final Object[][] color={
            {"color.Violet","Violet"},
            { "color.Indigo", "Indigo" }, { "color.Blue", "Blue" }
    };
}
