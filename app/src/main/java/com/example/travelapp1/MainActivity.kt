package com.example.travelapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelapp1.ui.theme.TravelApp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelApp1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Eğer kullanıcı giriş yapmamışsa LoginScreen'ı göster
                    if (!isUserLoggedIn()) {
                        LoginScreen()
                    } else {
                        // Kullanıcı giriş yaptıysa ana ekranı göster
                        Greeting("Android")
                    }
                }
            }
        }
    }

    private fun isUserLoggedIn(): Boolean {
        // Kullanıcı girişi durumunu kontrol et
        // Bu metodu uygulamanızın gereksinimlerine göre uyarlayabilirsiniz
        return true // Örneğin şu an her zaman true döndürüyoruz
    }
}

@Composable
fun LoginScreen() {
    // Burada kullanıcı girişi ekranını oluşturabilirsiniz
    // Örneğin, kullanıcı adı ve şifre girişi, giriş düğmesi vb.
    Text("Login Screen")
}

@Composable
fun Greeting(name: String) {
    // First screen olmalidi
    Text("Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TravelApp1Theme {
        Greeting("Android")
    }
}
