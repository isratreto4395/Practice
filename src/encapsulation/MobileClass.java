package encapsulation;

public class MobileClass {
    public String mobileBrand;
    private String mobileColor;
    private int mobilePrice;
    private boolean mobilePhoto;
    private char mobileSize;
    private boolean mobileSim;

    public MobileClass(){

    }

    public MobileClass(String mobileColor, int mobilePrice) {
        this.mobileColor = mobileColor;
        this.mobilePrice = mobilePrice;
    }

    public MobileClass(int mobilePrice, boolean mobilePhoto, char mobileSize, boolean mobileSim) {
        this.mobilePrice = mobilePrice;
        this.mobilePhoto = mobilePhoto;
        this.mobileSize = mobileSize;
        this.mobileSim = mobileSim;
    }

    public String getMobileBrand(){
        return mobileBrand;
    }
    public void setMoblieBrand(String mobileBrand){
        this.mobileBrand = mobileBrand;
}

    public String getMobileColor() {
        return mobileColor;
    }

    public void setMobileColor(String mobileColor) {
        this.mobileColor = mobileColor;
    }

    public int getMobilePrice() {
        return mobilePrice;
    }

    public void setMobilePrice(int mobilePrice) {
        this.mobilePrice = mobilePrice;
    }

    public boolean isMobilePhoto() {
        return mobilePhoto;
    }

    public void setMobilePhoto(boolean mobilePhoto) {
        this.mobilePhoto = mobilePhoto;
    }

    public char getMobileSize() {
        return mobileSize;
    }

    public void setMobileSize(char mobileSize) {
        this.mobileSize = mobileSize;
    }

    public boolean isMobileSim() {
        return mobileSim;
    }

    public void setMobileSim(boolean mobileSim) {
        this.mobileSim = mobileSim;
    }
}


