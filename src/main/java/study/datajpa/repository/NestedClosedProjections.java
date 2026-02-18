package study.datajpa.repository;

public interface NestedClosedProjections {

    String getUsername(); // root 엔티티 O - 최적화 O
    TeamInfo getTeam(); // root 엔티티 X - 최적화 X

    interface TeamInfo {
        String getName();
    }
}
