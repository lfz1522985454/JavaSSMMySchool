package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.entity.Authority;
import com.bdqn.tcmp.mapper.AuthorityMapper;
import com.bdqn.tcmp.service.AuthorityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService {
    @Resource
    private AuthorityMapper authorityMapper;
    public int insertAuthority(Authority entity) {
        return this.authorityMapper.insertAuthority(entity);
    }

    public Authority selectAuthorityByID(int id) {
        return this.authorityMapper.selectAuthorityByID(id);
    }

    public int updateAuthority(Authority entity) {
        return this.authorityMapper.updateAuthority(entity);
    }

    public int updateAuthorityEnabledByID(int id, int value) {
        return this.authorityMapper.updateAuthorityEnabledByID(id,value);
    }

    public int deleteAuthority(int id) {
        return this.authorityMapper.deleteAuthority(id);
    }

    public List<Authority> selectAuthorityAll( Integer parentId) {
        return this.authorityMapper.selectAuthorityAll(parentId);
    }

    public List<Authority> selectAuthorityCatalog() {
        return this.authorityMapper.selectAuthorityCatalog();
    }

}
