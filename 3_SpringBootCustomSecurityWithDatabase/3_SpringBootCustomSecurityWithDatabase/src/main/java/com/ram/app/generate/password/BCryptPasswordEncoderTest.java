package com.ram.app.generate.password;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("ram123"));
		System.out.println(bCryptPasswordEncoder.encode("amol123"));
	}
}
