package SW4;

import java.util.*;

public class TelcoAllowance implements UsagePromo {

    private static Map<String, Integer> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", 15);
        allowanceMap.put("Globe", 10);
        allowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double price) {
        return "Data Allowance for " + telcoName + ": " + allowanceMap.get(telcoName) + " GB for ₱" + price + " per month.";
    }
}