/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.tika.eval.app.io;


import java.io.IOException;
import java.util.Map;

import org.apache.tika.eval.app.db.Cols;
import org.apache.tika.eval.app.db.TableInfo;

public interface IDBWriter {
    public void writeRow(TableInfo table, Map<Cols, String> data) throws IOException;

    public void close() throws IOException;

    public int getMimeId(String mimeString);
}
