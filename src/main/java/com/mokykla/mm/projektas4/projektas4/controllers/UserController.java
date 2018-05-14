package com.mokykla.mm.projektas4.projektas4.controllers;

import com.mokykla.mm.projektas4.projektas4.service.UserService;
import com.mokykla.mm.projektas4.projektas4.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
@Api(value = "user")
@RequestMapping(value = "/users")

public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;

    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Isrinkt vartotojus", notes = "Rodo registruotus vartotojus.")
    public List<User> getUsers() {

        return userService.getUsers();

    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Prideda vartotojus", notes = "Prideda registruotus vartotojus.")
    @ResponseStatus(HttpStatus.CREATED)

    public void createUser(@RequestBody @Valid final User createUserCommand) {

        userService.createUser(createUserCommand);

    }

    @RequestMapping(path = "/{username}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Trinti vartotojus", notes = "Trina registruotus vartotojus.")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable final String username) {
        userService.deleteUser(username);

    }

    @PostMapping("/update/{name}")
    public @ResponseBody
    void updateUser(@PathVariable String name, @RequestBody User user) {
        userService.updateUser(name, user);
    }
}