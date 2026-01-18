# -----------------------------------------------------------------------------
# App ProGuard rules
#
# Note: This project enables minification for BOTH release and debug builds.
# Retrofit (especially Kotlin suspend support) relies on generic type
# signatures at runtime. Those rules are provided by the core module via
# core/consumer-rules.pro.
# -----------------------------------------------------------------------------

# Keep type signatures & reflection metadata (needed by Retrofit/Gson/Room)
-keepattributes Signature, InnerClasses, EnclosingMethod
-keepattributes RuntimeVisibleAnnotations, RuntimeVisibleParameterAnnotations, AnnotationDefault

# Keep app presentation classes (navigation/view binding safety)
-keep class com.dicoding.moviecatalog.presentation.** { *; }
