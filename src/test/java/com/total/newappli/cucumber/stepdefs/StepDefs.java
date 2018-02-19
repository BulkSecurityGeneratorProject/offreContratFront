package com.total.newappli.cucumber.stepdefs;

import com.total.newappli.OffreContratFrontApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = OffreContratFrontApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
