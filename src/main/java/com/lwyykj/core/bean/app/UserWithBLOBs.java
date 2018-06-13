package com.lwyykj.core.bean.app;

import java.io.Serializable;

public class UserWithBLOBs extends User implements Serializable {
    /**
     * 地址
     */
    private String address;

    private String personalizedsignature;

    private static final long serialVersionUID = 1L;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPersonalizedsignature() {
        return personalizedsignature;
    }

    public void setPersonalizedsignature(String personalizedsignature) {
        this.personalizedsignature = personalizedsignature == null ? null : personalizedsignature.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", address=").append(address);
        sb.append(", personalizedsignature=").append(personalizedsignature);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}