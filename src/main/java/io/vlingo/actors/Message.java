// Copyright © 2012-2018 Vaughn Vernon. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.actors;

import java.util.function.Consumer;

public interface Message {
  Actor actor();
  void deliver();
  Class<?> protocol();
  String representation();
  boolean isStowed();
  void set(final Actor actor, final Class<?> protocol, final Consumer<?> consumer, final Returns<?> returns, final String representation);
}
