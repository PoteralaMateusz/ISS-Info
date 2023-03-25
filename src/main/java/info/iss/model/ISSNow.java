package info.iss.model;

public class ISSNow {

    private String message;
    private Long timestamp;
    private ISSPosition issPosition;

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

    public ISSPosition getIssPosition() {
        return issPosition;
    }

    public void setIssPosition(ISSPosition issPosition) {
        this.issPosition = issPosition;
    }
}
