package com.taller.taller_java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Realizar un algoritmo que permita consultar la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
 */

public class ej13 {
    public static void main(String[] args) {
        DateTimeFormatter dtmFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtmFormatter.format(LocalDateTime.now()));
    }
}
