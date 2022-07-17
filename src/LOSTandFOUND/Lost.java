package LOSTandFOUND;

public class Lost
{
    private String name;
    private String time;
    public Lost() {}

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getTime()
    {
        return time;
    }
    public void setTime(String time)
    {
        this.time = time;
    }
    @Override
    public String toString()
    {
        return "名称:" + name + ",丢失时间:" + time;
    }
}


