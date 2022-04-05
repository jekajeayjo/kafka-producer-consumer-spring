package md.kafkaproducer.model;

public class Message {
    private String message;
    private Long age;

    public Message() {
    }

    public Message(String message, Long age) {
        this.message = message;
        this.age = age;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
