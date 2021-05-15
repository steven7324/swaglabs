package com.swaglabs.util;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Esperar {
    public void esperarObjeto(int t) {
        try {
            TimeUnit.SECONDS.sleep(t);
        } catch (Exception e) {
            Logger.getLogger("No se pudo esperar el objeto: " + e);
        }
    }
}
