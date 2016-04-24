package salt.movil.spaceapp2016;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import salt.movil.spaceapp2016.fragments.AfeccionesComplejasFragment;
import salt.movil.spaceapp2016.fragments.MiEstadoFragment;
import salt.movil.spaceapp2016.fragments.MisTrofeosFragment;
import salt.movil.spaceapp2016.fragments.PerfilFragment;
import salt.movil.spaceapp2016.fragments.RutaFragment;

public class MainActivity extends AppCompatActivity implements DrawerLayout.DrawerListener, NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;

    AfeccionesComplejasFragment afeccionesComplejasFragment;
    MiEstadoFragment miEstadoFragment;
    MisTrofeosFragment misTrofeosFragment;
    RutaFragment rutaFragment;
    PerfilFragment perfilFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FindElement();
        loadFragments();

    }

    private void FindElement() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_main);
        navigationView = (NavigationView) findViewById(R.id.navigation_drawer);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open_drawer,R.string.close_drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerLayout.addDrawerListener(this);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void loadFragments(){
        afeccionesComplejasFragment = new AfeccionesComplejasFragment();
        miEstadoFragment = new MiEstadoFragment();
        misTrofeosFragment = new MisTrofeosFragment();
        rutaFragment = new RutaFragment();
        perfilFragment = new PerfilFragment();
        replaceFragment(miEstadoFragment);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.opcion_mi_estado:
                replaceFragment(miEstadoFragment);
                break;
            case R.id.option_ruta:
                replaceFragment(rutaFragment);
                break;
            case R.id.opcion_trofeos:
                replaceFragment(misTrofeosFragment);
                break;
            case R.id.opcion_afecciones:
                replaceFragment(afeccionesComplejasFragment);
                break;
            case R.id.opcion_perfil:
                replaceFragment(perfilFragment);
                break;
            case R.id.opcion_salir:
                Intent intent = new Intent(this,LoginActivity.class);
                startActivity(intent);
                break;
        }
        drawerLayout.closeDrawers();
        return false;
    }

    //region metodo para cambiar fragment principal
    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.continer_drawer,fragment);
        fragmentTransaction.commit();
    }
    //endregion

    //region Drawer y toogle
    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
        toggle.onDrawerSlide(drawerView,slideOffset);
    }

    @Override
    public void onDrawerOpened(View drawerView) {
        toggle.onDrawerOpened(drawerView);
    }

    @Override
    public void onDrawerClosed(View drawerView) {
        toggle.onDrawerClosed(drawerView);
    }

    @Override
    public void onDrawerStateChanged(int newState) {
        toggle.onDrawerStateChanged(newState);
    }

    //Coloca el icono que conrresponde
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    //endregion
}
