public class JavaCoreL1 {
    public static void main(String[] args) {
        Member member_1_1 = new Member("Сергей", 115);
        Member member_1_2 = new Member("Иван", 125);
        Member member_1_3 = new Member("Саня", 135);
        Member member_2_1 = new Member("Рома", 115);
        Member member_2_2 = new Member("Миша", 125);
        Member member_2_3 = new Member("Александр", 135);
        Team team_1 = new Team("Комманда отдела ОГЭ", member_1_1, member_1_2, member_1_3);
        Team team_2 = new Team("Комманда отдела ОЭБЭ", member_2_1, member_2_2, member_2_3);
        Course course1 = new Course(150, 130, 140);

        course1.runCourse(team_1);
        System.out.println("\n" + team_1.teamName + ": ");
        team_1.teamInfo();
        System.out.println("\nЧлены " + team_1.teamName + ", которые смогли завершить пробег дистанции ");
        team_1.teamInfoMembersFinished();

        course1.runCourse(team_2);
        System.out.println("\n" + team_2.teamName + ": ");
        team_2.teamInfo();
        System.out.println("\nЧлены " + team_2.teamName + ", которые смогли завершить пробег дистанции ");
        team_2.teamInfoMembersFinished();
    }
}