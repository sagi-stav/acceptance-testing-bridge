public class Project {
    private String name;
    private String description;
    private int estimatedHours;
    private Proposer proposer;
    private String code;

    public Project(String name, String description, int estimatedHours, Proposer proposer) {
        this.name = name;
        this.description = description;
        this.estimatedHours = estimatedHours;
        this.proposer = proposer;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
