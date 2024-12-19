public interface ProjectManagementInterface {
    boolean addProject(String username, String password, Project project);
    ProjectPage accessProjectPage(String... projectCodes);
}
