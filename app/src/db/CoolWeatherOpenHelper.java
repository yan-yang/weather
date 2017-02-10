public class CoolWealtherOpenHelper extends SQLiteOpenHelper{
    Province:
    create table Province(
            id integer primary key autoincrement,
            province_name text,
            province_code text
    )

    public static final String CREATE_PROVINCE = "create table Province(" +
            " id integer primary key autoincrement,"
    + " province_name text,"
    + " province_code text)";
    City:
    create table City(
            id integer primary key autoincrement,
            city_name text,
            city_code text,
            province_id integer)
    public static final String CREATE_City = "create table City(" +
            " id integer primary key autoincrement,"
            + " city_name text,"
            + " city_code text,"
            + "provice_id integer)";
    County:
    create table County(
            id integer primary key autoincrement,
            county_name text,
            county_code text,
            city_id integer)
    public static final String CREATE_COUNTY = "create table County(" +
            " id integer primary key autoincrement,"
            + " county_name text,"
            + " county_code text,"
            + "city_id integer)";
    public CoolWealtherOpenHelper(Context context,String name,CursorFactory
                                   factory,int version){
        super(context,name,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }
public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
{

}

}