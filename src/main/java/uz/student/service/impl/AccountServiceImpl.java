package uz.student.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.student.dto.AccountDto;
import uz.student.enums.Status;
import uz.student.model.AccountEntity;
import uz.student.model.StudentEntity;
import uz.student.repository.AccountRepository;
import uz.student.service.AccountService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    @Transactional(readOnly = true)
    public List<AccountDto> getListAccount() {
        List<AccountEntity> account = accountRepository.findAll();
        return account.stream().map(AccountEntity::asDto).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void remove(Long id) {
       accountRepository.deleteById(id);
    }

    @Override
    public void edit(AccountDto account) {
        AccountEntity accountEntity;
        if(account.getId() == null){
            accountEntity = new AccountEntity();
        }else {
            accountEntity = accountRepository.getById(account.getId());
        }
        accountEntity.setName(account.getName());
        accountEntity.setEmail(account.getEmail());
        accountEntity.setPassword(account.getPassword());
        accountEntity.setPhoneNumber(account.getPhoneNumber());
        accountRepository.save(accountEntity);
    }

    @Override
    public AccountDto getOne(Long id) {
        AccountEntity account = accountRepository.getById(id);
        return account.asDto();
    }
}
