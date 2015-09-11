package com.customer.model;

import java.util.*;

public interface CustomerDAO {
	  public abstract CustomerVO insert(CustomerVO customerVO);
      public abstract CustomerVO update( String name,String lineID,String fb,String address,String email,String note );
      public abstract boolean delete(String phone);
      public abstract CustomerVO selectOne(String phone);
      public abstract List<CustomerVO> select();

}
