/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.metron.profiler.clock;

import java.io.Serializable;

/**
 * A clock that reports whatever time you tell it to.  Most useful for testing.
 */
public class FixedClock implements Clock, Serializable {

  private long epochMillis;

  public void setTime(long epochMillis) {
    this.epochMillis = epochMillis;
  }

  @Override
  public long currentTimeMillis() {
    return this.epochMillis;
  }
}
