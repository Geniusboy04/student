package uz.student.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.student.dto.AccountDto;
import uz.student.service.AccountService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/")
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/accounts")
    List<AccountDto> getAccountList(){
        return accountService.getListAccount();
    }

    @DeleteMapping("/account/delete/{id}")
    ResponseEntity<?> remove(@PathVariable("id") Long id){
        accountService.remove(id);
        return ResponseEntity.ok().body("Deleted");
    }

    @PostMapping("/account/edit")
    ResponseEntity<?> save(@RequestBody AccountDto account){
        accountService.edit(account);
        return ResponseEntity.ok().body("Success");
    }

    @GetMapping("/account/{id}")
    AccountDto getId(@PathVariable("id") Long id){
        return accountService.getOne(id);
    }

}
