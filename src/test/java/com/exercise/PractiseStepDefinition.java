package com.exercise;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PractiseStepDefinition {


  VowelCounter counter = new VowelCounter();
  String[] str;


  @When("^User send the below strings$")
  public void userSendTheBelowStrings(DataTable dt) {
    List<List<String>> data = dt.raw();
    str = new String[data.size()];
    for (int i = 0; i < data.size(); i++) {
      str[i] = String.valueOf(data.get(i));
    }
  }

  @Then("^user see the number of vowels and consonant for each string$")
  public void userSeeTheNumberOfVowelsAndConsonantForEachString() {

    var result = counter.getVowelListWithCount(str);
    System.out.println(result);
  }

  @Then("^user see the message$")
  public void userSeeTheMessage() {
    var result = counter.getVowelListWithCount(str);
    System.out.println(result);

  }
}
