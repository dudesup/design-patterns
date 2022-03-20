package structural_patterns.facade;

import org.junit.jupiter.api.Test;
import structural_patterns.facade.deliveryExample.DeliveryManagerFactory;
import structural_patterns.facade.deliveryExample.PackageInfo;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryManagerFactoryTest {
    @Test
    void shouldBeDeliveryByBicycle() {
        //GIVEN
        PackageInfo packageInfo = new PackageInfo("SMALL", "3kg");

        //WHEN
        String output = new DeliveryManagerFactory().deliveryManagerFactory(packageInfo);

        //THEN
        assertEquals(output, "Package delivering using bicycle for " + packageInfo.getSize()
                + " and weight " + packageInfo.getWeight());
    }

    @Test
    void shouldBeDeliveryByCar() {
        //GIVEN
        PackageInfo packageInfo = new PackageInfo("MEDIUM", "23kg");

        //WHEN
        String output = new DeliveryManagerFactory().deliveryManagerFactory(packageInfo);

        //THEN
        assertEquals(output, "Package delivering using car for " + packageInfo.getSize()
                + " and weight " + packageInfo.getWeight());
    }

    @Test
    void shouldBeDeliveryByTruck() {
        //GIVEN
        PackageInfo packageInfo = new PackageInfo("LARGE", "53kg");

        //WHEN
        String output = new DeliveryManagerFactory().deliveryManagerFactory(packageInfo);

        //THEN
        assertEquals(output, "Package delivering using truck for " + packageInfo.getSize()
                + " and weight " + packageInfo.getWeight());
    }

    @Test
    void shouldNotBeDelivered() {
        //GIVEN
        PackageInfo packageInfo = new PackageInfo("BIG", "63kg");

        //WHEN
        String output = new DeliveryManagerFactory().deliveryManagerFactory(packageInfo);

        //THEN
        assertEquals(output, "FAILED TO DELIVERY");
    }
}