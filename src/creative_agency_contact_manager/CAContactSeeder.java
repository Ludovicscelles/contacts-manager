package creative_agency_contact_manager;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CAContactSeeder {

    public static void seed(CAContactManager contactManager) {
        contactManager.addCaContact(
                new CAContact("Deleaner", "Helena", "hdeleaner.example.com", "01-23-45-67-89", "Creative",
                        "Art Director",
                        "-Lead the creative team in developing innovative concepts and designs-",
                        LocalDate.of(1980, 4, 10),
                        LocalDate.of(2005, 6, 1), new BigDecimal("2499.99"),
                        new CAAddress("12", "rue de la Paix", "Paris", "75000", "France")));

        contactManager
                .addCaContact(new CAContact("Dubois", "Pierre", "pdubois@example.com", "01-98-76-54-32", "Creative",
                        "Graphic Designer",
                        "-Create visual concepts and designs for various media-", LocalDate.of(1990, 8, 15),
                        LocalDate.of(2015, 9, 1),
                        new BigDecimal("2099.99"),
                        new CAAddress("34", "Avenue des Champs-Élysées", "Paris", "75008", "France")));
        contactManager.addCaContact(
                new CAContact("Lemoine", "Sophie", "slemoine@example.com", "01-56-78-90-12", "Creative", "Copywriter",
                        "-Write compelling copy for advertising campaigns and marketing materials-",
                        LocalDate.of(1985, 2, 20),
                        LocalDate.of(2010, 3, 15), new BigDecimal("2099.99"),
                        new CAAddress("56", "Boulevard Saint-Michel", "Paris", "75005", "France")));

        contactManager.addCaContact(
                new CAContact("Martin", "Luc", "lmartin@example.com", "01-23-45-67-89", "Account Management",
                        "Account Manager",
                        "-Manage client accounts and ensure satisfaction-", LocalDate.of(1982, 6, 5),
                        LocalDate.of(2008, 4, 1),
                        new BigDecimal("2299.99"),
                        new CAAddress("78", "Rue de Rivoli", "Paris", "75001", "France")));
    }
}