package za.ac.cput.factory;
/*
        SystemAdminFactory.java
        Author: Lefu Kumeke 218147856
        Date :03 April 2022
 */
import za.ac.cput.entity.SystemAdmin;
import za.ac.cput.util.GenericHelper;

public class SystemAdminFactory {

    public static SystemAdmin createSystemAdmin( String adminName, String adminEmail) {
        String adminID = GenericHelper.generateID();

        SystemAdmin systemAdmin = new SystemAdmin.Builder()
                .setAdminID(adminID)
                .setAdminName(adminName)
                .setAdminEmail(adminEmail)
                .build();

        return systemAdmin;
    }
}
