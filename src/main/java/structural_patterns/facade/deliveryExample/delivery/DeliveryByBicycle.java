package structural_patterns.facade.deliveryExample.delivery;

import structural_patterns.facade.deliveryExample.PackageInfo;

public class DeliveryByBicycle implements PackageDelivery{
    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "Package delivering using bicycle for " + packageInfo.getSize()
                + " and weight " + packageInfo.getWeight();
    }
}
