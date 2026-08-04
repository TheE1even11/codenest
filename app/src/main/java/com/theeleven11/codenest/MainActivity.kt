package com.theeleven11.codenest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.rosemoe.sora.widget.CodeEditor
import io.github.rosemoe.sora.widget.schemes.EditorColorScheme

class MainActivity : AppCompatActivity() {

    private lateinit var editor: CodeEditor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editor = findViewById(R.id.codeEditor)

        // Başlangıç kodu (örnek)
        editor.setText(
            """
            <!DOCTYPE html>
            <html>
              <body>
                <h1>Merhaba CodeNest!</h1>
              </body>
            </html>
            """.trimIndent()
        )

        // Temel görsel ayarlar
        editor.setTextSize(14f)
        editor.colorScheme = EditorColorScheme()
    }
}
