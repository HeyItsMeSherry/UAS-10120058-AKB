/**
 * NIM : 10120058
 * NAMA : Vidi Anandisa Fortuna
 * KELAS : IF-2
 */
package com.uas.notes.helper;

public class StringHelper {
    // Generate Username From Email
    public static String usernameFromEmail(java.lang.String email) {
        if (!email.contains("@")) return email;

        return email.split("@")[0];
    }
}
