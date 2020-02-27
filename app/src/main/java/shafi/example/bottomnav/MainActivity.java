package shafi.example.bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottombar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.home:
                        bottomNavigationView.setItemBackgroundResource(R.color.home);
                        break;

                    case R.id.cart:
                        bottomNavigationView.setItemBackgroundResource(R.color.cart);
                        break;

                    case R.id.contact:
                        bottomNavigationView.setItemBackgroundResource(R.color.contact);
                        break;

                        default:
                            return false;
                }

                return false;
            }
        });
    }
}
