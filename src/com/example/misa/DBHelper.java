package com.example.misa;



/* import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBAdapter
{
	public static final String KEY_ROWID = "_id";
	public static final String KEY_WORD = "word";
	public static final String KEY_LEVEL = "level";
	
	private static final String TAG = "DBAdapter";
	private static final String DATABASE_NAME = "read";
	private static final String DATABASE_TABLE = "words";
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_CREATE =
			"create table words (_id integer primary key autoincrement, "
			+ "word text not null, level integer not null;";
	private final Context context; 
	private DatabaseHelper DBHelper;
	private SQLiteDatabase db;
	public DBAdapter(Context ctx)
	{
		this.context = ctx;
		DBHelper = new DatabaseHelper(context);
	}
	
	private static class DatabaseHelper extends SQLiteOpenHelper
	{
		DatabaseHelper(Context context)
		{
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db)
		{
			db.execSQL(DATABASE_CREATE);
		}
		
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
		{
			Log.w(TAG, "Upgrading database from version " + oldVersion
					+ " to "
					+ newVersion + ", which will destroy all old data");
			db.execSQL("DROP TABLE IF EXISTS words");
				onCreate(db);
		}
	}
	
	//---打开并初始化数据库---
	public DBAdapter open() throws SQLException
	{
		db = DBHelper.getWritableDatabase();
		 File file = new File("D:\\words");  
		FileInputStream fis = null;  
		try
		{
			fis = new FileInputStream(file); 
			InputStreamReader input = new InputStreamReader(fis);  
			BufferedReader br = new BufferedReader(input);  
			String line = null;
			String sql = null;
			String info[] = null;
			String path = file.getAbsolutePath();//得到选择文件的全路径
		} catch(FileNotFoundException e) {
			
		} 
		return this;
	}
	
	//---关闭数据库---
	public void close()
	{
		DBHelper.close();
	}
	
	// 向数据库中插入数据
	public long insert(String word, int level)
	{
		ContentValues initialValues = new ContentValues();
	
		initialValues.put(KEY_WORD, word);
		initialValues.put(KEY_LEVEL, level);
		
		return db.insert(DATABASE_TABLE, null, initialValues);
	}
	
	// 检索
	public Cursor getWords(int level) throws SQLException
	{
		Cursor mCursor = db.query(true, DATABASE_TABLE, new String[] {
				KEY_WORD,
				},
		KEY_LEVEL + "=" + level,
		null,
		null,
		null,
		null,
		null);
		if (mCursor != null) {
			mCursor.moveToFirst();
		}
		return mCursor;
	}
} */