   if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.AppTheme);

        }


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences= PreferenceManager.getDefaultSharedPreferences(this);
        boolean isDark = preferences.getBoolean("example_switch", false);

if(isDark){
    
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    recreate();
}else{

    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
recreate();

}
     
