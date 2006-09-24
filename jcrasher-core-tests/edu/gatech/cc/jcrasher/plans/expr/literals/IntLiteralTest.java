/*
 * Copyright (C) 2006 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.gatech.cc.jcrasher.plans.expr.literals;

import junit.framework.TestCase;
import edu.gatech.cc.jcrasher.Loadee;

/**
 * @author csallner@gatech.edu (Christoph Csallner)
 */
public class IntLiteralTest extends TestCase {

  protected final int _one = -1;
  protected final int zero = 0;
  protected final int one = 1;

  protected final IntLiteral _oneLit = new IntLiteral(_one);
  protected final IntLiteral zeroLit = new IntLiteral(zero);
  protected final IntLiteral oneLit = new IntLiteral(one);
  
  
  public void testGetReturnType() {
    assertEquals(Integer.TYPE, _oneLit.getReturnType());
    assertEquals(Integer.TYPE, zeroLit.getReturnType());
    assertEquals(Integer.TYPE, oneLit.getReturnType());
  }

  public void testExecute() {
    assertEquals(_one, _oneLit.execute());
    assertEquals(zero, zeroLit.execute());
    assertEquals(one, oneLit.execute());
  }

  public void testToStringClass() {
    assertEquals("-1", _oneLit.toString(Loadee.class));
    assertEquals("0", zeroLit.toString(Loadee.class));
    assertEquals("1", oneLit.toString(Loadee.class));
  }

}