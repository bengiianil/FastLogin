package com.bengianil.fastlogin;

import java.net.URI;

public class Builder {

    private final Integer appID;
    private final String language;
    private final URI serviceRedirectUrl;
    private final Boolean disableCellLogin;
    private final Boolean autoLoginOnly;
    private final Boolean disableAutoLogin;
    private final String state;


    public Builder(DGLoginCoordinator dgLoginCoordinator){
        this.appID = dgLoginCoordinator.appID;
        this.language = dgLoginCoordinator.language;
        this.serviceRedirectUrl = dgLoginCoordinator.serviceRedirectUrl;
        this.disableCellLogin = dgLoginCoordinator.disableCellLogin;
        this.autoLoginOnly = dgLoginCoordinator.autoLoginOnly;
        this.disableAutoLogin = dgLoginCoordinator.disableAutoLogin;
        this.state = dgLoginCoordinator.state;

    }

    public int getAppID(){
        return appID;
    }
    public String getLanguage(){
        return language;
    }
    public URI getServiceRedirectUrl(){
        return serviceRedirectUrl;
    }
    public Boolean getDisableCellLogin(){
        return disableCellLogin;
    }
    public Boolean getAutoLoginOnly(){
        return autoLoginOnly;
    }
    public Boolean disableAutoLogin(){
        return disableAutoLogin;
    }
    public String getState(){
        return state;
    }

    public static class DGLoginCoordinator{
        private final Integer appID;
        private final String language;
        private final URI serviceRedirectUrl;
        private final Boolean disableCellLogin;
        private final Boolean autoLoginOnly;
        private final Boolean disableAutoLogin;
        private final String state;

        public DGLoginCoordinator(int appID){
            this.appID = appID;
        }
        public DGLoginCoordinator(String language){
            this.language = language;
        }
        public DGLoginCoordinator(URI serviceRedirectUrl){
            this.serviceRedirectUrl = serviceRedirectUrl;
        }
        public DGLoginCoordinator(Boolean disableCellLogin){
            this.disableCellLogin = disableCellLogin;
        }
        public DGLoginCoordinator(Boolean autoLoginOnly){
            this.autoLoginOnly = autoLoginOnly;
        }
        public DGLoginCoordinator(Boolean disableAutoLogin){
            this.disableAutoLogin = disableAutoLogin;
        }
        public DGLoginCoordinator(String state){
            this.state = state;
        }

    }
}
