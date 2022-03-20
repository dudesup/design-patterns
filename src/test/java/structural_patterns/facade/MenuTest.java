package structural_patterns.facade;

import org.junit.jupiter.api.Test;
import structural_patterns.facade.menuExample.Menu;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuTest {
    @Test
    void shouldDisplayDumplingsWithPotatoAndQuarkCuision() {
        //GIVEN
        Menu menu = new Menu();
        var expected = "Dumplings with potato and quark";

        //WHEN
        var result = menu.dumplingsWithPotatoAndQuark();

        //THEN
        assertEquals(result, expected);
    }
}