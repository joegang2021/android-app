package net.ivpn.client.rest.data.session;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SessionNewRequestBody {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("wg_public_key")
    @Expose
    private String wgPublicKey;
    @SerializedName("app_name")
    @Expose
    private String appName;
    @SerializedName("force")
    @Expose
    private Boolean force;

    public SessionNewRequestBody(String username, String wgPublicKey, Boolean force) {
        this.username = username;
        this.wgPublicKey = wgPublicKey;
        this.appName = "IVPN for Android";
        this.force = force;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "SessionNewRequestBody{" +
                "username='" + username + '\'' +
                ", wgPublicKey='" + wgPublicKey + '\'' +
                ", appName='" + appName + '\'' +
                ", force=" + force +
                '}';
    }
}