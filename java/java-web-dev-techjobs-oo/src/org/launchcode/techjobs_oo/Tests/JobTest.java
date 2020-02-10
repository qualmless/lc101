package org.launchcode.techjobs_oo.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobTest {
    Job test_job1;
    Job test_job2;

    @BeforeEach
    public void createTestJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
    }

    //TODO: add emptyTest so we can configure our runtime environment
    @Test
    void testTest() {
        assertEquals(10,10,.001);
    }

    //TODO: testing ID values
    @Test
    public void testSettingJobId() {
        assertEquals(1, test_job2.getId()-test_job1.getId(), .001);
    }

    //TODO:Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", test_job3.getName().toString());
        assertEquals("ACME", test_job3.getEmployer().toString());
        assertEquals("Desert", test_job3.getLocation().toString());
        assertEquals("Quality control", test_job3.getPositionType().toString());
        assertEquals("Persistence", test_job3.getCoreCompetency().toString());
    }

    //TODO: Test the equals Method
    @Test
    public void testJobsForEquality(){

    }
}