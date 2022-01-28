package com.aulajava.exemplogradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class ExemploGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploGradleApplication.class, args);

		System.out.println(fatorial(10));

	}
			public static int fatorial( int value ) {
				if ( value == 1 ) {
					return value;
				} else {
					return value * fatorial((value -1));
				}
			}
			// 5
			// 5 * 4 * 3 * 2 * 1
			// 120

}
