package com.anwesys.milestone3demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.hateoas.MediaTypes;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
public class ItalianRestControllerIntegrationTest extends Milestone3demoApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private GermanRepository germanRepository;

    @Test
    public void givenItalianCiao_whenGetItalian_thenStatus200() throws Exception {
        mvc.perform(get("/it/ciao")
            .contentType(MediaTypes.HAL_FORMS_JSON_VALUE)).andDo(print())
            .andExpect(status().isOk())
            .andExpect(content()
            .contentTypeCompatibleWith(MediaTypes.HAL_JSON_VALUE));
    }
}
