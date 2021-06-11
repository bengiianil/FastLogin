package com.bengianil.fastlogin;

import java.net.URI;

public class DGLoginCoordinator {

    /** Property **/
    Integer appID;
    String language;
    URI serviceRedirectUrl;
    Boolean disableCellLogin;
    Boolean autoLoginOnly;
    Boolean disableAutoLogin;
    String state;

    /** Constructor **/
    public DGLoginCoordinator(Builder builder) {
        this.appID = builder.appID;
        this.language = builder.language;
        this.serviceRedirectUrl = builder.serviceRedirectUrl;
        this.disableCellLogin = builder.disableCellLogin;
        this.autoLoginOnly = builder.autoLoginOnly;
        this.disableAutoLogin = builder.disableAutoLogin;
        this.state = builder.state;
    }


    /** Getter Methods **/
    public Integer getAppID() {
        return appID;
    }
    public String getLanguage() {
        return language;
    }
    public URI getServiceRedirectUrl() {
        return serviceRedirectUrl;
    }

    public Boolean getDisableCellLogin() {
        return disableCellLogin;
    }
    public Boolean getAutoLoginOnly() {
        return autoLoginOnly;
    }
    public Boolean getDisableAutoLogin() {
        return disableAutoLogin;
    }
    public String getState() {
        return state;
    }


    /** Builder Pattern **/
    public static class Builder{

        private Integer appID;
        private String language;
        private URI serviceRedirectUrl;
        private Boolean disableCellLogin;
        private Boolean autoLoginOnly;
        private Boolean disableAutoLogin;
        private String state;

        public Builder(){ }

        public Builder appID(Integer appID){
            this.appID = appID;
            return this;
        }
        public Builder language(String language){
            this.language = language;
            return this;
        }
        public Builder serviceRedirectUrl(URI serviceRedirectUrl){
            this.serviceRedirectUrl = serviceRedirectUrl;
            return this;
        }
        public Builder disableCellLogin(Boolean disableCellLogin){
            this.disableCellLogin = disableCellLogin;
            return this;
        }
        public Builder autoLoginOnly(Boolean autoLoginOnly){
            this.autoLoginOnly = autoLoginOnly;
            return this;
        }
        public Builder disableAutoLogin(Boolean disableAutoLogin){
            this.disableAutoLogin = disableAutoLogin;
            return this;
        }
        public Builder state(String state){
            this.state = state;
            return this;
        }

        public DGLoginCoordinator build() {
            return new DGLoginCoordinator(this);
        }

    }
}
