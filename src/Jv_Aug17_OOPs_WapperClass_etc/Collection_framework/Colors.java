package Jv_Aug17_OOPs_WapperClass_etc.Collection_framework;

public enum Colors {
    RED("ff0001"),
    Green("ff0002"),
    BLUE("ff0003");

    private String hexValue;
    Colors(String hexValue) {
        this.hexValue = hexValue;
    }
    public String getHexValue() {
        return hexValue;
    }
}
