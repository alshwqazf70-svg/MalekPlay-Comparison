# MalekPlay Android v2.0

مشغل وسائط متكامل بتصميم بنفسجي نيوني وتأثير Glassmorphism.

## المميزات

- ✅ تصميم بنفسجي نيوني (#A855F7)
- ✅ تأثير Glassmorphism (زجاجي)
- ✅ دعم AMOLED (أسود حقيقي)
- ✅ خط عربي محسّن
- ✅ LazyVerticalGrid للعرض الشبكي
- ✅ شريط تنقل سفلي زجاجي
- ✅ 10 أيقونات XML مخصصة

## البنية

```
app/src/main/
├── java/com/malekplay/
│   ├── core/ui/theme/
│   │   ├── Color.kt          # الألوان
│   │   ├── Theme.kt          # الثيم
│   │   ├── Type.kt           # الخطوط
│   │   └── Glassmorphism.kt  # تأثير الزجاج
│   ├── ui/components/
│   │   └── BottomNav.kt      # شريط التنقل
│   ├── ui/home/
│   │   └── HomeScreen.kt     # الشاشة الرئيسية
│   ├── ui/library/
│   │   └── LibraryScreen.kt  # المكتبة
│   ├── ui/player/video/
│   │   └── VideoPlayerScreen.kt  # مشغل الفيديو
│   └── ui/settings/
│       └── SettingsScreen.kt # الإعدادات
└── res/
    ├── drawable/             # الأيقونات
    └── values/               # النصوص
```

## التثبيت

1. افتح المشروع في Android Studio
2. انتظر مزامنة Gradle
3. شغّل على جهاز أو محاكي

## ملاحظة

لإضافة خط Cairo الحقيقي:
1. حمّل من: https://fonts.google.com/specimen/Cairo
2. ضع ملفات TTF في `res/font/`
3. حدّث `Type.kt` لاستخدام `Font(R.font.cairo_regular, ...)`
