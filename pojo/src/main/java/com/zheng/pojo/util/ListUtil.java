package com.zheng.pojo.util;

import com.zheng.pojo.d.Module;
import com.zheng.pojo.d.ModuleDetails;
import lombok.Data;

import java.util.List;

@Data
public class ListUtil {
    private Module module;
    private List<ModuleDetails> moduleDetailsList;
}
