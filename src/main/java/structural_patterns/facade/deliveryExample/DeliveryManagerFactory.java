package structural_patterns.facade.deliveryExample;

import structural_patterns.facade.deliveryExample.delivery.DeliveryByBicycle;
import structural_patterns.facade.deliveryExample.delivery.DeliveryByCar;
import structural_patterns.facade.deliveryExample.delivery.DeliveryByTruck;

public class DeliveryManagerFactory {
    public String deliveryManagerFactory(PackageInfo packageInfo) {
        if (packageInfo.getSize().equals("SMALL"))
            return new DeliveryByBicycle().deliveryWay(packageInfo);
        if (packageInfo.getSize().equals("MEDIUM"))
            return new DeliveryByCar().deliveryWay(packageInfo);
        if (packageInfo.getSize().equals("LARGE"))
            return new DeliveryByTruck().deliveryWay(packageInfo);

        return "FAILED TO DELIVERY";
    }
}
