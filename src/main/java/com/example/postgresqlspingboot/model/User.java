package com.example.postgresqlspingboot.model;

/**
 * The User model.
 */
public record User(String firstname, String lastname, String email, Integer age) {
}
