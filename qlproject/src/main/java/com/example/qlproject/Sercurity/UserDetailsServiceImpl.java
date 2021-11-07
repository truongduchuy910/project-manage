package com.example.qlproject.Sercurity;

import com.example.qlproject.model.Account;
import com.example.qlproject.reporitory.AccountRepository;
import com.example.qlproject.reporitory.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    public AccountRepository accountRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = this.accountRepository.findAllByAccountName(username);
        if(account == null)
        {
            System.out.println("không tồn tại tài khoản " + username);
            throw  new  UsernameNotFoundException("user" + username +"không tìm thấy trong csdl");
        }

        return new MyUserDetails(account);
    }
}
