package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    App app = new App();
    @Test
    public void getTitle()
    {
        String title = app.getTitle();
        assertEquals("Google", title);
    }
}
