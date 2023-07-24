.class public final enum Le/h/d/a/a/r/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/h/d/a/a/r/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Le/h/d/a/a/r/b;

.field public static final enum g:Le/h/d/a/a/r/b;

.field public static final enum h:Le/h/d/a/a/r/b;

.field public static final enum i:Le/h/d/a/a/r/b;

.field public static final enum j:Le/h/d/a/a/r/b;

.field public static final enum k:Le/h/d/a/a/r/b;

.field public static final enum l:Le/h/d/a/a/r/b;

.field public static final synthetic m:[Le/h/d/a/a/r/b;


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v7, Le/h/d/a/a/r/b;

    sget v4, Le/h/d/a/a/c;->service_packid_channel_name:I

    sget v5, Le/h/d/a/a/c;->service_packid_channel_description:I

    const-string v1, "servicePackId"

    const/4 v2, 0x0

    const v3, 0x15c91ef8

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Le/h/d/a/a/r/b;-><init>(Ljava/lang/String;IIIIZ)V

    sput-object v7, Le/h/d/a/a/r/b;->f:Le/h/d/a/a/r/b;

    .line 2
    new-instance v0, Le/h/d/a/a/r/b;

    sget v12, Le/h/d/a/a/c;->service_ble_channel_name:I

    sget v13, Le/h/d/a/a/c;->service_ble_channel_description:I

    const-string v9, "serviceBle"

    const/4 v10, 0x1

    const v11, 0x15c92344

    const/4 v14, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Le/h/d/a/a/r/b;-><init>(Ljava/lang/String;IIIIZ)V

    sput-object v0, Le/h/d/a/a/r/b;->g:Le/h/d/a/a/r/b;

    .line 3
    new-instance v0, Le/h/d/a/a/r/b;

    sget v5, Le/h/d/a/a/c;->service_nfc_channel_name:I

    sget v6, Le/h/d/a/a/c;->service_nfc_channel_description:I

    const-string v2, "serviceNfc"

    const/4 v3, 0x2

    const v4, 0x15c92345

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Le/h/d/a/a/r/b;-><init>(Ljava/lang/String;IIIIZ)V

    sput-object v0, Le/h/d/a/a/r/b;->h:Le/h/d/a/a/r/b;

    .line 4
    new-instance v0, Le/h/d/a/a/r/b;

    sget v12, Le/h/d/a/a/c;->badge_result_channel_name:I

    sget v13, Le/h/d/a/a/c;->badge_result_channel_description:I

    const-string v9, "badgeResult"

    const/4 v10, 0x3

    const v11, 0x1a3ac332

    const/4 v14, 0x1

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Le/h/d/a/a/r/b;-><init>(Ljava/lang/String;IIIIZ)V

    sput-object v0, Le/h/d/a/a/r/b;->i:Le/h/d/a/a/r/b;

    .line 5
    new-instance v0, Le/h/d/a/a/r/b;

    sget v5, Le/h/d/a/a/c;->transaction_channel_name:I

    sget v6, Le/h/d/a/a/c;->transaction_channel_description:I

    const-string v2, "transaction"

    const/4 v3, 0x4

    const v4, 0x224f1cce

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Le/h/d/a/a/r/b;-><init>(Ljava/lang/String;IIIIZ)V

    sput-object v0, Le/h/d/a/a/r/b;->j:Le/h/d/a/a/r/b;

    .line 6
    new-instance v0, Le/h/d/a/a/r/b;

    sget v12, Le/h/d/a/a/c;->zone_detection_name:I

    sget v13, Le/h/d/a/a/c;->zone_detection_description:I

    const-string v9, "zoneDetection"

    const/4 v10, 0x5

    const v11, 0x1a700cf6

    const/4 v14, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Le/h/d/a/a/r/b;-><init>(Ljava/lang/String;IIIIZ)V

    sput-object v0, Le/h/d/a/a/r/b;->k:Le/h/d/a/a/r/b;

    .line 7
    new-instance v0, Le/h/d/a/a/r/b;

    sget v5, Le/h/d/a/a/c;->summary_channel_name:I

    sget v6, Le/h/d/a/a/c;->summary_channel_description:I

    const-string v2, "summary"

    const/4 v3, 0x6

    const v4, 0x2dd7a83b

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Le/h/d/a/a/r/b;-><init>(Ljava/lang/String;IIIIZ)V

    sput-object v0, Le/h/d/a/a/r/b;->l:Le/h/d/a/a/r/b;

    const/4 v1, 0x7

    new-array v1, v1, [Le/h/d/a/a/r/b;

    .line 8
    sget-object v2, Le/h/d/a/a/r/b;->f:Le/h/d/a/a/r/b;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Le/h/d/a/a/r/b;->g:Le/h/d/a/a/r/b;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Le/h/d/a/a/r/b;->h:Le/h/d/a/a/r/b;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, Le/h/d/a/a/r/b;->i:Le/h/d/a/a/r/b;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    sget-object v2, Le/h/d/a/a/r/b;->j:Le/h/d/a/a/r/b;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    sget-object v2, Le/h/d/a/a/r/b;->k:Le/h/d/a/a/r/b;

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v2, 0x6

    aput-object v0, v1, v2

    sput-object v1, Le/h/d/a/a/r/b;->m:[Le/h/d/a/a/r/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIIZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Le/h/d/a/a/r/b;->d:I

    .line 3
    iput p4, p0, Le/h/d/a/a/r/b;->b:I

    .line 4
    iput p5, p0, Le/h/d/a/a/r/b;->c:I

    .line 5
    iput-boolean p6, p0, Le/h/d/a/a/r/b;->e:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/h/d/a/a/r/b;
    .locals 1

    .line 1
    const-class v0, Le/h/d/a/a/r/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/h/d/a/a/r/b;

    return-object p0
.end method

.method public static values()[Le/h/d/a/a/r/b;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/r/b;->m:[Le/h/d/a/a/r/b;

    invoke-virtual {v0}, [Le/h/d/a/a/r/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/h/d/a/a/r/b;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Le/h/d/a/a/r/b;->d:I

    return v0
.end method

.method public a(Landroid/content/Context;)Landroid/app/Notification;
    .locals 2

    .line 21
    invoke-static {p1}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isBluetoothEnabled(Landroid/content/Context;)Z

    move-result v0

    invoke-static {p1}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isNfcEnabled(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;ZZ)Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/Context;ZZ)Landroid/app/Notification;
    .locals 6

    .line 22
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.action.SHOW_BADGE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/high16 v2, 0x4000000

    invoke-static {p1, v1, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 23
    invoke-static {p1}, Le/h/a/a/a/a/a;->a(Landroid/content/Context;)Le/h/a/a/a/a/a;

    move-result-object v1

    if-eqz p2, :cond_0

    .line 24
    sget v2, Le/h/d/a/a/c;->packid_ble_service_title_ON:I

    goto :goto_0

    :cond_0
    sget v2, Le/h/d/a/a/c;->packid_ble_service_title_OFF:I

    :goto_0
    invoke-virtual {v1, v2}, Le/h/a/a/a/a/a;->a(I)Ljava/lang/String;

    move-result-object v2

    if-eqz p3, :cond_1

    .line 25
    sget v3, Le/h/d/a/a/c;->packid_nfc_service_title_ON:I

    goto :goto_1

    :cond_1
    sget v3, Le/h/d/a/a/c;->packid_nfc_service_title_OFF:I

    :goto_1
    invoke-virtual {v1, v3}, Le/h/a/a/a/a/a;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz p2, :cond_2

    .line 26
    sget p2, Le/h/d/a/a/c;->packid_ble_service_content_ON:I

    goto :goto_2

    :cond_2
    sget p2, Le/h/d/a/a/c;->packid_ble_service_content_OFF:I

    :goto_2
    invoke-virtual {v1, p2}, Le/h/a/a/a/a/a;->a(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p3, :cond_3

    .line 27
    sget p3, Le/h/d/a/a/c;->packid_nfc_service_content_ON:I

    goto :goto_3

    :cond_3
    sget p3, Le/h/d/a/a/c;->packid_nfc_service_content_OFF:I

    :goto_3
    invoke-virtual {v1, p3}, Le/h/a/a/a/a/a;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 28
    sget-object v4, Le/h/d/a/a/r/b;->f:Le/h/d/a/a/r/b;

    sget v5, Le/h/d/a/a/c;->packid_service_title:I

    .line 29
    invoke-virtual {v1, v5}, Le/h/a/a/a/a/a;->a(I)Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " - "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\n"

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 30
    invoke-virtual {v4, p1, v1, v2, p2}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc/h/e/c0$a;

    move-result-object p1

    .line 31
    invoke-virtual {p1, v0}, Lc/h/e/c0$a;->a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;

    .line 32
    invoke-virtual {p1}, Lc/h/e/c0$a;->a()Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc/h/e/c0$a;
    .locals 1

    .line 2
    new-instance v0, Lc/h/e/y;

    invoke-direct {v0}, Lc/h/e/y;-><init>()V

    .line 3
    invoke-virtual {v0, p2}, Lc/h/e/y;->c(Ljava/lang/CharSequence;)Lc/h/e/y;

    .line 4
    invoke-virtual {v0, p3}, Lc/h/e/y;->b(Ljava/lang/CharSequence;)Lc/h/e/y;

    .line 5
    invoke-virtual {v0, p4}, Lc/h/e/y;->a(Ljava/lang/CharSequence;)Lc/h/e/y;

    .line 6
    new-instance p2, Lc/h/e/c0$a;

    invoke-virtual {p0}, Le/h/d/a/a/r/b;->b()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lc/h/e/c0$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 7
    sget p3, Le/h/d/a/a/b;->ic_notification_icon:I

    invoke-virtual {p2, p3}, Lc/h/e/c0$a;->e(I)Lc/h/e/c0$a;

    iget p3, p0, Le/h/d/a/a/r/b;->d:I

    .line 8
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lc/h/e/c0$a;->c(Ljava/lang/String;)Lc/h/e/c0$a;

    const/4 p3, 0x2

    .line 9
    invoke-virtual {p2, p3}, Lc/h/e/c0$a;->d(I)Lc/h/e/c0$a;

    .line 10
    invoke-virtual {p2, v0}, Lc/h/e/c0$a;->a(Lc/h/e/d0;)Lc/h/e/c0$a;

    const-string p3, "com.orange.oab.contactless.packid.intent.PackIdNotification"

    .line 11
    invoke-virtual {p2, p3}, Lc/h/e/c0$a;->b(Ljava/lang/String;)Lc/h/e/c0$a;

    .line 12
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x16

    if-gt p3, p4, :cond_0

    .line 13
    sget p3, Le/h/d/a/a/c;->app_name:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lc/h/e/c0$a;->b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    :cond_0
    return-object p2
.end method

.method public a(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "notification"

    .line 19
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    if-eqz p1, :cond_0

    .line 20
    invoke-virtual {p1, p2}, Landroid/app/NotificationManager;->cancel(I)V

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;Landroid/app/Notification;)V
    .locals 1

    .line 14
    iget v0, p0, Le/h/d/a/a/r/b;->d:I

    invoke-virtual {p0, p1, p2, v0}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;Landroid/app/Notification;I)V

    return-void
.end method

.method public a(Landroid/content/Context;Landroid/app/Notification;I)V
    .locals 2

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sending notification on channel "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.notif"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "notification"

    .line 16
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    if-eqz v0, :cond_0

    .line 17
    invoke-virtual {v0, p3, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/r/b;->h(Landroid/content/Context;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.orange.oab.contactless.packid.intent.PackIdNotification."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/h/d/a/a/r/b;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 4

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Landroid/app/NotificationChannel;

    invoke-virtual {p0}, Le/h/d/a/a/r/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Le/h/d/a/a/r/b;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 4
    invoke-virtual {p0, p1}, Le/h/d/a/a/r/b;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 5
    iget-boolean v1, p0, Le/h/d/a/a/r/b;->e:Z

    invoke-virtual {v0, v1}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 6
    const-class v1, Landroid/app/NotificationManager;

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    if-eqz p1, :cond_0

    .line 7
    invoke-virtual {p1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget v0, p0, Le/h/d/a/a/r/b;->d:I

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;I)V

    return-void
.end method

.method public d(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Le/h/d/a/a/r/b;->c:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Le/h/d/a/a/r/b;->b:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroid/content/Context;)Lc/h/e/c0$a;
    .locals 2

    .line 1
    new-instance v0, Lc/h/e/c0$a;

    invoke-virtual {p0}, Le/h/d/a/a/r/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lc/h/e/c0$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sget p1, Le/h/d/a/a/b;->ic_notification_icon:I

    .line 2
    invoke-virtual {v0, p1}, Lc/h/e/c0$a;->e(I)Lc/h/e/c0$a;

    iget p1, p0, Le/h/d/a/a/r/b;->d:I

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc/h/e/c0$a;->c(Ljava/lang/String;)Lc/h/e/c0$a;

    const/4 p1, 0x2

    .line 4
    invoke-virtual {v0, p1}, Lc/h/e/c0$a;->d(I)Lc/h/e/c0$a;

    const-string p1, "com.orange.oab.contactless.packid.intent.PackIdNotification"

    .line 5
    invoke-virtual {v0, p1}, Lc/h/e/c0$a;->b(Ljava/lang/String;)Lc/h/e/c0$a;

    return-object v0
.end method

.method public g(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;)Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;Landroid/app/Notification;)V

    return-void
.end method

.method public final h(Landroid/content/Context;)V
    .locals 4

    .line 1
    sget-object v0, Le/h/d/a/a/r/b;->l:Le/h/d/a/a/r/b;

    if-eq p0, v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-le v0, v1, :cond_0

    .line 2
    sget-object v0, Le/h/d/a/a/r/b;->l:Le/h/d/a/a/r/b;

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/b;->f(Landroid/content/Context;)Lc/h/e/c0$a;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.orange.oab.contactless.packid.action.SHOW_BADGE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    const/high16 v3, 0x4000000

    .line 3
    invoke-static {p1, v2, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/h/e/c0$a;->a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lc/h/e/c0$a;->b(Z)Lc/h/e/c0$a;

    invoke-virtual {v0}, Lc/h/e/c0$a;->a()Landroid/app/Notification;

    move-result-object v0

    .line 5
    sget-object v1, Le/h/d/a/a/r/b;->l:Le/h/d/a/a/r/b;

    invoke-virtual {v1, p1, v0}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;Landroid/app/Notification;)V

    :cond_0
    return-void
.end method
