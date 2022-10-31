package com.ensao.java.advanced.types;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SuppressWarnings("all")


@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.SOURCE)
@Documented
public @interface MyAnnotation {
	String A_CONSTANTE = "constante";
	String aMethod();
	String anotherMethod();

}

