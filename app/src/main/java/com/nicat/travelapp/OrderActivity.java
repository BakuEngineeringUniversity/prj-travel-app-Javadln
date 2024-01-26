import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    private EditText editTextCardNumber;
    private EditText editTextExpiryDate;
    private EditText editTextCVV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Kullanıcı arayüzünü başlat
        initUI();
    }

    private void initUI() {
        // Kullanıcı arayüzündeki bileşenleri tanımla
        editTextCardNumber = findViewById(R.);
        editTextExpiryDate = findViewById(R.id.editTextExpiryDate);
        editTextCVV = findViewById(R.id.editTextCVV);

        Button buttonPlaceOrder = findViewById(R.id.buttonPlaceOrder);
        buttonPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Siparişi tamamla butonuna tıklama işlemi
                placeOrder();
            }
        });
    }

    private void placeOrder() {
        // Kullanıcının girdiği kart bilgilerini al
        String cardNumber = editTextCardNumber.getText().toString().trim();
        String expiryDate = editTextExpiryDate.getText().toString().trim();
        String cvv = editTextCVV.getText().toString().trim();

        // Burada alınan bilgileri bir sonraki adıma göndererek siparişi tamamlayabilirsiniz
        // Örneğin, bir API çağrısı yaparak siparişi sunucuya gönderebilirsiniz

        // Örnek: Sipariş bilgilerini bir Toast mesajı olarak göster
        String message = "Order Placed!\nCard Number: " + cardNumber + "\nExpiry Date: " + expiryDate + "\nCVV: " + cvv;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        // Siparişi tamamladıktan sonra isteğe bağlı olarak kullanıcıyı ana ekrana veya başka bir ekrana yönlendirebilirsiniz
        // Örneğin:
        // Intent intent = new Intent(OrderActivity.this, MainActivity.class);
        // startActivity(intent);
        // finish();
    }
}
