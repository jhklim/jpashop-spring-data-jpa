package study.datajpa.dto;

import lombok.Getter;
import study.datajpa.entity.Member;

@Getter
public class MemberDto {

    private final Long id;
    private final String username;
    private final String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }

    public MemberDto(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
        this.teamName = member.getTeam() != null ? member.getTeam().getName() : null;
    }
}
