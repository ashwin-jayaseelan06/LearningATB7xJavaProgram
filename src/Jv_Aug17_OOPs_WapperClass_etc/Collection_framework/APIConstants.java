package Jv_Aug17_OOPs_WapperClass_etc.Collection_framework;

public enum APIConstants {

    BaseUrl("https://www.google.com/"),
    LoginPage("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&dsh=S185587810%3A1782823018028687&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AcDsRvzDvuhCL2ypYkQRkZUGuoDpXmeliwi71ZBZmeAh0aqToSGNmywnCqYBPtuKXQJ7LNLaRO7h"),
    Dashboard_Page("https://myaccount.google.com/?pli=1"),
    ChatBot("https://myaccount.google.com/personal-info");

    private String name;
    APIConstants(String name){
        this.name = name;
    }
    public String getvalue(){
        return name;
    }
}
