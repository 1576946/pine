package com.pine.service;

import com.pine.bean.dto.SpecificationDO;

public interface SpecificationService {
    SpecificationDO querySpecificationByCategoryId(Long id);
}
