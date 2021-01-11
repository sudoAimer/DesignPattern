package sy3_5;
        import java.util.ArrayList;

class Memento {
    private ArrayList list;
    private int index;

    public Memento() {
        list = new ArrayList();
        index = 0;
    }

    public void save(UserInfoDTO user)
    {
        UserInfoDTO u = new UserInfoDTO(user.getAccount(), user.getPassword(),user.getTelNo());
        list.add(u);
        index++;
    }

    public UserInfoDTO undo()
    {
        list.remove(index - 1);
        index--;
        return (UserInfoDTO) list.get(index - 1);
    }
}
