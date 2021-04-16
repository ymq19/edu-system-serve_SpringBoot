package edu.system.serve.service.manager;

import java.util.Map;

public interface ManagerUserService {
    Map<String, Object> queryUser(String username, String password);
    Map<String, Object> updatePassword(String username, String passwordSet);
}
