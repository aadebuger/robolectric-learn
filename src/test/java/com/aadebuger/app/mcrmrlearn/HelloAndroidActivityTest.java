package com.aadebuger.app.mcrmrlearn;

import android.app.Activity;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {

  @org.junit.Test
  public void titleIsCorrect() throws Exception {
    Activity activity = Robolectric.setupActivity(HelloAndroidActivity.class);
    System.out.println("title="+activity.getTitle().toString());
    assertTrue(activity.getTitle().toString().equals("Deckard"));
  }
  @org.junit.Test
  public void titleIsCorrectError() throws Exception {
    Activity activity = Robolectric.setupActivity(HelloAndroidActivity.class);
    assertTrue(activity.getTitle().toString().equals("Deckard1"));
  }
}
