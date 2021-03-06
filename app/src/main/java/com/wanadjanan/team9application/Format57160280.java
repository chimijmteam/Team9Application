package com.wanadjanan.team9application;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.text.DecimalFormat;

/**
 * Created by Windown7 on 7/5/2560.
 */

public class Format57160280 implements IAxisValueFormatter {

    private DecimalFormat mFormat;

    public Format57160280() {

        // format values to 1 decimal digit
        mFormat = new DecimalFormat("###,###,##0");
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        // "value" represents the position of the label on the axis (x or y)
        return mFormat.format(value) + "บาท";
    }
}