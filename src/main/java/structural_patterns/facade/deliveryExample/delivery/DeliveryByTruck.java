package structural_patterns.facade.deliveryExample.delivery;

import structural_patterns.facade.deliveryExample.PackageInfo;

public class DeliveryByTruck implements PackageDelivery{
    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "Package delivering using truck for " + packageInfo.getSize()
                + " and weight " + packageInfo.getWeight();
    }
}
