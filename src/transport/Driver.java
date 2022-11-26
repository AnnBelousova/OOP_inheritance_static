package transport;

public abstract class  Driver {
    private String fullName;
    private Boolean hasDriverLicence;
    private int experience;

    public String getFullName() {
        return fullName;
    }

    public Boolean getHasDriverLicence() {
        return hasDriverLicence;
    }

    public void setHasDriverLicence(Boolean hasDriverLicence) {
        this.hasDriverLicence = !hasDriverLicence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void beginMovements();
    public abstract void stop();
    public abstract void fillAuto();

    public Driver(String fullName) {
        this.fullName = fullName;
    }

}
