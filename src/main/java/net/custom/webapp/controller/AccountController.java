/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.custom.webapp.controller;

import net.custom.webapp.model.*;
import net.custom.webapp.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ap1/v1/account")
public class AccountController
{

    private final AccountService accountService;

    public AccountController(AccountService accountService)
    {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAccounts()
    {
        return accountService.getAccounts();
    }

    @GetMapping("/{id}")
    public AccountSavingReturn getAccount(@PathVariable String id)
    {
        AccountSavingReturn aReturn = accountService.getAccount(id);
        return aReturn == null ?
                new AccountSavingReturn(new AccountEntity(new Account()), new TransactionReturn("401",
                        "Customer not found"))
                : aReturn;
    }

    @PostMapping
    public AccountReturn getAccounts(@RequestBody Account account)
    {
        return accountService.saveAccount(account);
    }

}
