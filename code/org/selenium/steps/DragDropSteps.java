package org.selenium.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.selenium.pages.DragDropPage;


/**
 * Created by Piyush on 6/11/17.
 */
public class DragDropSteps {

    DragDropPage dp;

    public DragDropSteps(){dp = new DragDropPage();}

    @Given("^Launch the URL \"([^\"]*)\"$")
    public void launchTheURL(String s){
        dp.launchTheURL(s);
    }

    @Then("^Click Droppable$")
    public void clickDroppable() {
        dp.clickDroppable();
    }

    @And("^Drag and Drop the element$")
    public void dragAndDropTheElement() {
        dp.dragAndDropTheElement();
    }

    @Then("^Iterate the table$")
    public void iterateTheTable() {
        dp.iterateTheTable();
    }
}
