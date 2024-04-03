package com.commons;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.twozo.page.Contacts.*;

import java.io.FileReader;

public class JSONFileReader {

    public Person getPerson() throws Exception {
        final JSONParser jsonParser = new JSONParser();
        final FileReader fileReader = new FileReader("C:\\Users\\V Karthick\\IdeaProjects\\TestNG\\src\\main\\resources\\data.json");
        final Object object = jsonParser.parse(fileReader);
        final JSONArray jsonArray = (JSONArray) object;
        final Person person = new Person();

        for (Object o : jsonArray) {
            final JSONObject jsonObject = (JSONObject) o;

            person.setFirstName((String) jsonObject.get("firstName"));
            person.setLastName((String) jsonObject.get("lastName"));
            person.setEmail((String) jsonObject.get("email"));
            person.setEmailType(EmailType.valueOf((String) jsonObject.get("emailType")));
            person.setPhoneNumber((String) jsonObject.get("phoneNumber"));
            person.setPhoneType(PhoneType.valueOf((String) jsonObject.get("phoneType")));
            person.setCompanyName((String) jsonObject.get("companyName"));
            person.setDesignation((String) jsonObject.get("designation"));
            person.setSalesOwner((String) jsonObject.get("salesOwner"));
            person.setLifecycleStage(LifecycleStage.valueOf((String) jsonObject.get("lifecycleStage")));
            person.setSource(Source.valueOf((String) jsonObject.get("source")));
            person.setDateOfBirth(LocalDate.parse((String) jsonObject.get("dateOfBirth")));
            person.setDepartment((String) jsonObject.get("department"));
            person.setAddress1((String) jsonObject.get("address1"));
            person.setAddress2((String) jsonObject.get("address2"));
            person.setCity((String) jsonObject.get("city"));
            person.setState((String) jsonObject.get("state"));
            person.setPinCode((String) jsonObject.get("pinCode"));
            person.setFacebook((String) jsonObject.get("facebook"));
            person.setTwitter((String) jsonObject.get("twitter"));
            person.setLinkedIn((String) jsonObject.get("linkedIn"));
            person.setSubscriptionStatus(SubscriptionStatus.valueOf((String) jsonObject.get("subscriptionStatus")));
            person.setSubscriptionTypes(SubscriptionTypes.valueOf((String) jsonObject.get("subscriptionTypes")));
        }
        fileReader.close();

        return person;
    }
}
