package com.juanp.apiconsumer.util;

import java.util.Arrays;
import java.util.List;

public class StringUtils
{
    public static String getCommaSeparatedString(List list)
    {
        return Arrays.toString(list.toArray())
                .replaceAll("\\[|\\]","");
    }

    public static String getIntroSeparatedString(List list)
    {
        return Arrays.toString(list.toArray())
                .replaceAll(",\\s?","\n")
                .replaceAll("\\[|\\]","");
    }
}
