import org.apache.commons.lang3.StringUtils;

/**
 * Created by Urumi on 2015/8/20.
 */
public class Door {
    private static boolean isOpened = false;

    private static String stateOfDoor;

    public boolean open() {
        isOpened = true;
        stateOfDoor = "Is open";
        return  isOpened;
    }

    public String getState() {
        if(StringUtils.isBlank(stateOfDoor)) {
            return  "i don't know";
        }
        return stateOfDoor;
    }


}
