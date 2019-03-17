/*
 * Copyright 2005-2019 Dozer Project
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
package com.github.dozermapper.core.vo.map;

import java.util.Map;

import com.github.dozermapper.core.vo.BaseTestObject;

public class MapToMapPrime extends BaseTestObject {

    private Map standardMap;
    private Map standardMapWithHint;

    public Map getStandardMap() {
        return standardMap;
    }

    public void setStandardMap(Map standardMap) {
        this.standardMap = standardMap;
    }

    public Map getStandardMapWithHint() {
        return standardMapWithHint;
    }
}
