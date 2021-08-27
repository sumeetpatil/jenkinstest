package com.sumeet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        App app = new App();
        assertEquals( "testdata", app.test("testdata") );
    }
}
