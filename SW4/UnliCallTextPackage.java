package SW4;

import java.util.*;

public class UnliCallTextPackage implements UnliCallOffer {
    private static Map<String, Boolean> offerMap = new HashMap<>();

    static {
        offerMap.put("Smart", false);
        offerMap.put("Globe", true);
        offerMap.put("Ditto", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCalltext) {
        return String.valueOf(unliCalltext);
    }
}
