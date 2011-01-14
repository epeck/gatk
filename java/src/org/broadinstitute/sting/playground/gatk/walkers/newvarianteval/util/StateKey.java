package org.broadinstitute.sting.playground.gatk.walkers.newvarianteval.util;

import java.util.TreeMap;

public class StateKey extends TreeMap<String, String> {
    public int hashCode() {
        int hashCode = 1;

        for (String key : this.keySet()) {
            String value = this.get(key);

            hashCode *= key.hashCode() + value.hashCode();
        }

        return hashCode;
    }

    public String toString() {
        String value = "";

        for ( String key : this.keySet() ) {
            value += "\tstate " + key + ":" + this.get(key) + "\n";
        }

        return value;
    }
}