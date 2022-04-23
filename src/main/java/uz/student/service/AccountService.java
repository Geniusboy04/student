package uz.student.service;

import org.springframework.stereotype.Service;
import uz.student.dto.AccountDto;

import java.util.List;

@Service
public interface AccountService {

    List<AccountDto> getListAccount();

    void remove(Long id);

    void edit(AccountDto account);

    AccountDto getOne(Long id);

}
