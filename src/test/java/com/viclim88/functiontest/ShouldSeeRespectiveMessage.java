package com.viclim88.functiontest;

import org.junit.jupiter.api.Test;
import pojo.User;
import pojofactory.UserFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShouldSeeRespectiveMessage {

    @Test
    public void testGetUserName(){
        User user = UserFactory.generateUser("Trader");
        user.setuID("123123");

        assertEquals("123123", user.getuID());
    }
}
