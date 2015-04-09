package neforon.sunshine.utils;

import java.io.Serializable;

/**
 * Created by sunshine on 4/6/15.
 */
public class ResultData implements Serializable {
    private Integer statusCode;

    private Object data;

    public ResultData() {

    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public <T> T getData() {
        return data == null ? null : (T) data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
