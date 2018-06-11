package com.udacity.gradle.builditbigger;

import static junit.framework.Assert.assertTrue;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
        com.udacity.gradle.builditbigger.MainActivityFragment fragment =
                new com.udacity.gradle.builditbigger.MainActivityFragment();
        fragment.testFlag = true;

        new EndpointAsyncTask().execute(fragment);
        Thread.sleep(5000);

        assertTrue(fragment.loadedJoke,
                fragment.loadedJoke != null);
    }
}