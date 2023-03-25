package info.iss.view;

import info.iss.api.ISSAstrosData;
import info.iss.api.ISSNowData;
import info.iss.model.ISSNow;

public class Main {

    public static void main(String[] args) {

        ISSAstrosData astrosData = new ISSAstrosData("http://api.open-notify.org/astros.json");

        astrosData.getPeopleInSpace().forEach(people -> System.out.println("Name: " + people.getName() + ", craft: " + people.getCraft() + "."));

        ISSNowData issNowData = new ISSNowData("http://api.open-notify.org/iss-now.json");

        ISSNow issNow = issNowData.getIssNow();

        System.out.println("Pozycja Międzynarodowej Stacji Kosmicznej:");
        System.out.println("Długość :" + issNow.getIss_position().getLongitude());
        System.out.println("Szerokość :" + issNow.getIss_position().getLatitude());


    }
}
