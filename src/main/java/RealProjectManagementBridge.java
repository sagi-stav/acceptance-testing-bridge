public class RealProjectManagementBridge implements ProjectManagementInterface {
    private final ProjectManagementImplementation system = new ProjectManagementImplementation();

    @Override
    public boolean addProject(String username, String password, Project project) {
        return system.addProject(username, password, project);
    }

    @Override
    public ProjectPage accessProjectPage(String... projectCodes) {
        return system.accessProjectPage(projectCodes);
    }
}
