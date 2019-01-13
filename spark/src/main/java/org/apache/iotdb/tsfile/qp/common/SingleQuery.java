/**
 * Copyright © 2019 Apache IoTDB(incubating) (dev@iotdb.apache.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.iotdb.tsfile.qp.common;


import java.util.List;

/**
 * This class is constructed with a single getIndex plan. Single getIndex means it could be processed by
 * reading API by one pass directly.<br>
 *
 */
public class SingleQuery {

    private List<FilterOperator> columnFilterOperators;
    private FilterOperator timeFilterOperator;
    private FilterOperator valueFilterOperator;

    public SingleQuery(List<FilterOperator> columnFilterOperators,
                       FilterOperator timeFilter, FilterOperator valueFilter) {
        super();
        this.columnFilterOperators = columnFilterOperators;
        this.timeFilterOperator = timeFilter;
        this.valueFilterOperator = valueFilter;
    }

    public List<FilterOperator> getColumnFilterOperator() {

        return columnFilterOperators;
    }

    public FilterOperator getTimeFilterOperator() {
        return timeFilterOperator;
    }

    public FilterOperator getValueFilterOperator() {
        return valueFilterOperator;
    }

    @Override
    public String toString() {
        return "SingleQuery: \n" + columnFilterOperators + "\n" + timeFilterOperator + "\n" + valueFilterOperator;
    }


}
