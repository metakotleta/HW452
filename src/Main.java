public class Main {


    public static void main(String[] args) {
        CandidateList list = new CandidateList();

        list.addInList(new Candidate("Иванов Петр Петрович", 5, 1));
        list.addInList(new Candidate("Иванов Иван Иванович", 3, 2));
        list.addInList(new Candidate("Иванов Николай Николаевич", 1, 5));
        list.addInList(new Candidate("Иванов Алексей Алексеевич", 3, 4));
        list.addInList(new Candidate("Иванов Прохор Прохорович", 2, 5));
        list.addInList(new Candidate("Иванов Антон Анотонович", 4, 1));
        list.addInList(new Candidate("Иванов Григорий Григорьевич", 4, 2));
        list.addInList(new Candidate("Иванов Максим Максимович", 3, 1));
        list.addInList(new Candidate("Иванов Михаил Михайлович", 1, 1));
        list.addInList(new Candidate("Иванов Адиль Мухаммад оглы", 5, 5));
        list.addInList(new Candidate("Иванов Олег Олегович", 5, 4));
        list.addInList(new Candidate("Иванов Дмитрий Дмитриевич", 5, 3));

        System.out.println(list);
    }
}
