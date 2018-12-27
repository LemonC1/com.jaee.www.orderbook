package com.jaee.www.college.service;

import java.util.List;

import com.jaee.www.entity.Spec;
import com.jaee.www.entity.custom.DeptAndSpec;

/**
 * Created by c0de8ug on 16-2-11.
 */
public interface SpecBiz {

    public void update(String specName, String newSpecName);

    public void add(Spec spec);

    public void delete(String specName);

    public List<DeptAndSpec> findDeptAndSpec();

    public List<String> findDpet();
}
