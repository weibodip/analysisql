package com.weibo.dip.analysisql.dsl.filter.relational;

import com.weibo.dip.analysisql.dsl.filter.Filter;

/** @author yurun */
public class NeLongRelationalFilter extends LongRelationalFilter {
  public NeLongRelationalFilter() {}

  public NeLongRelationalFilter(String name, long value) {
    super(Filter.NE, name, value);
  }
}
