.class public Le/f/a/b/c/e;
.super Le/f/a/b/c/f;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/Object;

.field public static final d:Le/f/a/b/c/e;


# instance fields
.field public b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le/f/a/b/c/e;->c:Ljava/lang/Object;

    .line 2
    new-instance v0, Le/f/a/b/c/e;

    invoke-direct {v0}, Le/f/a/b/c/e;-><init>()V

    sput-object v0, Le/f/a/b/c/e;->d:Le/f/a/b/c/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/a/b/c/f;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;ILe/f/a/b/c/m/d;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 19
    :cond_0
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x1010309

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Theme.Dialog.Alert"

    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 23
    new-instance v0, Landroid/app/AlertDialog$Builder;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    :cond_1
    if-nez v0, :cond_2

    .line 24
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 25
    :cond_2
    invoke-static {p0, p1}, Le/f/a/b/c/m/c;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    if-eqz p3, :cond_3

    .line 26
    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 27
    :cond_3
    invoke-static {p0, p1}, Le/f/a/b/c/m/c;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_4

    .line 28
    invoke-virtual {v0, p3, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 29
    :cond_4
    invoke-static {p0, p1}, Le/f/a/b/c/m/c;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 30
    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 31
    :cond_5
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/app/Activity;Landroid/app/Dialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 1

    .line 32
    instance-of v0, p0, Lc/l/d/f0;

    if-eqz v0, :cond_0

    .line 33
    check-cast p0, Lc/l/d/f0;

    .line 34
    invoke-virtual {p0}, Lc/l/d/f0;->j()Lc/l/d/o1;

    move-result-object p0

    .line 35
    invoke-static {p1, p3}, Le/f/a/b/c/k;->a(Landroid/app/Dialog;Landroid/content/DialogInterface$OnCancelListener;)Le/f/a/b/c/k;

    move-result-object p1

    .line 36
    invoke-virtual {p1, p0, p2}, Le/f/a/b/c/k;->a(Lc/l/d/o1;Ljava/lang/String;)V

    return-void

    .line 37
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    .line 38
    invoke-static {p1, p3}, Le/f/a/b/c/b;->a(Landroid/app/Dialog;Landroid/content/DialogInterface$OnCancelListener;)Le/f/a/b/c/b;

    move-result-object p1

    .line 39
    invoke-virtual {p1, p0, p2}, Le/f/a/b/c/b;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method public static b()Le/f/a/b/c/e;
    .locals 1

    .line 1
    sget-object v0, Le/f/a/b/c/e;->d:Le/f/a/b/c/e;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)I
    .locals 0

    .line 11
    invoke-super {p0, p1}, Le/f/a/b/c/f;->a(Landroid/content/Context;)I

    move-result p1

    return p1
.end method

.method public a(Landroid/content/Context;I)I
    .locals 0

    .line 12
    invoke-super {p0, p1, p2}, Le/f/a/b/c/f;->a(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method public a(Landroid/app/Activity;IILandroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;
    .locals 1

    const-string v0, "d"

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Le/f/a/b/c/e;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 2
    invoke-static {p1, v0, p3}, Le/f/a/b/c/m/d;->a(Landroid/app/Activity;Landroid/content/Intent;I)Le/f/a/b/c/m/d;

    move-result-object p3

    .line 3
    invoke-static {p1, p2, p3, p4}, Le/f/a/b/c/e;->a(Landroid/content/Context;ILe/f/a/b/c/m/d;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;II)Landroid/app/PendingIntent;
    .locals 0

    .line 14
    invoke-super {p0, p1, p2, p3}, Le/f/a/b/c/f;->a(Landroid/content/Context;II)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;Le/f/a/b/c/a;)Landroid/app/PendingIntent;
    .locals 1

    .line 15
    invoke-virtual {p2}, Le/f/a/b/c/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    invoke-virtual {p2}, Le/f/a/b/c/a;->c()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1

    .line 17
    :cond_0
    invoke-virtual {p2}, Le/f/a/b/c/a;->a()I

    move-result p2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Le/f/a/b/c/e;->a(Landroid/content/Context;II)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;
    .locals 0

    .line 13
    invoke-super {p0, p1, p2, p3}, Le/f/a/b/c/f;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final a()Ljava/lang/String;
    .locals 2

    .line 8
    sget-object v0, Le/f/a/b/c/e;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Le/f/a/b/c/e;->b:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a(I)Ljava/lang/String;
    .locals 0

    .line 18
    invoke-super {p0, p1}, Le/f/a/b/c/f;->a(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;)V
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x14
    .end annotation

    const/16 p3, 0x12

    if-ne p2, p3, :cond_0

    .line 40
    invoke-virtual {p0, p1}, Le/f/a/b/c/e;->b(Landroid/content/Context;)V

    return-void

    :cond_0
    if-nez p4, :cond_2

    const/4 p1, 0x6

    if-ne p2, p1, :cond_1

    const-string p1, "GoogleApiAvailability"

    const-string p2, "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead."

    .line 41
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void

    .line 42
    :cond_2
    invoke-static {p1, p2}, Le/f/a/b/c/m/c;->d(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-static {p1, p2}, Le/f/a/b/c/m/c;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "notification"

    .line 45
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationManager;

    .line 46
    new-instance v3, Lc/h/e/c0$a;

    invoke-direct {v3, p1}, Lc/h/e/c0$a;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x1

    .line 47
    invoke-virtual {v3, v4}, Lc/h/e/c0$a;->c(Z)Lc/h/e/c0$a;

    .line 48
    invoke-virtual {v3, v4}, Lc/h/e/c0$a;->a(Z)Lc/h/e/c0$a;

    .line 49
    invoke-virtual {v3, p3}, Lc/h/e/c0$a;->b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    new-instance p3, Lc/h/e/y;

    invoke-direct {p3}, Lc/h/e/y;-><init>()V

    .line 50
    invoke-virtual {p3, v0}, Lc/h/e/y;->a(Ljava/lang/CharSequence;)Lc/h/e/y;

    invoke-virtual {v3, p3}, Lc/h/e/c0$a;->a(Lc/h/e/d0;)Lc/h/e/c0$a;

    .line 51
    invoke-static {p1}, Le/f/a/b/c/p/e;->b(Landroid/content/Context;)Z

    move-result p3

    const/4 v5, 0x2

    if-eqz p3, :cond_4

    .line 52
    invoke-static {}, Le/f/a/b/c/p/h;->e()Z

    move-result p3

    invoke-static {p3}, Le/f/a/b/c/m/h;->b(Z)V

    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p3

    iget p3, p3, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-virtual {v3, p3}, Lc/h/e/c0$a;->e(I)Lc/h/e/c0$a;

    .line 54
    invoke-virtual {v3, v5}, Lc/h/e/c0$a;->d(I)Lc/h/e/c0$a;

    .line 55
    invoke-static {p1}, Le/f/a/b/c/p/e;->c(Landroid/content/Context;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 56
    sget p3, Le/f/a/b/a/a;->common_full_open_on_phone:I

    sget v0, Le/f/a/b/a/b;->common_open_on_phone:I

    .line 57
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-virtual {v3, p3, v0, p4}, Lc/h/e/c0$a;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lc/h/e/c0$a;

    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {v3, p4}, Lc/h/e/c0$a;->a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;

    goto :goto_0

    :cond_4
    const p3, 0x108008a

    .line 60
    invoke-virtual {v3, p3}, Lc/h/e/c0$a;->e(I)Lc/h/e/c0$a;

    sget p3, Le/f/a/b/a/b;->common_google_play_services_notification_ticker:I

    .line 61
    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v3, p3}, Lc/h/e/c0$a;->c(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Lc/h/e/c0$a;->b(J)Lc/h/e/c0$a;

    .line 63
    invoke-virtual {v3, p4}, Lc/h/e/c0$a;->a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;

    .line 64
    invoke-virtual {v3, v0}, Lc/h/e/c0$a;->a(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    .line 65
    :goto_0
    invoke-static {}, Le/f/a/b/c/p/h;->h()Z

    move-result p3

    if-eqz p3, :cond_7

    .line 66
    invoke-static {}, Le/f/a/b/c/p/h;->h()Z

    move-result p3

    invoke-static {p3}, Le/f/a/b/c/m/h;->b(Z)V

    .line 67
    invoke-virtual {p0}, Le/f/a/b/c/e;->a()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_6

    const-string p3, "com.google.android.gms.availability"

    .line 68
    invoke-virtual {v2, p3}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p4

    .line 69
    invoke-static {p1}, Le/f/a/b/c/m/c;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    if-nez p4, :cond_5

    .line 70
    new-instance p4, Landroid/app/NotificationChannel;

    const/4 v0, 0x4

    invoke-direct {p4, p3, p1, v0}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v2, p4}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    goto :goto_1

    .line 71
    :cond_5
    invoke-virtual {p4}, Landroid/app/NotificationChannel;->getName()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 72
    invoke-virtual {p4, p1}, Landroid/app/NotificationChannel;->setName(Ljava/lang/CharSequence;)V

    .line 73
    invoke-virtual {v2, p4}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 74
    :cond_6
    :goto_1
    invoke-virtual {v3, p3}, Lc/h/e/c0$a;->a(Ljava/lang/String;)Lc/h/e/c0$a;

    .line 75
    :cond_7
    invoke-virtual {v3}, Lc/h/e/c0$a;->a()Landroid/app/Notification;

    move-result-object p1

    if-eq p2, v4, :cond_8

    if-eq p2, v5, :cond_8

    const/4 p3, 0x3

    if-eq p2, p3, :cond_8

    const p2, 0x9b6d

    goto :goto_2

    :cond_8
    const/16 p2, 0x28c4

    .line 76
    sget-object p3, Le/f/a/b/c/h;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p4, 0x0

    invoke-virtual {p3, p4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 77
    :goto_2
    invoke-virtual {v2, p2, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public final a(Landroid/content/Context;Le/f/a/b/c/a;I)Z
    .locals 2

    .line 4
    invoke-virtual {p0, p1, p2}, Le/f/a/b/c/e;->a(Landroid/content/Context;Le/f/a/b/c/a;)Landroid/app/PendingIntent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p2}, Le/f/a/b/c/a;->a()I

    move-result p2

    const/4 v1, 0x0

    .line 6
    invoke-static {p1, v0, p3}, Lcom/google/android/gms/common/api/GoogleApiActivity;->a(Landroid/content/Context;Landroid/app/PendingIntent;I)Landroid/app/PendingIntent;

    move-result-object p3

    .line 7
    invoke-virtual {p0, p1, p2, v1, p3}, Le/f/a/b/c/e;->a(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Landroid/content/Context;)V
    .locals 3

    .line 7
    new-instance v0, Le/f/a/b/c/d;

    invoke-direct {v0, p0, p1}, Le/f/a/b/c/d;-><init>(Le/f/a/b/c/e;Landroid/content/Context;)V

    const/4 p1, 0x1

    const-wide/32 v1, 0x1d4c0

    .line 8
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public b(Landroid/content/Context;I)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "n"

    .line 4
    invoke-virtual {p0, p1, p2, v0, v1}, Le/f/a/b/c/f;->a(Landroid/content/Context;IILjava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, p1, p2, v1, v0}, Le/f/a/b/c/e;->a(Landroid/content/Context;ILjava/lang/String;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public final b(I)Z
    .locals 0

    .line 6
    invoke-super {p0, p1}, Le/f/a/b/c/f;->b(I)Z

    move-result p1

    return p1
.end method

.method public b(Landroid/app/Activity;IILandroid/content/DialogInterface$OnCancelListener;)Z
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Le/f/a/b/c/e;->a(Landroid/app/Activity;IILandroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string p3, "GooglePlayServicesErrorDialog"

    .line 3
    invoke-static {p1, p2, p3, p4}, Le/f/a/b/c/e;->a(Landroid/app/Activity;Landroid/app/Dialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    const/4 p1, 0x1

    return p1
.end method
