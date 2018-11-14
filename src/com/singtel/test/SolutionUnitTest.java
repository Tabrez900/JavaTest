package com.singtel.test;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class SolutionUnitTest {
  
  @Test
  public void testMain() {
    Bird bird = mock(Bird.class);
    doNothing().when(bird).fly();
    bird.fly();
    verify(bird, times(1)).fly();
  }

}
