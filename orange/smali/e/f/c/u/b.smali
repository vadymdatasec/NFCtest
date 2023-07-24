.class public abstract Le/f/c/u/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    long-to-int v2, v1

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Le/f/c/u/b;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static a()I
    .locals 1

    .line 95
    sget-object v0, Le/f/c/u/b;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/pm/PackageManager;Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I
    .locals 3

    .line 48
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "FirebaseMessaging"

    if-nez v0, :cond_2

    const-string v0, "drawable"

    .line 49
    invoke-virtual {p1, p3, v0, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    invoke-static {p1, v0}, Le/f/c/u/b;->a(Landroid/content/res/Resources;I)Z

    move-result v2

    if-eqz v2, :cond_0

    return v0

    :cond_0
    const-string v0, "mipmap"

    .line 51
    invoke-virtual {p1, p3, v0, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    invoke-static {p1, v0}, Le/f/c/u/b;->a(Landroid/content/res/Resources;I)Z

    move-result v2

    if-eqz v2, :cond_1

    return v0

    .line 53
    :cond_1
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Icon resource "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " not found. Notification will use default icon."

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    const/4 p3, 0x0

    const-string v0, "com.google.firebase.messaging.default_notification_icon"

    .line 54
    invoke-virtual {p4, v0, p3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p4

    if-eqz p4, :cond_3

    .line 55
    invoke-static {p1, p4}, Le/f/c/u/b;->a(Landroid/content/res/Resources;I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 56
    :cond_3
    :try_start_0
    invoke-virtual {p0, p2, p3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget p4, p0, Landroid/content/pm/ApplicationInfo;->icon:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 57
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, 0x23

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "Couldn\'t get own application info: "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_0
    if-eqz p4, :cond_5

    .line 58
    invoke-static {p1, p4}, Le/f/c/u/b;->a(Landroid/content/res/Resources;I)Z

    move-result p0

    if-nez p0, :cond_6

    :cond_5
    const p4, 0x1080093

    :cond_6
    return p4
.end method

.method public static a(Le/f/c/u/a0;)I
    .locals 2

    const-string v0, "gcm.n.default_sound"

    .line 40
    invoke-virtual {p0, v0}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "gcm.n.default_vibrate_timings"

    .line 41
    invoke-virtual {p0, v1}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x2

    :cond_1
    const-string v1, "gcm.n.default_light_settings"

    .line 42
    invoke-virtual {p0, v1}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    or-int/lit8 v0, v0, 0x4

    :cond_2
    return v0
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;
    .locals 4

    .line 104
    invoke-static {}, Le/f/c/u/b;->a()I

    move-result v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.firebase.MESSAGING_EVENT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v2, Landroid/content/ComponentName;

    const-string v3, "com.google.firebase.iid.FirebaseInstanceIdReceiver"

    invoke-direct {v2, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 105
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "wrapped_intent"

    .line 106
    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const/high16 v1, 0x40000000    # 2.0f

    .line 107
    invoke-static {p0, v0, p1, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Le/f/c/u/a0;)Landroid/app/PendingIntent;
    .locals 2

    .line 100
    invoke-static {p1}, Le/f/c/u/b;->c(Le/f/c/u/a0;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 101
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.firebase.messaging.NOTIFICATION_DISMISS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p1}, Le/f/c/u/a0;->i()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    .line 103
    invoke-static {p0, p1}, Le/f/c/u/b;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Le/f/c/u/a0;Landroid/app/PendingIntent;)Landroid/app/PendingIntent;
    .locals 2

    .line 96
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.firebase.messaging.NOTIFICATION_OPEN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 97
    invoke-virtual {p1}, Le/f/c/u/a0;->i()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "pending_intent"

    .line 98
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    .line 99
    invoke-static {p0, p1}, Le/f/c/u/b;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Le/f/c/u/a0;Ljava/lang/String;Landroid/content/pm/PackageManager;)Landroid/app/PendingIntent;
    .locals 1

    .line 72
    invoke-static {p2, p1, p3}, Le/f/c/u/b;->a(Ljava/lang/String;Le/f/c/u/a0;Landroid/content/pm/PackageManager;)Landroid/content/Intent;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/high16 p3, 0x4000000

    .line 73
    invoke-virtual {p2, p3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 74
    invoke-virtual {p1}, Le/f/c/u/a0;->j()Landroid/os/Bundle;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 75
    invoke-static {}, Le/f/c/u/b;->a()I

    move-result p3

    const/high16 v0, 0x40000000    # 2.0f

    .line 76
    invoke-static {p0, p3, p2, v0}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p2

    .line 77
    invoke-static {p1}, Le/f/c/u/b;->c(Le/f/c/u/a0;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 78
    invoke-static {p0, p1, p2}, Le/f/c/u/b;->a(Landroid/content/Context;Le/f/c/u/a0;Landroid/app/PendingIntent;)Landroid/app/PendingIntent;

    move-result-object p2

    :cond_1
    return-object p2
.end method

.method public static a(Ljava/lang/String;Le/f/c/u/a0;Landroid/content/pm/PackageManager;)Landroid/content/Intent;
    .locals 2

    const-string v0, "gcm.n.click_action"

    .line 79
    invoke-virtual {p1, v0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 81
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 82
    invoke-virtual {p1, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p0, 0x10000000

    .line 83
    invoke-virtual {p1, p0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    return-object p1

    .line 84
    :cond_0
    invoke-virtual {p1}, Le/f/c/u/a0;->b()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 85
    new-instance p2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p2, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    invoke-virtual {p2, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    return-object p2

    .line 88
    :cond_1
    invoke-virtual {p2, p0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    if-nez p0, :cond_2

    const-string p1, "FirebaseMessaging"

    const-string p2, "No activity found to launch app"

    .line 89
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-object p0
.end method

.method public static a(Ljava/lang/String;Le/f/c/u/a0;Landroid/content/res/Resources;)Landroid/net/Uri;
    .locals 1

    .line 66
    invoke-virtual {p1}, Le/f/c/u/a0;->f()Ljava/lang/String;

    move-result-object p1

    .line 67
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "default"

    .line 68
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "raw"

    .line 69
    invoke-virtual {p2, p1, v0, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    if-eqz p2, :cond_1

    .line 70
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, 0x18

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p2, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "android.resource://"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/raw/"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x2

    .line 71
    invoke-static {p0}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    const/16 v0, 0x80

    .line 90
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 91
    iget-object p1, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    .line 92
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 93
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, 0x23

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p1, "Couldn\'t get own application info: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "FirebaseMessaging"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    :cond_0
    sget-object p0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    return-object p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Le/f/c/u/a0;Ljava/lang/String;Landroid/content/res/Resources;Landroid/content/pm/PackageManager;Landroid/os/Bundle;)Le/f/c/u/a;
    .locals 2

    .line 1
    new-instance v0, Lc/h/e/c0$a;

    invoke-direct {v0, p0, p3}, Lc/h/e/c0$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const-string p3, "gcm.n.title"

    .line 2
    invoke-virtual {p2, p4, p1, p3}, Le/f/c/u/a0;->b(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 3
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-virtual {v0, p3}, Lc/h/e/c0$a;->b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    :cond_0
    const-string p3, "gcm.n.body"

    .line 5
    invoke-virtual {p2, p4, p1, p3}, Le/f/c/u/a0;->b(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 6
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {v0, p3}, Lc/h/e/c0$a;->a(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    .line 8
    new-instance v1, Lc/h/e/y;

    invoke-direct {v1}, Lc/h/e/y;-><init>()V

    invoke-virtual {v1, p3}, Lc/h/e/y;->a(Ljava/lang/CharSequence;)Lc/h/e/y;

    invoke-virtual {v0, v1}, Lc/h/e/c0$a;->a(Lc/h/e/d0;)Lc/h/e/c0$a;

    :cond_1
    const-string p3, "gcm.n.icon"

    .line 9
    invoke-virtual {p2, p3}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 10
    invoke-static {p5, p4, p1, p3, p6}, Le/f/c/u/b;->a(Landroid/content/pm/PackageManager;Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    move-result p3

    .line 11
    invoke-virtual {v0, p3}, Lc/h/e/c0$a;->e(I)Lc/h/e/c0$a;

    .line 12
    invoke-static {p1, p2, p4}, Le/f/c/u/b;->a(Ljava/lang/String;Le/f/c/u/a0;Landroid/content/res/Resources;)Landroid/net/Uri;

    move-result-object p3

    if-eqz p3, :cond_2

    .line 13
    invoke-virtual {v0, p3}, Lc/h/e/c0$a;->a(Landroid/net/Uri;)Lc/h/e/c0$a;

    .line 14
    :cond_2
    invoke-static {p0, p2, p1, p5}, Le/f/c/u/b;->a(Landroid/content/Context;Le/f/c/u/a0;Ljava/lang/String;Landroid/content/pm/PackageManager;)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc/h/e/c0$a;->a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;

    .line 15
    invoke-static {p0, p2}, Le/f/c/u/b;->a(Landroid/content/Context;Le/f/c/u/a0;)Landroid/app/PendingIntent;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 16
    invoke-virtual {v0, p1}, Lc/h/e/c0$a;->b(Landroid/app/PendingIntent;)Lc/h/e/c0$a;

    :cond_3
    const-string p1, "gcm.n.color"

    .line 17
    invoke-virtual {p2, p1}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, p6}, Le/f/c/u/b;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 18
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Lc/h/e/c0$a;->a(I)Lc/h/e/c0$a;

    :cond_4
    const-string p0, "gcm.n.sticky"

    .line 19
    invoke-virtual {p2, p0}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z

    move-result p0

    const/4 p1, 0x1

    xor-int/2addr p0, p1

    .line 20
    invoke-virtual {v0, p0}, Lc/h/e/c0$a;->a(Z)Lc/h/e/c0$a;

    const-string p0, "gcm.n.local_only"

    .line 21
    invoke-virtual {p2, p0}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z

    move-result p0

    .line 22
    invoke-virtual {v0, p0}, Lc/h/e/c0$a;->c(Z)Lc/h/e/c0$a;

    const-string p0, "gcm.n.ticker"

    .line 23
    invoke-virtual {p2, p0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 24
    invoke-virtual {v0, p0}, Lc/h/e/c0$a;->c(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    .line 25
    :cond_5
    invoke-virtual {p2}, Le/f/c/u/a0;->e()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 26
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Lc/h/e/c0$a;->d(I)Lc/h/e/c0$a;

    .line 27
    :cond_6
    invoke-virtual {p2}, Le/f/c/u/a0;->h()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_7

    .line 28
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Lc/h/e/c0$a;->f(I)Lc/h/e/c0$a;

    .line 29
    :cond_7
    invoke-virtual {p2}, Le/f/c/u/a0;->d()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_8

    .line 30
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Lc/h/e/c0$a;->c(I)Lc/h/e/c0$a;

    :cond_8
    const-string p0, "gcm.n.event_time"

    .line 31
    invoke-virtual {p2, p0}, Le/f/c/u/a0;->f(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p0

    if-eqz p0, :cond_9

    .line 32
    invoke-virtual {v0, p1}, Lc/h/e/c0$a;->d(Z)Lc/h/e/c0$a;

    .line 33
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    invoke-virtual {v0, p3, p4}, Lc/h/e/c0$a;->b(J)Lc/h/e/c0$a;

    .line 34
    :cond_9
    invoke-virtual {p2}, Le/f/c/u/a0;->g()[J

    move-result-object p0

    if-eqz p0, :cond_a

    .line 35
    invoke-virtual {v0, p0}, Lc/h/e/c0$a;->a([J)Lc/h/e/c0$a;

    .line 36
    :cond_a
    invoke-virtual {p2}, Le/f/c/u/a0;->a()[I

    move-result-object p0

    const/4 p3, 0x0

    if-eqz p0, :cond_b

    .line 37
    aget p4, p0, p3

    aget p1, p0, p1

    const/4 p5, 0x2

    aget p0, p0, p5

    invoke-virtual {v0, p4, p1, p0}, Lc/h/e/c0$a;->a(III)Lc/h/e/c0$a;

    .line 38
    :cond_b
    invoke-static {p2}, Le/f/c/u/b;->a(Le/f/c/u/a0;)I

    move-result p0

    invoke-virtual {v0, p0}, Lc/h/e/c0$a;->b(I)Lc/h/e/c0$a;

    .line 39
    new-instance p0, Le/f/c/u/a;

    invoke-static {p2}, Le/f/c/u/b;->b(Le/f/c/u/a0;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1, p3}, Le/f/c/u/a;-><init>(Lc/h/e/c0$a;Ljava/lang/String;I)V

    return-object p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Integer;
    .locals 4

    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    return-object v1

    .line 60
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v2, "FirebaseMessaging"

    if-nez v0, :cond_1

    .line 61
    :try_start_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 62
    :catch_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x38

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Color is invalid: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Notification will use default color."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 p1, 0x0

    const-string v0, "com.google.firebase.messaging.default_notification_color"

    .line 63
    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-eqz p1, :cond_2

    .line 64
    :try_start_1
    invoke-static {p0, p1}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    const-string p0, "Cannot find the color resource referenced in AndroidManifest."

    .line 65
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-object v1
.end method

.method public static a(Landroid/content/res/Resources;I)Z
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    const-string v0, "FirebaseMessaging"

    .line 43
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x1

    const/16 v3, 0x1a

    if-eq v1, v3, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 44
    :try_start_0
    invoke-virtual {p0, p1, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 45
    instance-of p0, p0, Landroid/graphics/drawable/AdaptiveIconDrawable;

    if-eqz p0, :cond_1

    const/16 p0, 0x4d

    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p0, "Adaptive icons cannot be used in notifications. Ignoring icon id: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :cond_1
    return v2

    :catch_0
    const/16 p0, 0x42

    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p0, "Couldn\'t find resource "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", treating it as an invalid icon"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v3
.end method

.method public static b(Landroid/content/Context;Le/f/c/u/a0;)Le/f/c/u/a;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Le/f/c/u/b;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v8

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-virtual {p1}, Le/f/c/u/a0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v8}, Le/f/c/u/b;->b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v5

    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    move-object v2, p0

    move-object v4, p1

    .line 6
    invoke-static/range {v2 .. v8}, Le/f/c/u/b;->a(Landroid/content/Context;Ljava/lang/String;Le/f/c/u/a0;Ljava/lang/String;Landroid/content/res/Resources;Landroid/content/pm/PackageManager;Landroid/os/Bundle;)Le/f/c/u/a;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return-object v2

    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-ge v0, v1, :cond_1

    return-object v2

    .line 10
    :cond_1
    const-class v0, Landroid/app/NotificationManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "FirebaseMessaging"

    if-nez v1, :cond_3

    .line 12
    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v1

    if-eqz v1, :cond_2

    return-object p1

    .line 13
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x7a

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Notification Channel requested ("

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") has not been created by the app. Manifest configuration, or default, value will be used."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    const-string p1, "com.google.firebase.messaging.default_notification_channel_id"

    .line 14
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 16
    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p2

    if-eqz p2, :cond_4

    return-object p1

    :cond_4
    const-string p1, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."

    .line 17
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_5
    const-string p1, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."

    .line 18
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const-string p1, "fcm_fallback_notification_channel"

    .line 19
    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p2

    if-nez p2, :cond_6

    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "fcm_fallback_notification_channel_label"

    const-string v3, "string"

    .line 22
    invoke-virtual {p2, v2, v3, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    .line 23
    new-instance v1, Landroid/app/NotificationChannel;

    .line 24
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 p2, 0x3

    invoke-direct {v1, p1, p0, p2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 25
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_6
    return-object p1

    :catch_0
    return-object v2
.end method

.method public static b(Le/f/c/u/a0;)Ljava/lang/String;
    .locals 3

    const-string v0, "gcm.n.tag"

    .line 26
    invoke-virtual {p0, v0}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 27
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 28
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const/16 p0, 0x25

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p0, "FCM-Notification:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Le/f/c/u/a0;)Z
    .locals 1

    const-string v0, "google.c.a.e"

    .line 1
    invoke-virtual {p0, v0}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method
