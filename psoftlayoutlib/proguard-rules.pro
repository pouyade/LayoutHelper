# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
-keep class ir.psoft.psoftlayoutlib.helper.AndroidUtilities**
-keepclassmembers class ir.psoft.psoftlayoutlib.helper.AndroidUtilities** {*;}
-keep class ir.psoft.psoftlayoutlib.helper.LayoutHelper**
-keepclassmembers class ir.psoft.psoftlayoutlib.helper.LayoutHelper** {*;}
-keep class ir.psoft.psoftlayoutlib.helper.SpacesItemDecoration**
-keepclassmembers class ir.psoft.psoftlayoutlib.helper.SpacesItemDecoration** {*;}
-keep class ir.psoft.psoftlayoutlib.helper.ScreenHelper**
-keepclassmembers class ir.psoft.psoftlayoutlib.helper.ScreenHelper** {*;}
-keep class ir.psoft.psoftlayoutlib.helper.ColorUtilies**
-keepclassmembers class ir.psoft.psoftlayoutlib.helper.ColorUtilies** {*;}
-keep class ir.psoft.psoftlayoutlib.helper.FileHelper**
-keepclassmembers class ir.psoft.psoftlayoutlib.helper.FileHelper** {*;}
-keep class ir.psoft.psoftlayoutlib.LayoutLibLoader**
-keepclassmembers class ir.psoft.psoftlayoutlib.LayoutLibLoader** {*;}
