package structural_patterns.facade.deliveryExample.delivery;

import structural_patterns.facade.deliveryExample.PackageInfo;

public interface PackageDelivery {
    String deliveryWay(PackageInfo packageInfo);
}
