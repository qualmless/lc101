package org.launchcode.techjobs_oo.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.Job;

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

//

    //TODO: testing ID values
    @Test
    public void testSettingJobId() {
        assertEquals(1, test_job2.getId()-test_job1.getId(), .001);
    }
}