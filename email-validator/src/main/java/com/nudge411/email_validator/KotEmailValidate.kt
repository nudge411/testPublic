package com.nudge411.email_validator

import java.util.regex.Pattern


class KotEmailValidate private constructor() {
    fun isValid(email: String?): Boolean {
        val regexPattern =
            Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$")
        val regMatcher = regexPattern.matcher(email)
        return regMatcher.matches()
    }

    companion object {
        var KotEmailValidate: KotEmailValidate? = null
        val instance: KotEmailValidate?
            get() = if (KotEmailValidate != null) KotEmailValidate else {
                KotEmailValidate()
            }
    }
}
