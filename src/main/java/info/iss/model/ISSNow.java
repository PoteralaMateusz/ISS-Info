package info.iss.model;

public class ISSNow {

    private String message;
    private Long timestamp;
    private ISSPosition iss_position;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ISSPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(ISSPosition iss_position) {
        this.iss_position = iss_position;
    }
}
