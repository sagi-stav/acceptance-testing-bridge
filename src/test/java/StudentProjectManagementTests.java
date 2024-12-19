import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;
public class StudentProjectManagementTests extends TestCase {
    protected ProjectManagementInterface bridge;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // Use the real bridge; this can be swapped with a mock or proxy bridge
        this.bridge = new RealProjectManagementBridge();
    }

    public void testAddProjectWithValidCredentials() {
        Project project = new Project("AI Research", "Research on AI", 100,
                new Proposer("John", "Doe", "john.doe@example.com", "1234567890", "Tech Org"));
        boolean success = bridge.addProject("validUser", "validPass", project);
        assertTrue("Project should be added successfully", success);
    }

    public void testAddProjectWithInvalidPassword() {
        Project project = new Project("AI Research", "Research on AI", 100,
                new Proposer("John", "Doe", "john.doe@example.com", "1234567890", "Tech Org"));
        boolean success = bridge.addProject("validUser", "wrongPass", project);
        assertFalse("Project addition should fail with invalid password", success);
    }

    public void testAccessSingleProjectPage() {
        ProjectPage page = bridge.accessProjectPage("P1234");
        assertNotNull("Project page should be accessible", page);
    }

    public void testAccessMultipleProjects() {
        try {
            bridge.accessProjectPage("P1234", "P5678");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(true); // Test passes if exception is thrown
        }
    }
}
