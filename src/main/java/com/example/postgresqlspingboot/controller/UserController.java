package com.example.postgresqlspingboot.controller;

import com.example.postgresqlspingboot.entity.UserEntity;
import com.example.postgresqlspingboot.model.User;
import com.example.postgresqlspingboot.repository.UserRepository;
import com.example.postgresqlspingboot.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The User controller.
 */
@RestController
public class UserController {
  /**
   * UserService.
   */
  @Autowired
  private UserService userService;

  /**
   * UserRepository.
   */
  @Autowired
  private UserRepository userRepository;

  /**
   * constant for users endpoint.
   */
  private static final String USERS_ENDPOINT = "/users";

  /**
   * Gets all users.
   *
   * @return All users
   */
  @GetMapping(USERS_ENDPOINT)
  public List<UserEntity> getAllUser() {
    return userRepository.findAll();
  }

  /**
   * Gets user.
   *
   * @param userId the user id
   * @return the user
   */
  @GetMapping(USERS_ENDPOINT + "/{id}")
  public Optional<UserEntity> getUser(@PathVariable("id") final Long userId) {
    return userRepository.findById(userId);
  }

  /**
   * Create user entity.
   *
   * @param user the user
   * @return the response entity
   */
  @PostMapping(USERS_ENDPOINT)
  public ResponseEntity<UserEntity> createUser(@RequestBody final User user) {
    final UserEntity userEntity = userService.createUser(user);

    return new ResponseEntity<>(userEntity, HttpStatus.CREATED);
  }

  /**
   * Update user entity.
   *
   * @param userId the id
   * @param user   the user
   * @return the response entity
   */
  @PatchMapping(USERS_ENDPOINT + "/{id}")
  public ResponseEntity<String> updateUser(@PathVariable("id") final Long userId, @RequestBody final User user) {
    return userService.updateUser(userId, user);
  }

  /**
   * Delete all users.
   */
  @DeleteMapping(USERS_ENDPOINT)
  public void deleteUsers() {
    userRepository.deleteAll();
  }

  /**
   * delete user.
   *
   * @param userId the user id
   */
  @DeleteMapping(USERS_ENDPOINT + "/{id}")
  public void deleteUser(@PathVariable("id") final Long userId) {
    userRepository.deleteById(userId);
  }

  /**
   * Gets all users ordered by age Descending.
   *
   * @return ordered users
   */
  @GetMapping("/usersOrderByAgeDesc")
  public List<UserEntity> getSorted() {
    return userRepository.findAll(Sort.by(Sort.Direction.DESC, "age"));
  }

  /**
   * Gets all users whose age is over 30.
   *
   * @return filtered users
   */
  @GetMapping("/usersOver30")
  public List<UserEntity> getUsersOver30() {
    return userRepository.findAll().stream().filter(user -> user.getAge() > 30).toList();
  }
}
