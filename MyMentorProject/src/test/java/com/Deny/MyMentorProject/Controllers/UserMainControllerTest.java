package com.Deny.MyMentorProject.Controllers;

import com.Deny.MyMentorProject.Services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class UserMainControllerTest {

    // this  mock throws  a null pointer exception
    @MockBean
    private UserService userService;
    private MockMvc  mockMvc;

    @Test
    public void testRandomGreetingApi() throws Exception {
        when(userService.messagesToReturnRandomly("stevenson"))
                .thenReturn("I will make it one day");

        MockHttpServletRequestBuilder  requestBuilder = MockMvcRequestBuilders.get("/randomGreetings");

        ResultActions perform = mockMvc.perform(requestBuilder);
        MvcResult mvcResult = perform.andReturn();
        MockHttpServletResponse response = mvcResult.getResponse();
        int status = response.getStatus();
        assertEquals(200,status);
    }
}
