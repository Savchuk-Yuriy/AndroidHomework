package u.savchuk.retroexample;

//POJO файл для преобразования из JSON строки в реальный Java обьект

public class ApiObject {

    private Integer userId;

    private Integer id;

    private String title;

    private String completed;

    public ApiObject(int userId, int id, String title, String completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCompleted() {
        return completed;
    }

}
