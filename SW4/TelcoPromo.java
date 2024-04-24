package SW4;

public class TelcoPromo {
    public static void main(String[] args){

        TelcoSubscription smart = new Telco(15, 500, "Smart",false);
        TelcoSubscription globe = new Telco(10, 450, "Globe",true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto",true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(((Telco) smart).getTelcoName(), ((Telco) smart).getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price" + promo.showAllowance(((Telco) globe).getTelcoName(), ((Telco) globe).getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price" + promo.showAllowance(((Telco) ditto).getTelcoName(), ((Telco) ditto).getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(((Telco) smart).getTelcoName(), ((Telco) smart).getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(((Telco) globe).getTelcoName(), ((Telco) globe).getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(((Telco) ditto).getTelcoName(), ((Telco) ditto).getUnliCallText()));
    }
}
