.class public Le/h/b/a/q/a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/widget/PackIdWidgetService$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    const-string v0, "zoneId"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    const-string v1, "contactlessId"

    .line 2
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    const-string v2, "rssiLevel"

    const/4 v3, 0x0

    .line 3
    invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 4
    invoke-static {}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/h/b/a/m/d;

    .line 5
    invoke-virtual {v3}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-virtual {v4, v1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-virtual {v4, v0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 6
    invoke-static {}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->values()[Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object v4

    aget-object v4, v4, p2

    invoke-virtual {v3, v4}, Le/h/b/a/m/d;->a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    const-string v3, "PackIdWidgetItemFactory"

    const-string v4, "Update widget"

    .line 7
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    invoke-static {p1}, Le/h/b/a/q/d;->c(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    return-void
.end method
