package com.example.postgresqlspingboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The User entity.
 */
@Entity
@Table(name = "users")
public final class UserEntity {
  /**
   * ID of the User.
   */
  @Id
  @GeneratedValue
  private long id;

  /**
   * Firstname of the User.
   */
  @Column(name = "first_name", nullable = false)
  private String firstname;

  /**
   * Lastname of the User.
   */
  @Column(name = "last_name", nullable = false)
  private String lastname;

  /**
   * Email of the User.
   */
  @Column(name = "email", nullable = false)
  private String email;

  /**
   * Age of the User.
   */
  @Column(name = "age", nullable = false)
  private Integer age;

  /**
   * Gets id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(final long id) {
    this.id = id;
  }

  /**
   * Gets firstname.
   *
   * @return the firstname
   */
  public String getFirstname() {
    return firstname;
  }

  /**
   * Sets firstname.
   *
   * @param firstname the firstname
   */
  public void setFirstname(final String firstname) {
    this.firstname = firstname;
  }

  /**
   * Gets lastname.
   *
   * @return the lastname
   */
  public String getLastname() {
    return lastname;
  }

  /**
   * Sets lastname.
   *
   * @param lastname the lastname
   */
  public void setLastname(final String lastname) {
    this.lastname = lastname;
  }

  /**
   * Gets email.
   *
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets email.
   *
   * @param email the email
   */
  public void setEmail(final String email) {
    this.email = email;
  }

  /**
   * Gets age.
   *
   * @return the age
   */
  public Integer getAge() {
    return age;
  }

  /**
   * Sets age.
   *
   * @param age the age
   */
  public void setAge(final Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", firstName=" + firstname + ", lastName=" + lastname + ", emailId=" + email
            + "age=" + age + "]";
  }
}
