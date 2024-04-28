package qa;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.beans.PropertyEditor;

import static jdk.internal.misc.ThreadFlock.open;

public class SimplTest {

    @Test
    @DisplayName("Текст к тесу что он тестирует")
     void simpleTest() {
        open("https://ya.ru/");
        $("#text").setValue("Selenide");
        $("").click();



    }



}