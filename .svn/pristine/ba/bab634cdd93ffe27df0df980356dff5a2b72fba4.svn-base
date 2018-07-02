package com.bdqn.tcmp.util;

import java.util.Calendar;
import java.util.Date;

public class DetermineTime {
    /**
     * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
     *
     * @param nowTime   当前时间
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return 1:在开始时间之前 2在区间之内 3在开始之后
     * @author jqlin
     */
    public static int isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return 2;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.before(begin)) {
            return 1;
        } else if (date.after(begin) && date.before(end)) {
            return 2;
        } else {
            return 3;
        }
    }
}
