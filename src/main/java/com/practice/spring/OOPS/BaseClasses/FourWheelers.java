package com.practice.spring.OOPS.BaseClasses;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class FourWheelers {
    private int windows;

    public void printWindows() {
        log.info("Number of Windows {}", windows);
    }
}
