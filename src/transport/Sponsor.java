package transport;

public class Sponsor {
    private String sponsorName;
    private Integer supportSum;

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName == null || sponsorName == ""?"ABC":sponsorName;
    }

    public int getSupportSum() {
        return supportSum;
    }

    public void setSupportSum(Integer supportSum) {
        this.supportSum = supportSum == null || supportSum == 0?1000:supportSum;
    }
    public void sponsorRace(){
        System.out.println("The sponsor sum is " + getSupportSum());
    }

    public Sponsor(String sponsorName, int supportSum) {
        setSponsorName(sponsorName);
        setSupportSum(supportSum);
    }
}
