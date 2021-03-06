package com.bwssystems.HABridge.dao;

import com.bwssystems.HABridge.api.hue.DeviceState;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*
 * Object to handle the device configuration
 */
public class DeviceDescriptor{
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("name")
	@Expose
    private String name;
	@SerializedName("mapId")
	@Expose
    private String mapId;
	@SerializedName("mapType")
	@Expose
    private String mapType;
	@SerializedName("deviceType")
	@Expose
    private String deviceType;
	@SerializedName("targetDevice")
	@Expose
    private String targetDevice;
	@SerializedName("offUrl")
	@Expose
    private String offUrl;
	@SerializedName("dimUrl")
	@Expose
    private String dimUrl;
    @SerializedName("onUrl")
    @Expose
    private String onUrl;
    @SerializedName("headers")
    @Expose
    private String headers;
    @SerializedName("httpVerb")
    @Expose
    private String httpVerb;
    @SerializedName("contentType")
    @Expose
    private String contentType;
    @SerializedName("contentBody")
    @Expose
    private String contentBody;
    @SerializedName("contentBodyOff")
    @Expose
    private String contentBodyOff;

    private DeviceState deviceState;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMapId() {
		return mapId;
	}

	public void setMapId(String mapId) {
		this.mapId = mapId;
	}

	public String getMapType() {
		return mapType;
	}

	public void setMapType(String mapType) {
		this.mapType = mapType;
	}

	public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getTargetDevice() {
		return targetDevice;
	}

	public void setTargetDevice(String targetDevice) {
		this.targetDevice = targetDevice;
	}

	public String getOffUrl() {
        return offUrl;
    }

    public void setOffUrl(String offUrl) {
        this.offUrl = offUrl;
    }

    public String getDimUrl() {
		return dimUrl;
	}

	public void setDimUrl(String dimUrl) {
		this.dimUrl = dimUrl;
	}

	public String getOnUrl() {
        return onUrl;
    }

    public void setOnUrl(String onUrl) {
        this.onUrl = onUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getHeaders() {
		return headers;
	}

	public void setHeaders(String headers) {
		this.headers = headers;
	}

	public String getHttpVerb() {
		return httpVerb;
	}

	public void setHttpVerb(String httpVerb) {
		this.httpVerb = httpVerb;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentBody() {
		return contentBody;
	}

	public void setContentBody(String contentBody) {
		this.contentBody = contentBody;
	}

	public String getContentBodyOff() {
		return contentBodyOff;
	}

	public void setContentBodyOff(String contentBodyOff) {
		this.contentBodyOff = contentBodyOff;
	}

	public DeviceState getDeviceState() {
		if(deviceState == null)
			deviceState = DeviceState.createDeviceState();
		return deviceState;
	}

	public void setDeviceState(DeviceState deviceState) {
		this.deviceState = deviceState;
	}

}
