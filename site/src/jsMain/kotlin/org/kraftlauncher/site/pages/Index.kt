package org.kraftlauncher.site.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Link("https://github.com/KraftLauncher/kraft-launcher",
            "Kraft Launcher",
        )
        Text(" is in very early development and this website was mainly made to verify this domain." +
                " It will be completely replaced at later point.")
    }
}
