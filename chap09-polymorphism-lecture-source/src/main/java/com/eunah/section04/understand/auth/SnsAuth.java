package main.java.com.eunah.section04.understand.auth;

import main.java.com.eunah.section04.understand.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO memberDTO);
}
