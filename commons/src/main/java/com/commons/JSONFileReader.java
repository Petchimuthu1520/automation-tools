import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.twozo.page.Contacts.*;

import java.io.FileReader;
import java.time.LocalDate;

/**
 * reads data from a JSON file and mapping it to a Person object.
 */
public class JSONFileReader {

    /**
     * Reads JSON data from a file and maps it to a Person object.
     *
     * @return A Person object populated with data from the JSON file.
     */
    public Person getPerson() {
        final Person person = new Person();

        try {
            final JSONParser jsonParser = new JSONParser();
            final FileReader fileReader = new FileReader("C:\\Users\\V Karthick\\IdeaProjects\\TestNG\\src\\main\\resources\\data.json");
            final Object object = jsonParser.parse(fileReader);
            final JSONArray jsonArray = (JSONArray) object;

            for (Object object1 : jsonArray) {
                final JSONObject jsonObject = (JSONObject) object1;

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return person;
    }
}
