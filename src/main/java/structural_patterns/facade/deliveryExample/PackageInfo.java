package structural_patterns.facade.deliveryExample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PackageInfo {
    public String size;
    public String weight;

    public PackageInfo(String size, String weight) {
        this.size = size;
        this.weight = weight;
    }
}
