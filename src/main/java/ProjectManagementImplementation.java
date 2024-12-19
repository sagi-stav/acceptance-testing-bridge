public class ProjectManagementImplementation implements ProjectManagementInterface {
    @Override
    public boolean addProject(String username, String password, Project project) {
        if (!"validUser".equals(username) || !"validPass".equals(password)) {
            return false;
        }
        project.setCode("P" + System.currentTimeMillis());
        return true;
    }

    @Override
    public ProjectPage accessProjectPage(String... projectCodes) {
        if (projectCodes.length != 1) {
            throw new IllegalArgumentException("A single project must be selected.");
        }
        return new ProjectPage(projectCodes[0]);
    }
}
