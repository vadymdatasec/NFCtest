.class public Le/h/b/a/q/c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/orange/hce/proto/widget/PackIdWidgetService$b;


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/widget/PackIdWidgetService$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/h/b/a/q/c;->a:Lcom/orange/hce/proto/widget/PackIdWidgetService$b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V

    .line 2
    iget-object p2, p0, Le/h/b/a/q/c;->a:Lcom/orange/hce/proto/widget/PackIdWidgetService$b;

    invoke-static {}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->b()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    new-instance v1, Le/h/b/a/q/b;

    invoke-direct {v1, p0, p1}, Le/h/b/a/q/b;-><init>(Le/h/b/a/q/c;Le/h/b/a/m/d;)V

    invoke-static {p2, p1, v0, p3, v1}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Lcom/orange/hce/proto/widget/PackIdWidgetService$b;Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    const-string v0, "eventType"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const-string v1, "zoneId"

    .line 2
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lfr/mbs/binary/Octets;

    const-string v2, "contactlessId"

    .line 3
    invoke-virtual {p2, v2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Lfr/mbs/binary/Octets;

    const-string v3, "message"

    .line 4
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "timeout"

    .line 5
    invoke-virtual {p2, v4}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    .line 6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "received transaction event "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " for contactlessId "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " and zoneId "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "PackIdWidgetItemFactory"

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_4

    .line 7
    invoke-static {}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/h/b/a/m/d;

    .line 8
    invoke-virtual {v5}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v6

    invoke-virtual {v6, v2}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v6

    invoke-virtual {v6, v1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 9
    sget-object v6, Lcom/orange/hce/proto/widget/PackIdWidgetService$a;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    const/4 v7, 0x1

    if-eq v6, v7, :cond_3

    const/4 v7, 0x2

    const/16 v8, 0xbb8

    if-eq v6, v7, :cond_2

    const/4 v7, 0x3

    if-eq v6, v7, :cond_1

    const/4 v7, 0x4

    if-eq v6, v7, :cond_1

    const/4 v7, 0x5

    if-eq v6, v7, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v5, v3}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V

    .line 11
    sget-object v6, Le/h/b/a/m/i;->e:Le/h/b/a/m/i;

    invoke-virtual {v6, v3}, Le/h/b/a/m/i;->a(Ljava/lang/String;)Le/h/b/a/m/i;

    invoke-virtual {p0, v5, v6, v8}, Le/h/b/a/q/c;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Le/h/b/a/q/d;->c(Landroid/content/Context;)V

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {v5, v3}, Le/h/b/a/m/d;->b(Ljava/lang/String;)V

    .line 14
    sget-object v6, Le/h/b/a/m/i;->f:Le/h/b/a/m/i;

    invoke-virtual {v6, v3}, Le/h/b/a/m/i;->a(Ljava/lang/String;)Le/h/b/a/m/i;

    invoke-virtual {p0, v5, v6, v8}, Le/h/b/a/q/c;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Le/h/b/a/q/d;->c(Landroid/content/Context;)V

    goto :goto_0

    .line 16
    :cond_3
    sget-object v6, Le/h/b/a/m/i;->g:Le/h/b/a/m/i;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    add-int/lit16 v7, v7, 0x3e8

    invoke-virtual {p0, v5, v6, v7}, Le/h/b/a/q/c;->a(Le/h/b/a/m/d;Le/h/b/a/m/i;I)V

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Le/h/b/a/q/d;->c(Landroid/content/Context;)V

    goto :goto_0

    :cond_4
    return-void
.end method
