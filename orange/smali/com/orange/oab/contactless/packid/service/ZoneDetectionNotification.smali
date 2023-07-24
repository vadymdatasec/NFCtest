.class public Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->c:Ljava/util/Map;

    .line 4
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Landroid/content/SharedPreferences;
    .locals 1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static isAutorised(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string p1, "notificationAutorised"

    const/4 p2, 0x1

    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static saveAutorisedValue(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string p1, "notificationAutorised"

    invoke-interface {p0, p1, p3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 2

    .line 30
    sget-object v0, Le/h/d/a/a/r/b;->k:Le/h/d/a/a/r/b;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;I)V

    .line 31
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 8

    .line 5
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)I

    move-result v1

    .line 7
    iget-object v2, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->c:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 9
    iget-object v2, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b:Ljava/util/List;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.orange.oab.contactless.packid.action.START_BADGE_TRANSACTION"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "contactlessId"

    .line 11
    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v4, "zoneId"

    .line 12
    invoke-virtual {v2, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 13
    iget-object v5, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a:Landroid/content/Context;

    const/high16 v6, 0x4000000

    invoke-static {v5, v1, v2, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 14
    new-instance v5, Landroid/content/Intent;

    const-string v7, "com.orange.oab.contactless.packid.action.DISMISSED_NOTIFICATION"

    invoke-direct {v5, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v5, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 16
    invoke-virtual {v5, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 17
    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a:Landroid/content/Context;

    add-int/lit8 v0, v1, 0x1

    invoke-static {p1, v0, v5, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    .line 18
    sget-object v0, Le/h/d/a/a/r/b;->k:Le/h/d/a/a/r/b;

    iget-object v3, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a:Landroid/content/Context;

    invoke-virtual {v0, v3}, Le/h/d/a/a/r/b;->f(Landroid/content/Context;)Lc/h/e/c0$a;

    move-result-object v0

    .line 19
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lc/h/e/c0$a;->b(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    iget-object p2, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a:Landroid/content/Context;

    sget v3, Le/h/d/a/a/c;->click_to_badge:I

    .line 20
    invoke-virtual {p2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lc/h/e/c0$a;->a(Ljava/lang/CharSequence;)Lc/h/e/c0$a;

    .line 21
    invoke-virtual {v0, v2}, Lc/h/e/c0$a;->a(Landroid/app/PendingIntent;)Lc/h/e/c0$a;

    iget-object p2, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a:Landroid/content/Context;

    .line 22
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v2, Le/h/d/a/a/b;->button_bluetooth:I

    invoke-static {p2, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-virtual {v0, p2}, Lc/h/e/c0$a;->b(Landroid/graphics/Bitmap;)Lc/h/e/c0$a;

    .line 23
    invoke-virtual {v0, p1}, Lc/h/e/c0$a;->b(Landroid/app/PendingIntent;)Lc/h/e/c0$a;

    sget p1, Le/h/d/a/a/b;->ic_notification_icon:I

    .line 24
    invoke-virtual {v0, p1}, Lc/h/e/c0$a;->e(I)Lc/h/e/c0$a;

    .line 25
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc/h/e/c0$a;->b(Ljava/lang/String;)Lc/h/e/c0$a;

    .line 26
    invoke-virtual {v0}, Lc/h/e/c0$a;->a()Landroid/app/Notification;

    move-result-object p1

    .line 27
    sget-object p2, Le/h/d/a/a/r/b;->k:Le/h/d/a/a/r/b;

    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a:Landroid/content/Context;

    invoke-virtual {p2, v0, p1, v1}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;Landroid/app/Notification;I)V

    :cond_0
    return-void
.end method

.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b:Ljava/util/List;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "notificationAutorised"

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)I
    .locals 0

    .line 1
    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->intValue()I

    move-result p1

    return p1
.end method

.method public b()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const/16 v2, 0x1388

    .line 3
    invoke-static {v2}, Le/h/d/a/a/n/t;->a(I)Ljava/util/Date;

    move-result-object v2

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Date;

    invoke-virtual {v3, v2}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final b(I)Z
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a:Landroid/content/Context;

    invoke-static {v1, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->isAutorised(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(I)V

    :cond_0
    return p1
.end method
