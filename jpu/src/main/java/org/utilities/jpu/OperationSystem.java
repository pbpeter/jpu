package org.utilities.jpu;

import java.util.Locale;

/**
 * Mother class of any operation systems like Unix, iOS and Windows etc.
 */
public abstract class OperationSystem {

    // TODO: Was muss alles hier rein. Was wird alles benötigt. Was haben die Betriebssysteme gemeinsam?

    private final Locale locale;
    /*
    Zu dem Zeichenumbruch gibt es wohl vom Formatter eine allgemeine, plattformunabhängige Lösung. Schaue mal hier:
    https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
     */
    // Zeilenumbruch TODO: Bleibt das hier?
    private String lineBreak;

    public OperationSystem() {
        this.locale = createLocale();
    }

    public Locale getLocale() {
        return this.locale;
    }

    private static Locale createLocale() {
        String language = OSProperties.LANGUAGE.getValue();
        String country = OSProperties.COUNTRY.getValue();
        Locale locale;
        if (!language.isEmpty() && !country.isEmpty()) {
            locale = new Locale(language, country);
        } else if (!language.isEmpty()) {
            locale = new Locale(language);
        } else {
            locale = new Locale("en");
        }
        return locale;
    }
}
